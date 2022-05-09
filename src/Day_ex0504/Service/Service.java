package Day_ex0504.Service;

import java.util.List;

import Day_ex0504.vo.PatientVO;

public interface Service {
    // 파일 읽기
	public void getFile();
	// 파일 저장
	public void setFile();
	// 환자 등록
	public boolean regist(PatientVO patient);
	// 환자번호로 검색
	public PatientVO findByPatientId(String patientId);
	// 환자이름으로 검색
	public List<PatientVO> findByPatientName(String name);
	// 전체 환자 조회 
	public List<PatientVO> selectAll();
}
