package Day_0404;

public class StudentVO {
    private String name;
    private String id;
    private double javaLang;
    private double cLang;

    public StudentVO(){}

    public StudentVO(String name, String id, double javaLang, double cLang) {
        this.name = name;
        this.id = id;
        this.javaLang = javaLang;
        this.cLang = cLang;
    }

    public void setName(String name) {this.name = name;}
    public void setId(String id) {this.id = id;}
    public void setJavaLang(double javaLang) {this.javaLang = javaLang;}
    public void setCLang(double cLang) {this.cLang = cLang;}
    public String getName() {return this.name;}
    public String getId() {return this.id;}
    public double getJavaLang() {return this.javaLang;}
    public double getCLang() {return this.cLang;}

    public void printStudent() {
        System.out.printf("이름 : %s, 아이디 : %s, 자바 점수 : %.1f, c언어 점수 : %.1f%n", this.name, this.id, this.javaLang, this.cLang);
    }
}
