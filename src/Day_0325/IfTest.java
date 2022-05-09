package Day_0325;

public class IfTest {
    public static void main(String[] args) {
        int score =  80;
        String grade;

        if(score >= 90){
            grade = "A학점";
        } else if (score >= 80) {
            grade = "B학점";
        } else if (score >= 70) {
            grade = "C학점";
        } else{
            grade = "F학점";
        }

        System.out.println(score + "점은 " + grade);
    }
}
