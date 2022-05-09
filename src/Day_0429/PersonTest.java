package Day_0429;

public class PersonTest {
    public static void main(String[] args) {
        Person[] persons = Person.values();

        for(Person p : persons){
            System.out.print("이름 : " + p);
            System.out.print(", 정체 : " + p.getTemp());
            System.out.println(", 업무 : " + p.work());
        }
    }
}
