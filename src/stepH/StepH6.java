package stepH;

import java.util.Scanner;

public class StepH6 {
	private int number[] = new int[5];
	private int pow_value[][] = new int[5][5];
	private int max,min=Integer.MAX_VALUE,max_a,max_b,min_a,min_b;
	Scanner s = new Scanner(System.in);
	
	public StepH6() {input();}
	
	void input() {
		int i;
		System.out.print("2 에서 9사이의 숫자 5개를 입력하세요.");
		for(i=0;i<5;i++) 
			this.number[i] = s.nextInt();
		
	}
	
	public void maxMinPower() {
		System.out.print("입력하신 5개의 수로 제곱수를 만들면....\n");
		
		int i,j;
		for(i=0;i<5;i++) { 
			for(j=0;j<5;j++) {
				this.pow_value[i][j]= (int) Math.pow(this.number[i], this.number[j]);
				
			}
		}
		for(i=0;i<5;i++) { 
			for(j=0;j<5;j++) {
				if(this.pow_value[i][j]>this.max) {
					this.max = this.pow_value[i][j];
					this.max_a = this.number[i];
					this.max_b=this.number[j];
				}
				if(this.pow_value[i][j]<this.min) {
					this.min = this.pow_value[i][j];
					this.min_a = this.number[i];
					this.min_b=this.number[j];
				}
			}
		}
		System.out.print("가장 큰 수는 "+this.max_a+"의 "+this.max_b+"승인 "+this.max+"입니다.\n");
		System.out.print("가장 작은수는 "+this.min_a+"의 "+this.min_b+"승인 "+this.min+"입니다.\n");
		
	}
}
