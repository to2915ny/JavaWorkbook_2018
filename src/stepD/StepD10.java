package stepD;

import java.util.Scanner;

public class StepD10 {
	private int num1,num2;
	
	public StepD10() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("2개의 숫자를 입력하시오.");
		this.num1 = s.nextInt();
		this.num2= s.nextInt();
		
	}
	
	public void factors() {
		for(int i =1; i<=100;i++) {
			
			if(i% this.num1 ==0 && i%this.num2 != 0) 
				System.out.print(i+" ,");
			else if(i% this.num2 ==0 && i%this.num1 != 0)
				System.out.print(i+" ,");
			
		}
		System.out.print("\n");
	}
	
	
	
	
}
