package stepC;

import java.util.Scanner;

public class StepC9 {
private int income,tax;
	
	public StepC9() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("연봉(원 단위)을 숫자로 입력하세요");
		this.income = s.nextInt();
		
	}
	
	public void taxCal() {
		
		
		if(this.income<10000000) {
			this.tax = (int)(this.income *0.095);
			System.out.print("연봉 금액에 대한 소득세는"+this.tax+" 원 입니다.\n");
		}

		else if(this.income>=10000000 && this.income<40000000) {
			this.tax = (int)(this.income *0.19);
			System.out.print("연봉 금액에 대한 소득세는"+this.tax+" 원 입니다.\n");
		}
		else if(this.income>=40000000 && this.income< 80000000) {
			this.tax = (int)(this.income *0.28);
			System.out.print("연봉 금액에 대한 소득세는"+this.tax+" 원 입니다.\n");
		}
		else if(this.income>=80000000) {
			this.tax = (int)(this.income *0.37);
			System.out.print("연봉 금액에 대한 소득세는"+this.tax+" 원 입니다.\n");
		}
	
	
	}

}
