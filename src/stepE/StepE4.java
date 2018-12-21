package stepE;

import java.util.Scanner;

public class StepE4 {
	private int mode,i,j;
	public StepE4() {
		
		input();
		
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("구구단의 출력모드(1: 홀수단, 2: 짝수단)입력");
		this.mode = s.nextInt(); 
	}
	
	public void timeTable() {
		if(this.mode == 1) {
			for(i=3;i<=9;i=i+2) {
				for(j=1;j<=9;j++) {
					System.out.print(i+" * "+j+" = "+i*j+"	");
					
				}
				System.out.print("\n");
				System.out.print("\n");
			}
		}
		else {
			for(i=2;i<=8;i=i+2) {
				for(j=1;j<=9;j++) {
					System.out.print(i+" * "+j+" = "+i*j+"	");
					
				}
				System.out.print("\n");
				System.out.print("\n");
			}
			
		}
			
		
	}
}
