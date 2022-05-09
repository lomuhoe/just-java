package Day_0323;

public class OperatorTest2 {
    public static void main(String[] args) {
        int kor = 80;
		int eng = 85;
		int math = 90;
		
		int total = kor + eng + math;
		double avg = (double)total/3;
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
    }
}
