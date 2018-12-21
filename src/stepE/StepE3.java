package stepE;

import java.util.Scanner;

public class StepE3 {
private int height,blank;
	
	public StepE3() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("직각 삼각형의 높이를 입력하시오.");
		this.height = s.nextInt();
		
		
	}
	
	public void starCal2() {
		int i,j;
		for( i =1;i<=this.height;i++) {
			
			for( j=0;j<this.height-i;j++)
				System.out.print(" ");
			
			for(j=0;j<i*2-1;j++)
				System.out.print("*");
			
			System.out.print("\n");
		}
		
	}
}
