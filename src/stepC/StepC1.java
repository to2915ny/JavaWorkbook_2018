package stepC;

import java.util.Scanner;

public class StepC1 {
	private int year;
	private int age;
	
	public StepC1(){
		input();
		}
	public void printAge() {
		
		this.age = 2012 - this.year + 1;
		
		if(this.age<7)
			System.out.print("유아 입니다.\n");
		else if(this.age>=7 && this.age < 13) 
			System.out.print("어린이입니다.\n");
		else if(this.age>=13 && this.age < 20) 
			System.out.print("청소년입니다.\n");
		else if(this.age>=20 && this.age < 30) 
			System.out.print("청년입니다.\n");
		else if(this.age>=30 && this.age < 60) 
			System.out.print("중년입니다.\n");
		else 
			System.out.print("노년입니다.\n");
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요.");
		this.year = s.nextInt();
	}	
}
