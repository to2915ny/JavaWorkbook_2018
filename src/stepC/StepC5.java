package stepC;

import java.util.Scanner;

public class StepC5 {
	private int days,month,day_count;
	public StepC5() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하세요.");
		this.month = s.nextInt();
		System.out.print("날을 입력하세요.");
		this.days = s.nextInt();
		
	}
	
	public void calDays() {
		
		if(this.month == 1) {
			this.day_count = this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 2) {
			this.day_count = 31+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 3) {
			this.day_count = 31+28+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 4) {
			this.day_count = 31+28+31+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 5) {
			this.day_count = 31+28+31+30+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 6) {
			this.day_count = 31+28+31+30+31+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 7) {
			this.day_count = 31+28+31+30+31+30+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 8) {
			this.day_count = 31+28+31+30+31+30+31+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 9) {
			this.day_count = 31+28+31+30+31+30+31+31+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 10) {
			this.day_count = 31+28+31+30+31+30+31+31+30+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 11) {
			this.day_count = 31+28+31+30+31+30+31+31+30+31+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
		else if(this.month == 12) {
			this.day_count = 31+28+31+30+31+30+31+31+30+31+30+this.days;
			System.out.print("이 날짜는 1년중 "+this.day_count+" 번째 날에 해당됩니다.\n");
		}
	}
}
