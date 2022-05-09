package fitness4.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fitness4.FitnessVO;
import fitness4.service.FitnessService;
import fitness4.service.FitnessServiceImpl;

public class FitnessUI {
    Scanner scan = new Scanner(System.in);
    FitnessService service = new FitnessServiceImpl();

    public FitnessUI() {
		String choice;

		while(true) {
			menu();
			choice = scan.nextLine();

			switch(choice) {
			case "1" : input();     break;
			case "2" : output();    break;
			case "3" : selectOne(); break;
			case "4" : delete();    break;
			case "5" : update();    break;
			case "0" : 
				System.out.println("** 프로그램을 종료합니다.");
                ((FitnessServiceImpl)service).setFile();
				return;
			default : System.out.println("err) 메뉴를 다시 선택하세요");
			}
			
		}
	}
	public void menu() {
		System.out.println("===== [피트니스 멤버 관리 프로그램] =====");
		System.out.println("        1. 멤버   등록");
		System.out.println("        2. 멤버 전체 출력");
		System.out.println("        3. 멤버 한명 조회");
		System.out.println("        4. 멤버   삭제");
		System.out.println("        5. 멤버   수정");
		System.out.println("        0. 프로그램 종료");
		System.out.println("---------------------------");
		System.out.print  ("       선택> ");

	}
	
	// 멤버에 대한 정보를 입력
	private void input() {
		// 등록에 필요한 멤버 정보
		System.out.println("\n>>> 회원 정보 입력 <<<");
		FitnessVO member = inputMemberInfo(new FitnessVO(), "input");
		service.regist(member);
        System.out.println("정상적으로 가입되었습니다.");
	}
	
	// 공통부분 입력을 위한 메소드
	private FitnessVO inputMemberInfo(FitnessVO member, String inputType){  // 소설, 잡지
		// 공통 정보
		String usrid;
        String usrname;   
        double height;
        double weight;
				
		System.out.print("> ID : ");
		usrid = scan.nextLine(); 
	
		// 중복 데이터 유무 확인
		if(inputType.equals("input" )) // 입력을 하기 위해 호출시
			if(service.selectById(usrid) != null) {
				System.out.println("** 이미 사용중인 ID입니다.\n");
				return null;
			} 
		else if(inputType.equals("update" ))
			if(service.selectById(usrid) == null) {
				System.out.println("** 해당하는 ID의 멤버가 없습니다.\n");
				return null;
			} 	
		
		System.out.print("> 이름 : ");
		usrname = scan.nextLine(); 
		
		System.out.print("> 키(cm) : ");
		height = Double.parseDouble(scan.nextLine());

        System.out.print("> 몸무게(kg) : ");
		weight = Double.parseDouble(scan.nextLine());
		
		member.setUsrid(usrid);
        member.setUsrname(usrname);
		member.setHeight(height);
		member.setWeight(weight);
		
		return member;
	}

	// 전체 데이터 출력
	private void output() {
		System.out.println(">>> 전체 회원 정보 출력 <<<");
		
		List<FitnessVO> memberList = service.selectAll();
		
		Iterator<FitnessVO> iter = memberList.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());

		System.out.println();
	}
	
	private void update() {
		System.out.println("\n>>> 회원 정보 수정 <<<");
		FitnessVO member = inputMemberInfo(new FitnessVO(), "update");
        service.update(member);
	}
	
	// 도서정보 삭제
	private void delete() {
		String id, answer;
		System.out.println(">>> 멤버 삭제 <<<");
		
		System.out.print("> ID : ");
		id = scan.nextLine();
		
		// 존재여부 확인
		FitnessVO member = service.selectById(id);
		if(member == null) {
			System.out.println("** 해당 아이디의 멤버가 없습니다.");
			return;
		}
		
		System.out.println(member);
		
		System.out.print("** 정말 삭제하시겠습니까? (y/n) "); 
		answer = scan.nextLine();
		
		if(answer.equals("y")) {
			service.delete(id); // 리턴값을 받지 않아도 된다. ==> 
			System.out.println("** 삭제 완료\n");
			return;
		}
		System.out.println("** 삭제 작업이 취소되었습니다.");

	}
	private void selectOne() {
		String id;
		System.out.println(">>> 멤버 정보 조회 <<<");
		
		System.out.print("> ID : ");
		id = scan.nextLine();
		
		FitnessVO member = service.selectById(id);
		if(member == null) {
			System.out.println("** 해당 아이디의 멤버가 없습니다.");
			return;
		}
		
		System.out.println(member);
	}
}
