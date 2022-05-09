package moe.chei.fitnessv02.service;

import java.util.Scanner;

import moe.chei.fitnessv02.vo.FitnessVO;

public class FitnessService {
    Scanner scan = new Scanner(System.in);
    private FitnessVO[] members;

    public FitnessService(int max) {
        String choice;
        members = new FitnessVO[max];

        while (true) {
            menu();
            choice=scan.next();
            scan.nextLine();

            switch (choice) {
                case "1":input();break;
                case "2":output();break;
                case "3":selectOne();break;
                case "4":delete();break;
                case "5":update();break;
                case "0":System.out.println("프로그램을 종료하겠습니다.");return;
                default:System.out.println("올바른 숫자를 입력해주세요.");
            }
        }
    }

    public void menu() {
        System.out.println("===== [ 관리 프로그램 ] =====");
        System.out.println("         1. 가   입         ");
        System.out.println("         2. 모든 멤버       ");
        System.out.println("         3. 조   회         ");
        System.out.println("         4. 탈   퇴         ");
        System.out.println("         5. 수   정         ");
        System.out.println("         0. 종   료         ");
        System.out.println("----------------------------");
        System.out.print("         선택> ");
    }

    public static int countMember(FitnessVO[] members) {
        int count = 0;
        for(int i=0 ; i<members.length ; i++){
            if(!(members[i]==null)){
                count++;
            }
        }
        return count;
    }

    private boolean checkId(String usrid){
        for(int i=0 ; i<members.length ; i++){
            if(members[i]==null)
                continue;
            if(members[i].getUsrid().equals(usrid)){
                return true;
            }
        }
        return false;
    }
    
    private void input() {
        if(countMember(members)==members.length){
            System.out.println("가입된 멤버가 가득 찼습니다.");
            return;
        }
        
        System.out.print("가입하실 아이디를 입력해 주세요 : ");
        String usrid = scan.next();
        scan.nextLine();

        if(checkId(usrid)){
            System.out.println("이미 등록된 아이디입니다.");
            return;
        }

        for(int i=0 ; i<members.length ; i++){
            if((members[i]==null)){
                System.out.print("이름을 입력해주세요 : ");
                String usrname = scan.nextLine();
                System.out.print("키를 입력해주세요  : ");
                double height = scan.nextDouble();
                System.out.print("몸무게를 입력해주세요 : ");
                double weight = scan.nextDouble();
                members[i] = new FitnessVO(usrid, usrname, height, weight);
                System.out.println("가입이 완료되었습니다.");
                return;
            }
        }
    }

    private void output() {
        if(checkMemberNull())
            return;

        for(int i=0 ; i<members.length ; i++){
            if(members[i] == null)
                continue;
            members[i].output();
        }
    }

    private void selectOne() {
        if(checkMemberNull())
            return;

        System.out.print("어떤 아이디를 찾으시겠습니까? : ");
        String usrid = scan.next();
        scan.nextLine();

        for(int i=0 ; i<members.length ; i++){
            if(members[i] == null)
                continue;
            if(members[i].getUsrid().equals(usrid)){
                members[i].output();
                return;
            }   
        }
    }

    private void delete() {
        if(checkMemberNull())
            return;

        System.out.print("어떤 아이디를 삭제하시겠습니까? : ");
        String usrid = scan.next();
        scan.nextLine();

        for(int i=0 ; i<members.length ; i++){
            if(members[i]==null)
                continue;
            if(members[i].getUsrid().equals(usrid)){
                
                System.out.print("정말로 탈퇴하시겠습니까? (y/n) :");
                String answer = scan.nextLine();
                if(answer.equals("y")||answer.equals("Y")){
                    members[i]=null;
                    return;
                }else {
                    System.out.println("탈퇴를 취소하였습니다.");
                    return;
                }
            }
        }
        System.out.println("해당 아이디의 멤버는 존재하지 않습니다.");
    }

    private void update() {
        if(checkMemberNull())
            return;

        System.out.print("어떤 아이디를 수정하시겠습니까? : ");
        String usrid = scan.next();
        scan.nextLine();

        for(int i=0 ; i<members.length ; i++){
            if(members[i]==null)
                continue;
            if(members[i].getUsrid().equals(usrid)){
                System.out.print(members[i].getUsrname() +"님의 수정할 키를 입력해주세요. : ");
                double height = scan.nextDouble();
                scan.nextLine();

                System.out.print(members[i].getUsrname() +"님의 수정할 몸무게를 입력해주세요. : ");
                double weight = scan.nextDouble();
                scan.nextLine();

                members[i].setHeight(height);
                members[i].setWeight(weight);

                System.out.println(members[i].getUsrname() +"님의 정보가 아래와 같이 변경되었습니다.");
                members[i].output();
                return;
            }
        }
        System.out.println("해당 아이디의 멤버는 존재하지 않습니다.");
    }

    private boolean checkMemberNull(){
        if(countMember(members)==0){
            System.out.println("현재 가입한 멤버가 없습니다.");
            return true;
        }
        return false;
    }
}


