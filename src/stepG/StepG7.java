package stepG;

import java.util.Scanner;

public class StepG7 {
	private int team_count;
	private int charge[] = {5000,10000,15000,3000};
	private int count[] = new int[4];
	private int v_count[] = new int[4];
	private int totalcount =0,sum,total_sum=0,membership=0;

	
	public StepG7() {
		input();
		
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("오늘 방문한 팀 수를 입력하세요.");
		this.team_count = s.nextInt();
		
	}
	
	public void amusementPark() {
		int i,j;
		Scanner s = new Scanner(System.in);
		for(i=0;i<this.team_count;i++) {
			System.out.print((1+i)+"번팀 인원수(초등학생, 청소년, 일반, 경로대상)을 입력하세요.");
			for(j=0;j<4;j++) {
				this.count[j] = s.nextInt();
				this.v_count[j] = this.v_count [j]+ this.count[j];
				this.sum = this.sum+this.count[j]*this.charge[j];
				this.totalcount = this.totalcount + this.count[j];
			}
			System.out.print((1+i)+"번팀 할인카드 종류(카드없음:0, 일반등급:1, VIP등급:2)를 입력하세요.");
			this.membership = s.nextInt();
			if(this.membership == 1)
				this.sum = (int) (this.sum * 0.90);
			else if(this.membership ==2)
				this.sum = (int) (this.sum * 0.8);
			
			System.out.print((1+i)+"번팀 입장료는 "+this.sum+"입니다.\n");
			this.total_sum = this.total_sum+this.sum;
			
			this.sum =0;
			
			
		}
		System.out.print("오늘 총 방문자 수는 "+this.totalcount+"입니다.\n");

		System.out.print("초등학생 수는 "+this.v_count[0]+"입니다.\n");
		System.out.print("청소년 수는 "+this.v_count[1]+"입니다.\n");
		System.out.print("일반인 수는 "+this.v_count[2]+"입니다.\n");
		System.out.print("경로대상 수는 "+this.v_count[3]+"입니다.\n");
		
		System.out.print("총 입장료는 "+this.total_sum+"입니다.\n");
		
	}
}
