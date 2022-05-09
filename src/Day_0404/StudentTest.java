package Day_0404;

public class StudentTest {
    public static void main(String[] args) {
        StudentVO s1 = new StudentVO("홍길동", "123", 89, 88);
        StudentVO s2 = new StudentVO("최인회", "chei", 99, 80);
        StudentVO s3 = new StudentVO();

        s1.printStudent();
        s1.setName("홍길당");
        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
    }
}
