package stepA;
import java.util.*;
public class StepA5 {

	public static void main(String[] args) {
		// 점수계산
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요.: ");
		
		int kor = write.nextInt();
		
		System.out.print("영어 점수를 입력하세요.: ");
		
		int eng = write.nextInt();
		
		System.out.print("수학 점수를 입력하세요.: ");
		
		int math = write.nextInt();
		
		int total =  kor + eng + math;
		double average = total / 3;
		System.out.println("입력하신 점수의 총점은 "+total+" 이고,");
		System.out.print("평균은 " + average+ " 입니다.");
	}

}
