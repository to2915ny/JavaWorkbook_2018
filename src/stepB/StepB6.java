package stepB;
import java.util.Scanner;

public class StepB6 {
	private int kor,eng,math,total;
	private double average;
	public StepB6() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요.");
		this.kor = s.nextInt();
		System.out.print("영어점수를 입력하세요.");
		this.eng = s.nextInt();
		System.out.print("수학점수를 입력하세요.");
		this.math = s.nextInt();
	}
	
	public void score() {
		this.total = this.kor + this.eng + this.math;
		this.average = this.total/3.0;
		System.out.print("입력하신 점수의 총점은 " + this.total+ "이고,\n");
		System.out.print("평균은 "+this.average+" 입니다.\n");
		if(this.kor>90)
			System.out.print("국어점수가 우수합니다.\n");
		if(this.eng>90)
			System.out.print("영어점수가 우수합니다.\n");
		if(this.math>90)
			System.out.print("수학점수가 우수합니다.\n");
		
	}
}
