package stepB;

import java.util.Scanner;

public class StepB1 {

	private int year;
	private int age;
	
	public StepB1(){
		input();
		}
	public void printAge() {
		this.age = 2018 - year + 1;
		if(this.age<20)
			System.out.print("미성년자 입니다.\n");
		else {
			System.out.print("미성년자가 아닙니다.\n");
		}
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요.");
		this.year = s.nextInt();
	}	
	

}
