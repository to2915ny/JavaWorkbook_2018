package stepJ;

import java.util.Scanner;

public class StepJ5 {
	Scanner s = new Scanner(System.in);
	private int start_h,start_m,end_h,end_m,charge;
	public StepJ5() {
		input();
	}
	void input() {
		int count=0;
		while(true) {
		
			String no = "N";
			String check;
			System.out.print((count+1)+"번 차량 주차 시작 시각(시 분) : ");
			this.start_h = s.nextInt();
			this.start_m = s.nextInt();
			System.out.print((count+1)+"번 차량 주차 종료 시각(시 분) : ");
			this.end_h = s.nextInt();
			this.end_m = s.nextInt();
			
			this.charge += CalcParking(this.start_h, this.start_m, this.end_h,this.end_m);
			System.out.println("주차요금: "+CalcParking(this.start_h, this.start_m, this.end_h,this.end_m)); 
			System.out.print("더 입력? (Y/N)");
			check = s.next();
			if(check.equals(no))
				break;
			count++;
			
			
		}
		System.out.print("주차차량 "+(count+1)+"대의 총 주차 요금은 "+this.charge+"입니다\n");
	}
	
	int CalcParking(int start_h, int start_m, int end_h,int end_m) {

		
		int start = start_h *60 + start_m;
		int end = end_h *60 + end_m;
		int real = end -start;
		int charge=0;
		if(real%10 ==0)
			charge =(real/10)*500;
		else
			charge =(real/10)*500 +500;
		
		return charge;
	}
}
