package stepC;

import java.util.Scanner;

public class StepC4 {

	private double m2_area;
	private double pyung_area;
	
	public StepC4() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오.");
		this.m2_area = s.nextDouble();
	}
	
	public void pyungResult() {
		this.pyung_area = this.m2_area/3.305;
		System.out.println("아파트의 평형은 "+this.pyung_area+ " 입니다.");
		
		if(this.pyung_area<15)
			System.out.print("소형 아파트입니다.\n");
		else if(this.pyung_area>= 15 && this.pyung_area <30)
			System.out.print("중소형 아파트입니다.\n");
		else if(this.pyung_area>= 30 && this.pyung_area <50)
			System.out.print("중형 아파트입니다.\n");
		else 
			System.out.print("대형 아파트입니다.\n");
	}
}
