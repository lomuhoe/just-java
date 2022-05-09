package Day_0422.exam;

public class Phone {
    private String phoneNumber;
    private String name;
    private int age;

    public Phone() {
        super();
    }   
    public Phone(String phoneNumber, String name, int age) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
