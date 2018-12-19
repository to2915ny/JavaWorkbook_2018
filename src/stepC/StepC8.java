package stepC;

import java.util.Scanner;

public class StepC8 {
	private int num1,num2,num3,max,min;
	
	public StepC8(){
		input();
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요.");
		this.num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요.");
		this.num2 = s.nextInt();
		System.out.print("세번째 숫자를 입력하세요.");
		this.num3=s.nextInt();
		
	}
	
	public void conditions() {
		if(num1>= num2 && num1 >= num3)
			this.max = num1;
		else if(num2>= num1 && num2 >= num3)
			this.max = num2;
		else if(num3>= num2 && num3 >=num1)
			this.max = num3;
		
		if(num1<= num2 && num1 <= num3)
			this.min = num1;
		else if(num2<= num1 && num2 <= num3)
			this.min = num2;
		else if(num3<= num2 && num3 <= num1)
			this.min = num3;
		
		System.out.print("가장 큰 수는" + this.max+" 이고, 가장 작은 수는"+this.min+" 입니다.\n");
	}

}
