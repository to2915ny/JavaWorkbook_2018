package stepJ;

import java.util.Scanner;

public class StepJ2 {
	private double list[] = new double[10];
	private double sum;
	public StepJ2() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		int i;
		for(i=0;i<10;i++) {
			System.out.print((i+1)+"번 심사 점수를 입력하시오.");
			this.list[i] = s.nextDouble();
			this.sum += this.list[i];
			
		}
		double max = Max(list);
		double min = Min(list);
		
		this.sum = this.sum - max -min;
		
		double average = this.sum /8;
		
		System.out.print("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 "+average+" 입니다.\n");

	}
	
	double Max(double num[]) {
		int i;
		double max=0;
		for(i=0;i<10;i++){
			if(num[i]>max)
				max = num[i];
		}
		return max;
	}
	double Min(double num[]) {
		int i;
		double min = Double.MIN_VALUE;
		for(i=0;i<10;i++){
			if(num[i]<min)
				min = num[i];
		}
		return min;
	}
}
