package stepC;

import java.util.Scanner;

public class StepC11 {
	
	private int year;
	
	public StepC11(){
		input();
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요");
		this.year = s.nextInt();
		
	}
	public void calendar() {
		if(this.year % 4 ==0) {
			if(this.year % 100 ==0 && this.year % 400 ==0)
				System.out.print("윤년입니다\n");
			else if(this.year % 100 ==0 && this.year % 400 !=0)
				System.out.print("평년입니다\n");
			else
				System.out.print("윤년입니다\n");
		}
		else
			System.out.print("평년입니다\n");
	}
}
