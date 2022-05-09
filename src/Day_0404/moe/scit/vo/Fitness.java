package Day_0404.moe.scit.vo;

public class Fitness {
    private String usrid;
    private String usrname;
    private double height;
    private double weight;
    private double bmi;
    private String result;

    public void Fitness(){};
    public void Fitness(String usrid, String usrname, double height, double weight) {
        this.usrid = usrid;
        this.usrname = usrname;
        this.height = height;
        this.weight = weight;
        this.bmi =this.caculBmi();
    }

    //setter
    public void setUsrid(String usrid) {this.usrid = usrid;}
    public void setUsrname(String usrname) {this.usrname = usrname;}
    public void setHeight(double height) {this.height = height;}
    public void setWeight(double weight) {this.weight = weight;}
    //getter
    public String getUsrid() {return usrid;}
    public String getUsrname() {return usrname;}
    public double getHeight() {return height;}
    public double getWeight() {return weight;}
    public double getBmi() {return bmi;}
    public String getResult() {return result;}

    private double caculBmi(){return this.weight/((this.height*0.01)*(this.height*0.01));}
}
