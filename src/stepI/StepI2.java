package stepI;

import java.util.Scanner;

public class StepI2 {
	private int height,blank;
	private String shape;
	public StepI2() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("직각 삼각형을 그리는데 사용할 문자를 입력하시오.");
		this.shape = s.next();
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
		this.height = s.nextInt();
		this.blank = s.nextInt();
		
		starCal();
		
	}
	
	void starCal() {
		int i,j;
		int star=1;
		for( i =0;i<this.height;i++) {
			for(j=0;j<this.blank;j++) 
				System.out.print(" ");
			for( j=0;j<this.height-i;j++)
				System.out.print(" ");
			for(j=0;j<star;j++)
				System.out.print(this.shape);
			star++;
			System.out.print("\n");
		}
		
	}
}
