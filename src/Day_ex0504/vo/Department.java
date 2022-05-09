package Day_ex0504.vo;

public enum Department {
    MI("외과"), NI("내과"), SI("피부과"), TI("소아과"), VI("산부인과"), WI("비뇨기과");
    private String medicalCode;
    private Department(String medicalCode){
        this.medicalCode = medicalCode;
    }

    public String getMedicalCode() {
        return medicalCode;
    }
}
