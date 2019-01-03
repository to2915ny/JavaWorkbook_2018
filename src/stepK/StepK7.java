package stepK;
import java.util.Scanner;

class Student {
	Scanner s = new Scanner(System.in);
	private int id[][] = new int[100][3];
	private int sum[] = new int [100];
	private int average[] = new int[100];
	private String grade[] = new String[100];

	
	void input(int n) {
		System.out.print((n+1)+"번 학생의 국어,영어,수학점수를 입력하시오. --> ");
		int j;
		for(j=0;j<3;j++) {
			this.id[n][j] = s.nextInt();
			this.sum[n] +=this.id[n][j]; 
		}
		this.average[n] = this.sum[n]/3;
		if(this.average[n]>=95)
			this.grade[n]="A+";
		else if(this.average[n]<95 && this.average[n]>=90)
			this.grade[n]="A";
		else if(this.average[n]<90 && this.average[n]>=85)
			this.grade[n]="B+";
		else if(this.average[n]<85 && this.average[n]>=80)
			this.grade[n]="B";
		else if(this.average[n]<80 && this.average[n]>=75)
			this.grade[n]="C+";
		else if(this.average[n]<75 && this.average[n]>=70)
			this.grade[n]="C";
		else if(this.average[n]<70 && this.average[n]>=65)
			this.grade[n]="D+";
		else if(this.average[n]<65 && this.average[n]>=60)
			this.grade[n]="D";
		else 
			this.grade[n]="F";
	}
	
	void print(int index) {
		System.out.println((index+1)+"\t"+this.id[index][0]+"\t"+this.id[index][1]+"\t"+this.id[index][2]+"\t"+this.sum[index]
				+"\t"+this.average[index]+"\t"+this.grade[index]);
	}
	
}
public class StepK7 {
	public void main() {
		Student student = new Student();
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는?");
		int count = s.nextInt();
		
		for(int i=0;i<count;i++) 
			student.input(i);
		System.out.print("=================================\n");
		System.out.print("등록된"+count+"명의 학생 목록은 다음과 같습니다.\n");
		System.out.print("=================================\n");
		System.out.print("번호\t국어\t수학\t총점\t평균\t학점\n");
		
		for(int i=0;i<count;i++) 
			student.print(i);
		
		
	}

}
