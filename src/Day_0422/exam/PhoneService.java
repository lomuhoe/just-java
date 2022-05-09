package Day_0422.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PhoneService {
    private Map<String, Phone> phones = new HashMap<>();
    private Scanner scan = new Scanner(System.in);
    private String control, phoneNumber, name;
    private int age;


    public void start() {
        while(true){
            Phone temp;
            System.out.print("1. 등록   2. 조회   3. 전체출력   0. 종료  : ");
            control = scan.nextLine();

            switch (control) {
                case "1":
                    System.out.print("전화번호 : ");
                    phoneNumber = scan.nextLine();
                    System.out.print("이름 : ");
                    name = scan.nextLine();
                    System.out.print("나이 : ");
                    age = scan.nextInt();
                    scan.nextLine();
                    phones.put(phoneNumber, new Phone(phoneNumber, name, age));
                    
                    break;
                case "2":
                    System.out.print("전화번호 : ");
                    phoneNumber = scan.nextLine();
                    temp = phones.get(phoneNumber);
                    if(temp==null){
                        System.out.println("해당 번호의 회원은 존재하지 않습니다.");
                        continue;
                    }
                    printPhone(temp);
                    break;
                case "3":
                    System.out.println("전체 정보");
                    Iterator<String> iter = phones.keySet().iterator();
                    while (iter.hasNext()) {
                        phoneNumber = iter.next();
                        temp = phones.get(phoneNumber);
                        printPhone(temp);
                    }
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    return;
            
                default:
                    System.out.println("정상적인 번호를 입력해 주세요.");
                    break;
            }
        }
    }

    private void printPhone(Phone phone){
        System.out.println(phone.getPhoneNumber() + " / " + phone.getName() + " / " + phone.getName());
    }
}
