package stepC;

import java.util.Scanner;

public class StepC6 {
	private int kor,eng,math,total;
	private double average;
	public StepC6() {
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
		
		if(this.average>=90)
			System.out.print("수 입니다.\n");
		else if(this.average<90 && this.average >=80)
			System.out.print("우 입니다.\n");
		else if(this.average<80 && this.average>=70)
			System.out.print("미 입니다.\n");
		else if(this.average<70 && this.average>=60)
			System.out.print("양 입니다.\n");
		else if(this.average<60)
			System.out.print("가 입니다.\n");
		
	}
}
