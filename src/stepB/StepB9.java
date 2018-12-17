package stepB;

import java.util.Scanner;



public class StepB9 {
	private int height,weight,bmi;
	
	public StepB9() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("신장(cm)을 입력하세요");
		this.height = s.nextInt();
		System.out.print("체중(kg)을 입력하세요");
		this.weight = s.nextInt();
	}
	
	public void obesity() {
		this.height = this.height/100;
		
		this.bmi = (int) (this.weight / Math.pow(this.height, 2));
		
		if(this.bmi>25)
			System.out.print("당신은 비만입니다.\n");
		else
			System.out.print("당신은 비만이 아닙니다.");
	}

}
