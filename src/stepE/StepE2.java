package stepE;

import java.util.Scanner;

public class StepE2 {
private int height,blank,i,j;
	
	public StepE2() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
		this.height = s.nextInt();
		this.blank = s.nextInt();
		
	}
	
	public void starCal() {
		int star=1;
		for( i =0;i<this.height;i++) {
			for(j=0;j<this.blank;j++) 
				System.out.print(" ");
			for( j=0;j<this.height-i;j++)
				System.out.print(" ");
			for(j=0;j<star;j++)
				System.out.print("*");
			star++;
			System.out.print("\n");
		}
		
	}

}
