package Day_ex0504.vo;

import java.io.Serializable;
import java.text.DecimalFormat;

public class PatientVO implements Serializable, Comparable<PatientVO> {
    private static final long serialVersionUID = 1L;
    private final DecimalFormat df = new DecimalFormat("###,###");
    private String patientId; 		// 환자번호 
	private String name; 			// 이름
	private int age; 				// 나이
	private Department part; 		// 진료코드(진료과목)
	private int period; 			// 입원기간 
	private int expenses; 			// 진찰비 
	private int hospitalBill ; 		// 입원비

    public PatientVO() {
        super();
    }
    public PatientVO(String patientId, String name, int age, Department part, int period) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.part = part;
        this.period = period;
        setExpenses();
        setHospitalBill();
    }

    //getter
    public String getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Department getPart() {
        return part;
    }
    public int getPeriod() {
        return period;
    }
    public int getExpenses() {
        return expenses;
    }
    public int getHospitalBill() {
        return hospitalBill;
    }

    //setter
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
        setExpenses();
    }
    public void setPart(Department part) {
        this.part = part;
    }
    public void setPeriod(int period) {
        this.period = period;
        setHospitalBill();
    }
    private void setExpenses() {
        if(age<10) {
            this.expenses = 7000;
        } else if(age<20){
            this.expenses = 5000;
        } else if(age<30){
            this.expenses = 8000;
        } else if(age<40){
            this.expenses = 7000;
        } else if(age<50){
            this.expenses = 4500;
        } else {
            this.expenses = 2300;
        }
    }
    public void setHospitalBill() {
        if(period<10){
            if(period<=3)
            hospitalBill = period * 30000;
            else 
            hospitalBill = period * 25000;
        } else if(period<15){
            hospitalBill = (int)(period * 25000 * 0.85);
        } else if(period<20){
            hospitalBill = (int)(period * 25000 * 0.80);
        } else if(period<30){
            hospitalBill = (int)(period * 25000 * 0.77);
        } else if(period<100){
            hospitalBill = (int)(period * 25000 * 0.72);
        } else {
            hospitalBill = (int)(period * 25000 * 0.68);
        }
    }

    @Override
    public String toString() {
        return String.format("%5s %7s %8s %8s원 %8s일 %9s원 %11s원", patientId, name, part.getMedicalCode(), df.format(expenses), df.format(period), df.format(hospitalBill), df.format(expenses + hospitalBill));
    }
    @Override
    public int compareTo(PatientVO temp) {
        return this.patientId.compareTo(temp.getPatientId());
    }
    
}
