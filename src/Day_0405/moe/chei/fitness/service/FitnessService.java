package Day_0405.moe.chei.fitness.service;

import java.util.Scanner;

import Day_0405.moe.chei.fitness.vo.FitnessVO;

public class FitnessService {
    private FitnessVO fvo;
    Scanner scan = new Scanner(System.in);

    public FitnessService() {
        String choice;

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
        System.out.println("         1. 입   력         ");
        System.out.println("         2. 전체 출력       ");
        System.out.println("         3. 조   회         ");
        System.out.println("         4. 삭   제         ");
        System.out.println("         5. 수   정         ");
        System.out.println("         0. 종   료         ");
        System.out.println("----------------------------");
        System.out.print("         선택> ");
    }
    
    public void input() {
        if(fvo != null){
            System.out.println("이미 회원이 등록되어 있습니다.");
            return;
        }
        System.out.print("이름 : ");
        String usrid = scan.nextLine();
        System.out.print("아이디 : ");
        String usrname = scan.nextLine(); 
        System.out.print("키 : ");
        double height = scan.nextDouble();
        System.out.print("몸무게 : ");
        double weight = scan.nextDouble();
        fvo = new FitnessVO(usrid, usrname, height, weight);
    }
    public void output() {
        if(fvo==null){
            System.out.println("등록된 회원이 없습니다.");
            return;
        }
        fvo.output();
    }
    public void selectOne() {
        if(fvo==null){
            System.out.println("등록된 회원이 없습니다.");
            return;
        }
        System.out.print("검색할 아이디를 입력해주세요 : ");
        String tmp = scan.next();
        scan.nextLine();
        if(tmp.equals(fvo.getUsrid())){
            fvo.output();
        }else {
            System.out.println("해당 아이디의 회원이 존재하지 않습니다.");
            return;
        }
    }
    public void delete() {
        if(fvo==null){
            System.out.println("등록된 회원이 없습니다.");
            return;
        }
        System.out.println("정말 탈퇴하시겠습니까? (y/n)");
        String answer = scan.next();
        scan.nextLine();
        if(answer.equals("y")||answer.equals("Y")){
            fvo = null;
            System.out.println("탈퇴가 완료되었습니다.");
        }else {
            System.out.println("탈퇴가 취소되었습니다.");
        }
    }
    public void update() {System.out.println("수정됨");}
}