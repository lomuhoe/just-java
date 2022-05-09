package fitness5.vo;

import java.io.Serializable;

public class FitnessVO implements Serializable, Comparable<FitnessVO> {
    private static final long serialVersionUID = 1L;

    private String usrid;
    private String usrname;   
    private double height;
    private double weight;
    private double bmi;
    private BmiResult result;

    public FitnessVO(){};
    public FitnessVO(String usrid, String usrname, double height, double weight) {
        this.usrid = usrid;
        this.usrname = usrname;
        this.height = height;
        this.weight = weight;
        this.caculBmi();
    }

    //setter
    public void setUsrid(String usrid) {this.usrid = usrid;}
    public void setUsrname(String usrname) {this.usrname = usrname;}
    public void setHeight(double height) {
        this.height = height;
        caculBmi();
    }
    public void setWeight(double weight) {
        this.weight = weight;
        caculBmi();
    }
    private void setResult(){
        if(bmi>=35) {result = BmiResult.고도비만;}
		else if(bmi>=30) {result = BmiResult.중도비만;}
		else if(bmi>=25) {result = BmiResult.경도비만;}
		else if(bmi>=23) {result = BmiResult.과체중;}
		else if(bmi>18.5) {result = BmiResult.정상;}
		else {result = BmiResult.저체중;}
    }


    //getter
    public String getUsrid() {return usrid;}
    public String getUsrname() {return usrname;}
    public double getHeight() {return height;}
    public double getWeight() {return weight;}
    public double getBmi() {return bmi;}
    public BmiResult getResult() {return result;}

    private void caculBmi(){
        bmi = this.weight/((this.height*0.01)*(this.height*0.01));
        setResult();
    }

    @Override
    public String toString() {
        
        return String.format("이름 : %s, 아이디 : %s, 신장 : %6.2f, 몸무게 : %6.2f%nBMI : %.2f 결과 : %s%n", usrname, usrid, height, weight, bmi, result);
    }
    @Override
    public int compareTo(FitnessVO o) {
        return this.getUsrname().compareTo(o.getUsrname());
    }
}
