package TeamExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class RealEstateService {
    private Map<String,RealEstate> realEstates = new HashMap<>();
    private Iterator<String> rIterator;
    private Scanner scan = new Scanner(System.in);

    public void start(){
        String control="0";
        while (true) {
            menu();
            control = scan.nextLine();
            switch (control) {
                case "1":
                    input();
                    break;
                case "2":
                    select();
                    break;
                case "3":
                    update();
                    break;
                case "4":
                    delete();
                    break;
                case "5":
                    selectAll();
                    break;
                case "9":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("정확한 숫자를 입력해 주세요.");
                    break;
            }
        }
    }

    private void delete() {
        String address;
        System.out.print("삭제 물건의 주소를 정확히 입력해 주세요 : ");
        address = scan.nextLine();
        RealEstate tempEstate = realEstates.get(address);
        if(tempEstate == null){
            System.out.println("해당 주소의 물건이 존재하지 않습니다.");
            return;
        }
        realEstates.remove(address);
        System.out.println("정상 삭제 되었습니다.");
    }

    private void selectAll() {
        Iterator rIterator = realEstates.keySet().iterator();
        while (rIterator.hasNext()) {
            RealEstate tempEstate = realEstates.get(rIterator.next());
            printEstate(tempEstate);
        }
    }

    private void update() {
        String address;
        System.out.print("수정 물건의 주소를 정확히 입력해 주세요 : ");
        address = scan.nextLine();
        RealEstate tempEstate = realEstates.get(address);
        if(tempEstate == null){
            System.out.println("해당 주소의 물건이 존재하지 않습니다.");
            return;
        }
        printEstate(tempEstate);
        if(tempEstate instanceof BuyingAndSelling){
            System.out.print("수정 매매 가격 : ");
            ((BuyingAndSelling)tempEstate).setPrice(scan.nextInt());
            scan.nextLine();
        }
        if(tempEstate instanceof Charter){
            System.out.print("수정 임대 보증금 : ");
            ((Charter)tempEstate).setDepositMoney(scan.nextInt());
            scan.nextLine();
        }
        if(tempEstate instanceof MonthlyRent){
            ((Charter)tempEstate).setDepositMoney(scan.nextInt());
            System.out.print("수정 월 임대료 : ");
            scan.nextLine();
        }
    }

    private void select() {
        String control;
        subMenu("select");
        control = scan.nextLine();
        rIterator = realEstates.keySet().iterator();
        while (rIterator.hasNext()) {
            RealEstate tempEstate = realEstates.get(rIterator.next());
            switch (control) {
                case "0":
                    System.out.print("보고싶은 지역을 입력하세요 : ");
                    String address = scan.nextLine(); 
                    if(tempEstate.getAddress().indexOf(address)>=0)
                        printEstate(tempEstate);
                    break;
                case "1":
                    if(tempEstate instanceof BuyingAndSelling)
                        printEstate(tempEstate);
                    break;
                case "2":
                    if(tempEstate instanceof Charter)
                        printEstate(tempEstate);
                    break;
                case "3":
                    if(tempEstate instanceof MonthlyRent)
                        printEstate(tempEstate);
                    break;
                default:
                    System.out.println("정확한 숫자를 입력해 주세요.");
                    break;
            }
        }
    }

    private void input() {
        String control;
        do {
            subMenu("input");
            control = scan.nextLine();
            switch (control) {
                case "1":
                    BuyingAndSelling bAndSelling = (BuyingAndSelling)inputEstate(new BuyingAndSelling());
                    System.out.print("매매 가격 : ");
                    bAndSelling.setPrice(scan.nextInt());
                    scan.nextLine();

                    realEstates.put(bAndSelling.getAddress(), bAndSelling);
                    break;
                case "2":
                    Charter charter = (Charter)inputEstate(new Charter());
                    System.out.print("임대 보증금 : ");
                    charter.setDepositMoney(scan.nextInt());
                    scan.nextLine();

                    realEstates.put(charter.getAddress(), charter);
                    break;
                case "3":
                    MonthlyRent monthlyRent = (MonthlyRent)inputEstate(new MonthlyRent());
                    System.out.print("월 임대료 : ");
                    monthlyRent.setMonthlyRent(scan.nextInt());
                    scan.nextLine();

                    realEstates.put(monthlyRent.getAddress(), monthlyRent);
                    break;
                case "4":
                    System.out.println("취소하셨습니다.");
                    break;
            
                default:
                    System.out.println("정확한 숫자를 입력해 주세요.");
                    break;
            }
        } while (!control.equals("4"));
    }

    private void menu() {
        System.out.println("------------------------------------");
        System.out.println("       부동산 중계 관리 시스템");
        System.out.println("------------------------------------");
        System.out.println("             1. 등록");
        System.out.println("             2. 검색");
        System.out.println("             3. 수정");
        System.out.println("             4. 삭제(거래 완료)");
        System.out.println("             5. 전체 출력");
        System.out.println("             9. 종료");
        System.out.println("------------------------------------");
        System.out.print("메뉴 번호를 입력하세요 > ");
    }

    private void subMenu(String type) {
        System.out.println("------------------------------------");
        System.out.println("       부동산 중계 관리 시스템");
        System.out.println("------------------------------------");
        if(type.equals("input")){
            System.out.println("             1. 매매");
            System.out.println("             2. 전세");
            System.out.println("             3. 월세");
            System.out.println("             4. 상위 메뉴");
        }else if(type.equals("select")){
            System.out.println("             0. 주소로 검색");
            System.out.println("             1. 매매 물건 검색");
            System.out.println("             2. 전세 물건 검색");
            System.out.println("             3. 월세 물건 검색");
        }
        System.out.println("------------------------------------");
        System.out.print("메뉴 번호를 입력하세요 > ");
    }

    private RealEstate inputEstate(RealEstate realEstate){
        System.out.print("주소 : ");
        realEstate.setAddress(scan.nextLine());

        System.out.print("주거형태 : ");
        realEstate.setHousingType(scan.nextLine());

        System.out.print("크기(평) : ");
        realEstate.setSqft(scan.nextInt());
        scan.nextLine();

        return realEstate;
    }

    private void printEstate(RealEstate realEstate){
        if(realEstate instanceof BuyingAndSelling)
            System.out.println("주소 : " + ((BuyingAndSelling)realEstate).getAddress() +
                ", 주거형태 : " + ((BuyingAndSelling)realEstate).getHousingType() +
                ", 크기 : " + ((BuyingAndSelling)realEstate).getSqft() +
                "(평), 매매가격 : " + ((BuyingAndSelling)realEstate).getPrice());
        if(realEstate instanceof Charter)
            System.out.println("주소 : " + ((Charter)realEstate).getAddress() +
                ", 주거형태 : " + ((Charter)realEstate).getHousingType() +
                ", 크기 : " + ((Charter)realEstate).getSqft() +
                "(평), 임대보증금 : " + ((Charter)realEstate).getDepositMoney());
        if(realEstate instanceof MonthlyRent)
            System.out.println("주소 : " + ((MonthlyRent)realEstate).getAddress() +
                ", 주거형태 : " + ((MonthlyRent)realEstate).getHousingType() +
                ", 크기 : " + ((MonthlyRent)realEstate).getSqft() +
                "(평), 월임대료 : " + ((MonthlyRent)realEstate).getMonthlyRent());
    }
}
