package stepF;

import java.util.Scanner;

public class StepF8 {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month,day,day_count;
	
	public StepF8() {
		input();
		
	}
	void input() {
		Scanner s =new Scanner(System.in);
		System.out.print("월을 입력.");
		this.month = s.nextInt();
		if(this.month<1 || this.month>12)
			System.out.print("다시 입력.");
		System.out.print("일을 입력.");
		this.day = s.nextInt();
		if((this.month ==2 && this.day>28) || this.day>31 || this.day <1)
			System.out.print("다시 입력.");
		
	}
	
	public void calendar() {
		int i;
		for(i=0;i<this.month-1;i++) 
			this.day_count = this.day_count + this.monthdays[i];
		System.out.print("이 날짜는 1년중 "+(this.day_count+this.day)+" 날에 해당됩니다.");
	}
}

