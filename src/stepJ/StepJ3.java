package stepJ;

import java.util.Scanner;

public class StepJ3 {
	private int input_degree;
	private double degrees[] = new double[10];
	private String degree_name[] = {"냉수","미온수","온수","끓는물"};
	private int[] count = {0,0,0,0};
	
	StepJ3(){
		input();
	}
	void input(){
		Scanner s = new Scanner(System.in);
		int i;
		for(i=0;i<10;i++) {
			System.out.print((i+1)+"번 물의 온도를 입력하시오.");
			this.degrees[i] = s.nextDouble();
			if(AskWater(this.degrees[i]) ==0)
				this.count[0]++;
			else if(AskWater(this.degrees[i]) ==1)
				this.count[1]++;
			else if(AskWater(this.degrees[i]) ==2)
				this.count[2]++;
			else if(AskWater(this.degrees[i]) ==3)
				this.count[3]++;
			
		}
		for(i=0;i<10;i++) 
			System.out.print((i+1)+"번 물의 온도는 "+this.degrees[i]+" 입니다.");
		
		System.out.print("냉수 입력 횟수: " +this.count[0]+"\n");
		System.out.print("미온수 입력 횟수: " +this.count[1]+"\n");
		System.out.print("온수 입력 횟수: " +this.count[2]+"\n");
		System.out.print("끓는물 입력 횟수: " +this.count[3]+"\n");
	}
	byte AskWater(double degrees) {
		int i;
		
			
			if(degrees>=0.0 && degrees<25.0) 
				return 0;
			else if(degrees>=25.0 && degrees<40.0) 
				return 1;
			else if(degrees>=40.0 && degrees<80.0) 
				return 2;
			else if(degrees>=80.0) 
				return 3;
			return -1;
			
			
			 
		
		
		
		
	}

}
