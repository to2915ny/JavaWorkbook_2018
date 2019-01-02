package stepJ;

import java.util.Scanner;

public class StepJ4 {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month,day,day_count,month1,day1;
	
	public StepJ4() {
		input();
		
	}
	void input() {
		Scanner s =new Scanner(System.in);
		
		System.out.print("첫번째 날짜를 입력(월 일)");
		this.month = s.nextInt();
		this.day = s.nextInt();
		if(this.month<1 || this.month>12)
			System.out.print("다시 입력.");
		if((this.month ==2 && this.day>28) || this.day>31 || this.day <1)
			System.out.print("다시 입력.");
		
		System.out.print("두번째 날짜를 입력(월 일)");
		this.month1 = s.nextInt();
		if(this.month1<1 || this.month1>12)
			System.out.print("다시 입력.");
		this.day1 = s.nextInt();
		if((this.month1 ==2 && this.day1>28) || this.day1>31 || this.day1 <1)
			System.out.print("다시 입력.");
		
		this.day_count = Math.abs(CalcDate(this.month,this.day) - CalcDate(this.month1,this.day1));
		
		System.out.print("두 날짜의 간격은 "+this.day_count+ "입니다.\n");
	}
	
	int CalcDate(int month, int day) {
		int i,days=0;
		for(i=0;i<month-1;i++) 
			days += this.monthdays[i];
		return days + day;
	}

}
