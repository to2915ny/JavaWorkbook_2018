package stepG;

import java.util.Scanner;

public class StepG3 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[5];
	private int sum2[] = new int[5];
	private double average[] = new double[5]; 
	private double average2[] = new double[5]; 
	private int kor, eng, mat;
	
	
	public StepG3() {
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
	
	public void score() {
		System.out.print("1) 각 과목별 총점과 평균 점수\n");
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
		
		
		System.out.print("2) 각 학생별 총점과 평균 점수\n");
		
		for(j=0;j<3;j++) {
			this.sum2[0]=this.sum2[0]+this.jumsu[0][j];
			this.sum2[1]=this.sum2[1]+this.jumsu[1][j];
			this.sum2[2]=this.sum2[2]+this.jumsu[2][j];
			this.sum2[3]=this.sum2[3]+this.jumsu[3][j];
			this.sum2[4]=this.sum2[4]+this.jumsu[4][j];
		}
		for(i=0;i<5;i++) {
		this.average2[i] =this.sum2[i]/3;
		
		if(this.average2[i]>=90)
			System.out.print((i+1)+"번 학생 점수: 총점 "+this.sum2[i]+", 평균 "+this.average2[i]+",등급 A\n");
		else if(this.average2[i]<90 && this.average2[i] >=80)
			System.out.print((i+1)+"번 학생 점수: 총점 "+this.sum2[i]+", 평균 "+this.average2[i]+",등급 B\n");
		else if(this.average2[i]<80 && this.average2[i]>=70)
			System.out.print((i+1)+"번 학생 점수: 총점 "+this.sum2[i]+", 평균 "+this.average2[i]+",등급 C\n");
		else if(this.average2[i]<70 && this.average2[i]>=60)
			System.out.print((i+1)+"번 학생 점수: 총점 "+this.sum2[i]+", 평균 "+this.average2[i]+",등급 D\n");
		else if(this.average2[i]<60)
			System.out.print((i+1)+"번 학생 점수: 총점 "+this.sum2[i]+", 평균 "+this.average2[i]+",등급 F\n");
		}
	
		
	}
}
