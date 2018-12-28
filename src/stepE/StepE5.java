package stepE;

import java.util.Scanner;

public class StepE5 {
	private int mode,column;
	public StepE5() {
		
		input();
		
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("구구단의 출력모드(1: 홀수단, 2: 짝수단)입력");
		while(true) {
			this.mode = s.nextInt();
			
			if(this.mode >2)
				System.out.print("다시입력.\n");
			else
				break;
			} 
		System.out.print("한줄에 출력할 갯수 입력");
		this.column= s.nextInt();
	}
	
	public void timeTable2() {
		int i,j;
		
			for(i=this.mode;i<=9;i=i+2) {
				for(j=1;j<=9;j++) {
					if(i==1)
						i=3;
					System.out.print(i+" * "+j+" = "+i*j+"  ");
					if(j%this.column==0)
						System.out.print("\n");
				}
				System.out.print("\n");
			}
		
	
			
		
	}
}
