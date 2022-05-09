package Day_0427;

import java.io.Serializable;

    // Object 저장을 하기위해서는 Serializable 해야한다.
public class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Student() {
        super();
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name : " + name + ", age : " + age;
    }
}
