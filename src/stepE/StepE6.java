package stepE;

import java.util.Scanner;

public class StepE6 {
	private int rows,columns,number,i,j;
	
	public StepE6() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("출력하려는 행의 크기와 열의 크기 입력.");
		this.rows = s.nextInt();
		this.columns = s.nextInt();
	}
	
	public void twoDimension() {
		for(i=1;i<=rows;i++) {
			
			for(j=1;j<=columns;j++) {
				this.number = i*j;
				
				System.out.print(this.number+" ");
				
			}
			System.out.print("\n");
		}
	}
}
