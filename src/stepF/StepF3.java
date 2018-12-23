package stepF;

import java.util.Scanner;

public class StepF3 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[3];
	private double average[] = new double[3]; 
	private int kor, eng, mat;
	
	
	public StepF3() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		int i,j;
		for(i=0;i<5;i++){
			System.out.print((i+1)+"번 학생 국어, 영어, 수학 점수를 입력하시오.");
			for(j=0;j<3;j++) {
				this.jumsu[i][j]= s.nextInt();
				
			}
		
		}
	}
	
	public void totalSumAvg(){
		int i,j;
		for(i=0;i<5;i++) {
			this.sum[0]=this.sum[0]+this.jumsu[i][0];
			this.sum[1]=this.sum[1]+this.jumsu[i][1];
			this.sum[2]=this.sum[2]+this.jumsu[i][2];
		}
		this.kor = this.sum[0];
		this.eng = this.sum[1];
		this.mat = this.sum[2];
		this.average[0] =this.kor/5;
		this.average[1] = this.eng/5;
		this.average[2] = this.mat/5;
		System.out.print("국어의 총점은"+this.kor+" 이고, 평균은 "+this.average[0]+"입니다.\n");
		System.out.print("영어의 총점은"+this.eng+" 이고, 평균은 "+this.average[1]+"입니다.\n");
		System.out.print("수학의 총점은"+this.mat+" 이고, 평균은 "+this.average[2]+"입니다.\n");
	}
	
}
