package stepC;

import java.util.Scanner;

public class StepC10 {
	private int num1,num2,result;
	private String operator;
	
	public StepC10(){
		input();
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요.");
		this.num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요.");
		this.num2 = s.nextInt();
		System.out.print("연산기호문자 ('+','-','*','/' 중 1개) 입력하세요.");
		this.operator = s.next();
		
		
	}
	
	public void Cal() {
		String plus = "+";
		String mul = "*";
		String div = "/";
		String minus = "-";
		
		if(this.operator.equals(plus))
			this.result = this.num1 + this.num2;
		else if(this.operator.equals(minus))
			this.result = this.num1 - this.num2;
		else if(this.operator.equals(mul))
			this.result = this.num1 * this.num2;
		else if(this.operator.equals(div))
			this.result = this.num1 / this.num2;
		System.out.print("계산식 결과 값은 "+this.result+" 입니다.\n");
			
	}
}
