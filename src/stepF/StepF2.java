package stepF;

import java.util.Scanner;

public class StepF2 {
	private double[] num = new double[10];
	private double max,min=Double.MAX_VALUE,total,average,newnum;
	
	public StepF2() {
		
		
	}
	
	
	public void evaluate() {
		
		Scanner s = new Scanner(System.in);
		
		for(int i =0; i<10;i++) {
			
			System.out.print((i+1)+"번 심사점수를 입력하시오.");
			
			this.num[i] = s.nextDouble();
			
			if(this.num[i]>=this.max)
				this.max= this.num[i];
			if(this.min >= this.num[i]) 
				this.min = this.num[i];
				
			
			this.total= this.total + this.num[i];
			

				
			
		}

		this.total = this.total - this.max - this.min;
		this.average = this.total /8;
		
		System.out.print("가장 큰 점수와 가장 작은점수를 제외한 8개의 점수에 대한 평균은 "+this.average+"입니다.\n");
		
	}
}
