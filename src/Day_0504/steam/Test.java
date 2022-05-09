package Day_0504.steam;

public class Test {
    private String name;
    private int age;

    public Test() {
        super();
    }
    public Test(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name : " + name + ", age : " + age;
    }
}
