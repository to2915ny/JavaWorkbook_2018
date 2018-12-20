package stepD;

import java.util.Scanner;

public class StepD6 {
	private double m2_area;
	private double pyung_area,count1,count2,count3,count4;
	
	public StepD6() {
	
	}
	public void pyungResult() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오.");
		
		this.m2_area = s.nextDouble();
		
		this.pyung_area = this.m2_area/3.305;
		System.out.println("아파트의 평형은 "+this.pyung_area+ " 입니다.");
		pyungCal();
		}
		System.out.print("소형 아파트의 개수는"+this.count1+ "입니다.\n");
		System.out.print("중소형 아파트의 개수는"+this.count2+ "입니다.\n");
		System.out.print("중형 아파트의 개수는"+this.count3+ "입니다.\n");
		System.out.print("대형 아파트의 개수는"+this.count4+ "입니다.\n");
	}
	
	 void pyungCal() {
		
		
		if(this.pyung_area<15)
			this.count1++;
		else if(this.pyung_area>= 15 && this.pyung_area <30)
			this.count2++;
		else if(this.pyung_area>= 30 && this.pyung_area <50)
			this.count3++;
		else 
			this.count4++;
	}
}
