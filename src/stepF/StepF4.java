package stepF;

import java.util.Scanner;

public class StepF4 {
	
	private int height,weight, bmi;
	private int bmilist[][] = new int[10][3];
	
	
	public StepF4() {
		input();
	}
	void input() {
		
		Scanner s = new Scanner(System.in);
		int i,j;
		for(i=0;i<10;i++){
			System.out.print((i+1)+"번 사람의 신장(cm)과 체중(kg)을 입력하시오.");
			for(j=0;j<2;j++) {
				this.bmilist[i][j]= s.nextInt();
				
			}
			
		}
	}
	public void bmiCal() {
		int i,j,count=0;
	
		for(i=0;i<10;i++){
			
				this.bmi = (int) (this.bmilist[i][1]/((this.bmilist[i][0]*0.01) * (this.bmilist[i][0]*0.01)));
				if(this.bmi>=25) {
					System.out.print((i+1)+"번째 사람은 비만입니다.\n");
				
					count++;
				}
			}
			
	
		System.out.print("총 "+count+"의사람이 비만입니다.\n");

}
}