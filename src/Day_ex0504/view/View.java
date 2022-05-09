package Day_ex0504.view;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import Day_ex0504.Service.Service;
import Day_ex0504.Service.ServiceImpl;
import Day_ex0504.vo.Department;
import Day_ex0504.vo.PatientVO;

public class View {
    private Service service = new ServiceImpl();
    private Scanner scan = new Scanner(System.in);
    private final DecimalFormat df = new DecimalFormat("###,###");

	public View() {
		String control;

		while(true) {
			menu();
			control = scan.nextLine();

			switch(control) {
			case "1" : regist();     		break;
			case "2" : printAll();    		break;
			case "3" : searchPatientById(); break;
			case "4" : searchPatientByName(); break;
			case "0" : 
				System.out.println("** 프로그램을 종료합니다.");
				service.setFile();
				return;
			default : System.out.println("err) 메뉴를 다시 선택하세요");
			}
		}
	}

	// Main Menu
	private void menu() {
		System.out.println("=== [ 입원 환자 관리 프로그램] ===");
		System.out.println("        1. 환자 등록");
		System.out.println("        2. 전체 출력");
		System.out.println("        3. 환자번호로 조회");
		System.out.println("        4. 환자이름으로 조회");
		System.out.println("        0. 종  료");
		System.out.println("---------------------------");
		System.out.print  ("       선택> ");
	}	

	// 환자 번호로 검색
	private void searchPatientById() {
        String patientId;
        System.out.println("\n### 환자 조회(번호) ###");
        System.out.print("> 환자 번호 : "); patientId = scan.nextLine();
        PatientVO patient = service.findByPatientId(patientId);

        if(patient==null){
            System.out.println("** 환자가 존재하지 않습니다.");
            return;
        }

        System.out.println("** 조회 결과");
        System.out.println("> 환자 번호 : " + patient.getPatientId());
        System.out.println("> 이     름 : " + patient.getName());
        System.out.println("> 나     이 : " + patient.getAge());
	}
	
	// 환자 이름으로 검색
	private void searchPatientByName() {
        String patientName;
		if(service.selectAll().size()==0){
			System.out.println("** 환자가 존재하지 않습니다.");
			return;
		}
        System.out.println("\n### 환자 조회(이름) ###");
		while (true) {
			System.out.print("> 환자 이름 : ");
			patientName = scan.nextLine();
			if(patientName.equals(""))
				System.out.println("** 잘못 입력하셨습니다.");
			 else 
				break;
			
		}
        
        List<PatientVO> patientList = service.findByPatientName(patientName);
	
        if(patientList.isEmpty()){
            System.out.println("** 환자가 존재하지 않습니다.");
            return;
        }
		
		System.out.println("\n** 조회 결과");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("   번호     이름    진찰부서     진찰비     입원일      입원비       총진료비");
		System.out.println("--------------------------------------------------------------------");

		patientList.stream().sorted().forEach(patient -> System.out.println(patient));
		System.out.println();
	}
	
	// 입원 환자 전체 정보 출력
	private void printAll() {
		List<PatientVO> list = service.selectAll();
		if(list.size() == 0 ){
			System.out.println("** 환자가 존재하지 않습니다.");
			return;
		}
		System.out.println("                      << 병원 관리 프로그램 >> ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("   번호     이름    진찰부서     진찰비     입원일      입원비       총진료비");
		System.out.println("--------------------------------------------------------------------");
	
		int expenses = 0; 			// 총 진찰비 합계
		int hospitalBill=0 ; 		// 총 입원비 합계
		int total = 0;				// 총 진료비 합계
		
		list.stream().sorted().forEach(patient -> System.out.println(patient));

		
		expenses = list.stream().mapToInt(PatientVO::getExpenses).sum();
		hospitalBill = list.stream().mapToInt(PatientVO::getHospitalBill).sum();
		total = expenses + hospitalBill;
		System.out.println("--------------------------------------------------------------------");
        System.out.printf(" * 총 진찰비 : %11s\n", df.format(expenses));
        System.out.printf(" * 총 입원비 : %11s\n", df.format(hospitalBill));
        System.out.printf(" * 총 진료비 : %11s\n", df.format(total));
		System.out.println();
	}

	// 입원 환자 정보 등록
	private void regist() {
		// 번호, 진료코드, 입원일수, 나이
		String patientId = null; 		// 환자번호 
		String name=null; 				// 이름
		int age=0; 						// 나이
		Department part=null; 			// 진료코드(진료과목)
		int period = 0; 				// 입원 일수
 
		System.out.println("\n### 환자 정보 입력 ###");
		while (true) {
			System.out.print("> 환자번호 : ");
			patientId = scan.nextLine();	
			if(patientId.equals(""))
				System.out.println("** 잘못 입력하셨습니다.");
			else
				break;
		}
		
		PatientVO patient = service.findByPatientId(patientId);
		// 환자 번호에 해당하는 환자가 있으면 진료과목 입력, 입원일수 입력 
        if(patient!=null){
            System.out.println("> 이    름 : " + patient.getName()); name = patient.getName();
            System.out.println("> 나    이 : " + patient.getAge()); age = patient.getAge();
        } else {// 환자 번호에 해당하는 환자가 없으면 이름, 나이 입력받고 등록 후 진료과목 입력, 입원일수 입력 
			while (true) {
				System.out.print("> 이    름 : ");
				name = scan.nextLine();
				if(name.equals(""))
					System.out.println("** 잘못 입력하셨습니다.");
				else
					break;
			}
            while (true) {
				try {
					System.out.print("> 나    이 : ");
					age = Integer.parseInt(scan.nextLine());

					if(age == 0)
						System.out.println("** 잘못 입력하셨습니다.");
					else
						break;
				} catch (Exception e) {
					System.out.println("** 잘못 입력하셨습니다.");
				}
			}
            
        }
		part =  inputPart();
		while (true) {
			try {
				System.out.print("> 입원 일수 : ");
				period = Integer.parseInt(scan.nextLine());	
				break;
			} catch (Exception e) {
				System.out.println("** 잘못 입력하셨습니다.");
			}
		}
        boolean result = service.regist(new PatientVO(patientId, name, age, part, period));
		
        if(result)
		    System.out.println("** 환자가 등록되었습니다.");
		else
            System.out.println("** 오류가 발생했습니다. 환자가 등록되지 못했습니다.");
	}
	
	// 입원할 진료과목 선택
	private Department inputPart() {
		String choice;

		// 진료과목을 잘못 입력하면 제대로 입력할 때까지 반복적으로 입력받는다.
		while(true) {
            System.out.println("** 진료받는 진료과를 선택하세요");
            System.out.print("   1) 외과   2) 내과   3) 피부과   4) 소아과   5) 산부인과   6) 비뇨기과 : ");
            choice = scan.nextLine();
            switch (choice) {
                case "1": return Department.MI;
                case "2": return Department.NI;
                case "3": return Department.SI;
                case "4": return Department.TI;
                case "5": return Department.VI;
                case "6": return Department.WI;
                default:
                    System.out.println("** 정확히 진료과를 입력해 주세요.");
                    break;
            }
			
		}
	}
}
