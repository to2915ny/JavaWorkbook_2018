package stepE;

import java.util.Scanner;

public class StepE1 {
	private int length;
	
	public StepE1() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정사각형의 크기를 입력하시오.");
		this.length = s.nextInt();
		
	}
	
	public void hashtagCal() {
		
		for(int i =0;i<this.length;i++) {
			for(int j=0;j<this.length;j++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
		
	}
}
