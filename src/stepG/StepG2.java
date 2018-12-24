package stepG;

import java.util.Scanner;

public class StepG2 {
	private int input_degree;
	private double degrees[] = new double[10];
	private String degree_name[] = {"냉수","미온수","온수","끓는물"};
	private int[] count = {0,0,0,0};
	
	StepG2(){
		input();
	}
	void input(){
		Scanner s = new Scanner(System.in);
		int i;
		for(i=0;i<10;i++) {
			System.out.print((i+1)+"번 물의 온도를 입력하시오.");
			this.degrees[i] = s.nextDouble();
			
			 
		}
		
	}
	public void checkTemp() {
		int i;
		for(i=0;i<10;i++) {
			System.out.print((i+1)+"번 물의 온도는 "+this.degrees[i]+" 입니다.");
			
			if(this.degrees[i]>=0.0 && this.degrees[i]<25.0) {
				System.out.println(this.degree_name[0]);
				this.count[0]++;}
			else if(this.degrees[i]>=25.0 && this.degrees[i]<40.0) {
				System.out.println(this.degree_name[1]);
				this.count[1]++;}
			else if(this.degrees[i]>=40.0 && this.degrees[i]<80.0) {
				System.out.println(this.degree_name[2]);
				this.count[2]++;}
			else if(this.degrees[i]>=80.0) {
				System.out.println(this.degree_name[3]);
				this.count[3]++;}
			else
				System.out.print("잘못입력하셨습니다.\n");
			
			 
		}
		System.out.print("냉수 입력 횟수: " +this.count[0]+"\n");
		System.out.print("미온수 입력 횟수: " +this.count[1]+"\n");
		System.out.print("온수 입력 횟수: " +this.count[2]+"\n");
		System.out.print("끓는물 입력 횟수: " +this.count[3]+"\n");
		
		
	}
}
