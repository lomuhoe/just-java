package hobby;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TradeService {
    // 한글파일 깨지지않게 읽어오는법
    private FileInputStream fis = null;
    private InputStreamReader istreamReader = null;
    private BufferedReader br = null;
    // 한글파일 깨지지않게 저장하는법
    private FileOutputStream fos = null;
    private OutputStreamWriter oStreamWriter = null;
    private BufferedWriter bw = null;

    private Scanner scan = new Scanner(System.in);

    private String[] members = { "", "최인회", "박영훈", "박준모", "김기웅", "김종찬", "유병인", "이승우", "이주학", "장재혁", "정주형" };
    private String[][] content;
    private final String URL = ".\\data\\TestText2.txt";
    private final DecimalFormat df = new DecimalFormat("###,###");

    public void start() {
        readFile();
        String control = "";
        while (!control.equals("9")) {
            System.out.println("어떤 작업을 하시겠습니까?");
            System.out.println("1. 대출     2. 상환     3. 조회     9. 종료");
            control = scan.nextLine();
            switch (control) {
                case "1":
                    System.out.println("빌린놈 빌릴놈 금액을 순서대로 적어주세요");
                    control = scan.nextLine();
                    changesAmount(control, "loan");
                    break;
                case "2":
                    System.out.println("빌린놈 갚을놈 금액을 순서대로 적어주세요");
                    control = scan.nextLine();
                    changesAmount(control, "repayment");
                    break;
                case "3":
                    System.out.println("빚을 조회할 사람의 이름을 입력해주세요");
                    control = scan.nextLine();
                    viewAmount(control);
                    break;
                case "9":
                    System.out.println("프로그램을 종료하겠습니다.");
                    viewContent();
                    writeFile();
                    return;
                default:
                    System.out.println("제대로 숫자를 입력해 주세요.");
                    break;
            }
        }
    }

    private void viewAmount(String control) {
        int location = checkName(control);
        if (location == -1) {
            System.out.println("이름을 제대로 입력해주세요.");
            return;
        }

        // if (members.length - borrowerNumber <= (members.length - reimburserNumber)) {
        // int tempNumber;
        // tempNumber = borrowerNumber;
        // borrowerNumber = reimburserNumber;
        // reimburserNumber = tempNumber;
        // }

        String loanedMoney = members[location] + "(이)가 빌려준 돈\n=========================\n";
        // 11 - 4
        for (int i = 1; i < content.length - location; i++) {
            if (Integer.parseInt(content[i][location]) < 0) {
                loanedMoney += content[i][0] + "에게 " + df.format(-1 * Integer.parseInt(content[i][location])) + "원\n";
            }
        }
        for (int i = 1; i < content[members.length - location].length; i++) {
            if (Integer.parseInt(content[members.length - location][i]) > 0) {
                loanedMoney += content[0][i] + "에게 "
                        + df.format(Integer.parseInt(content[members.length - location][i])) + "원\n";
            }
        }

        if (loanedMoney.equals(members[location] + "(이)가 빌려준 돈\n=========================\n"))
            loanedMoney = members[location] + "(이)가 빌려준 돈이 없습니다\n=========================\n";
        loanedMoney = loanedMoney.substring(0, loanedMoney.length() - 1);

        String borrowedMoney = "\n" + members[location] + "(이)가 빌린 돈\n=========================\n";
        for (int i = 1; i < content.length - location; i++) {
            if (Integer.parseInt(content[i][location]) > 0) {
                borrowedMoney += content[i][0] + "에게 " + df.format(Integer.parseInt(content[i][location])) + "원\n";
            }
        }
        for (int i = 1; i < content[members.length - location].length; i++) {
            if (Integer.parseInt(content[members.length - location][i]) < 0) {
                borrowedMoney += content[0][i] + "에게 "
                        + df.format(-1 * Integer.parseInt(content[members.length - location][i])) + "원\n";
            }
        }

        if (borrowedMoney.equals("\n" + members[location] + "(이)가 빌린 돈\n=========================\n"))
            borrowedMoney = "\n" + members[location] + "(이)가 빌린 돈이 없습니다\n=========================";
        borrowedMoney = borrowedMoney.substring(0, borrowedMoney.length() - 1);
        System.out.println("=========================\n" + loanedMoney + borrowedMoney);
    }

    private void changesAmount(String str, String control) {
        String[] temp = str.split(" ");
        if (temp.length != 3) {
            System.out.println("제대로 입력해주세요.");
            return;
        }

        try {
            // 빌린놈
            String borrower = temp[0];
            int borrowerNumber = checkName(borrower);

            // 빌릴놈
            String reimburser = temp[1];
            int reimburserNumber = checkName(reimburser);

            int price = -1;
            if (temp[2].indexOf("원") >= 0) {
                price = changePrice(temp[2].substring(0, temp[2].indexOf("원")));
            } else {
                price = Integer.parseInt(temp[2]);
            }

            if (borrower.equals(reimburser)) {
                System.out.println("오류발생! 앞과 뒤의 사람이 같음!");
                return;
            }

            if (borrowerNumber == -1 || reimburserNumber == -1 || price == -1) {
                System.out.println("오류발생! 빌리지 못했음!");
                return;
            }

            if (members.length - borrowerNumber <= (members.length - reimburserNumber)) {
                int tempNumber;
                tempNumber = borrowerNumber;
                borrowerNumber = reimburserNumber;
                reimburserNumber = tempNumber;
                if (control.equals("loan")) {
                    System.out.printf("%s(이)가 %s에게 %s원 빌렸습니다.\n", borrower, reimburser, df.format(price));

                    content[members.length - reimburserNumber][borrowerNumber] = Integer
                            .toString((Integer.parseInt(content[members.length - reimburserNumber][borrowerNumber])
                                    - price));
                } else if (control.equals("repayment")) {
                    System.out.printf("%s(이)가 %s에게 %s원 상환했습니다.\n", borrower, reimburser, df.format(price));
                    content[members.length - reimburserNumber][borrowerNumber] = Integer
                            .toString((Integer.parseInt(content[members.length - reimburserNumber][borrowerNumber])
                                    + price));
                }
            } else {
                if (control.equals("loan")) {
                    System.out.printf("%s(이)가 %s에게 %s원 빌렸습니다.\n", borrower, reimburser, df.format(price));

                    content[members.length - reimburserNumber][borrowerNumber] = Integer
                            .toString((Integer.parseInt(content[members.length - reimburserNumber][borrowerNumber])
                                    + price));
                } else if (control.equals("repayment")) {
                    System.out.printf("%s(이)가 %s에게 %s원 상환했습니다.\n", borrower, reimburser, df.format(price));
                    content[members.length - reimburserNumber][borrowerNumber] = Integer
                            .toString((Integer.parseInt(content[members.length - reimburserNumber][borrowerNumber])
                                    - price));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int changePrice(String price) {
        int result = 0;
        int tmpResult = 0;
        int num = 0;
        final String NUMBER = "영일이삼사오육칠팔구";
        final String UNIT = "십백천만";
        final long[] UNIT_NUM = { 10, 100, 1000, 10000 };
        StringTokenizer st = new StringTokenizer(price, UNIT, true);

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            // 숫자인지, 단위(UNIT)인지 확인
            int check = NUMBER.indexOf(token);
            if (check == -1) { // 단위인 경우
                if ("만".indexOf(token) == -1) {
                    tmpResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
                } else {
                    tmpResult += num;
                    result += (tmpResult != 0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
                    tmpResult = 0;
                }
                num = 0;
            } else { // 숫자인 경우
                num = check;
            }
        }

        return result + tmpResult + num;
    }

    private int checkName(String name) {
        if (name.indexOf("이내") >= 0 || name.indexOf("인회") >= 0) {
            return 1;
        } else if (name.indexOf("영훈") >= 0) {
            return 2;
        } else if (name.indexOf("준모") >= 0) {
            return 3;
        } else if (name.indexOf("기웅") >= 0 || name.indexOf("게이") >= 0) {
            return 4;
        } else if (name.indexOf("종찬") >= 0) {
            return 5;
        } else if (name.indexOf("병인") >= 0) {
            return 6;
        } else if (name.indexOf("승우") >= 0) {
            return 7;
        } else if (name.indexOf("주학") >= 0 || name.indexOf("주캌") >= 0 || name.indexOf("주칵") >= 0) {
            return 8;
        } else if (name.indexOf("재혁") >= 0 || name.indexOf("재쓰") >= 0) {
            return 9;
        } else if (name.indexOf("주형") >= 0 || name.indexOf("주작") >= 0) {
            return 10;
        } else {
            return -1;
        }
    }

    private void readFile() {
        String str;
        String txt = "";
        try {
            fis = new FileInputStream(URL);
            istreamReader = new InputStreamReader(fis);
            br = new BufferedReader(istreamReader);

            while ((str = br.readLine()) != null) {
                txt = txt.concat(str);
            }

            String[] line = txt.split(";");
            this.content = new String[line.length][];
            for (int i = 0; i < line.length; i++) {
                content[i] = line[i].split(",");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void viewContent() {
        for (int i = 0; i < content.length; i++) {
            for (int j = 0; j < content[i].length; j++) {
                if (j == content[i].length - 1)
                    System.out.print(content[i][j] + "\n");
                else
                    System.out.print(content[i][j] + "      ");
            }
        }
    }

    private void writeFile() {
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(URL)));

            for (int i = 0; i < content.length; i++) {
                for (int j = 0; j < content[i].length; j++) {
                    if (j == content[i].length - 1)
                        bw.write(content[i][j] + ";\n");
                    else
                        bw.write(content[i][j] + ",");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
