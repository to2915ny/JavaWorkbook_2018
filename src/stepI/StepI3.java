package stepI;

import java.util.Scanner;

public class StepI3 {
private int height,weight,bmi;
	
	public StepI3() {
	
		input();
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		int i=0;
		while(i<10) {
		System.out.print((i+1)+"번째의 사람의 신장(cm)과 체중(kg)을 입력하세요");
		this.height = s.nextInt();
		this.weight = s.nextInt();
		obesity();
		i++;
		}
	}
	
	void obesity() {
		
		double heightm = this.height*0.01;
		
		this.bmi = (int)(this.weight /Math.pow(heightm, 2));
		
		if(this.bmi>=25 && this.bmi<30)
			System.out.print("당신은 비만입니다.\n");
		else if(this.bmi>=18.5 && this.bmi<23)
			System.out.print("정상입니다.\n");
		else if(this.bmi<18.5)
			System.out.print("저체중입니다.\n");
		else if(this.bmi>30)
			System.out.print("고도비만입니다.\n");
		else if(this.bmi>=23 && this.bmi<25)
			System.out.print("경도비만입니다.\n");
	}

}
