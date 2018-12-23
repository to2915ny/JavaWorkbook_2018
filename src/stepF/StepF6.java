package stepF;

import java.util.Scanner;

public class StepF6 {
	private int number[][]= new int[5][3];
	private int total;
	private int floor_total[] = new int[5];
	private int line_total[] = new int[3];
	
	public StepF6() {
		input();
	}
	
	void input() {
		int i,j;
		Scanner s = new Scanner(System.in);
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				System.out.print((i+1)+"0"+(j+1)+"호에 살고 있는 사람의 숫자를 입력하시오.");
				this.number[i][j] = s.nextInt();
				this.total =this.total + this.number[i][j];
				System.out.print("\n");
			}
		}
		floor_line_Cal();
		System.out.print("이 아파트에 사는 거주자는 모두 "+this.total+" 입니다.\n");
	}
	
	
	void floor_line_Cal() {
		int i,j;
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				this.floor_total[i] =this.floor_total[i]+ this.number[i][j];
				this.line_total[j] = this.line_total[j] + this.number[i][j];
			}
		}
		for(i=0;i<5;i++) 
			System.out.print((i+1)+"층에 사는 거주자는 모두 "+this.floor_total[i]+"명 입니다.\n");
		for(j=0;j<3;j++) 
			System.out.print((j+1)+"호에 사는 거주자는 모두 "+this.line_total[j]+"명 입니다.\n");
		
	}
}
