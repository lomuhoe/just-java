package Day_0413.my_abstract;

public abstract class AbstractVO {
    private String name;
    private int age;

    public AbstractVO(){}
    public AbstractVO(String name, int age){
        this.name = name;
        this.age = age;
    }

    //setter
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    //getter
    public String getName() {return name;}
    public int getAge() {return age;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "AbstractVO.toString()";
    }
}
