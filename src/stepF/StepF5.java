package stepF;

import java.util.Scanner;

public class StepF5 {
	private int number[][]= new int[5][3];
	private int total;
	
	public StepF5() {
		input();
	}
	
	void input() {
		int i,j;
		Scanner s = new Scanner(System.in);
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				System.out.print((i+1)+"0"+(j+1)+"호에 살고 있는 사람의 숫자를 입력하시오.");
				number[i][j] = s.nextInt();
				this.total =this.total + number[i][j];
		
			}
		}
		System.out.print("이 아파트에 사는 거주자는 모두 "+this.total+" 입니다.");
	}
}
