package stepD;

import java.util.Scanner;

public class StepD1 {
	
	
	private int number,totalsum;
	
	
	public StepD1(){
		input();
		}
	public void accumulate() {
		int i=0;
		
		for(i=1;i<=this.number;i++)
			this.totalsum =this.totalsum + i; 
		
		System.out.print("1부터 입력한 숫자까지의 모든 정수를 더한 값은 "+this.totalsum+" 입니다.\n");
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		this.number = s.nextInt();
	}	

}
