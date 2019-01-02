package stepJ;

import java.util.Scanner;

public class StepJ7 {
	Scanner s = new Scanner(System.in);
	private int power;
	
	public StepJ7() {
		input();
	}
	void input() {
		while(true) {
		System.out.print("숫자를 입력하시오. (0.종료) : ");
		this.power = s.nextInt();
		if(this.power == 0)
			break;
		System.out.println("2의 "+this.power+"승은 : "+PowerOfTwo(this.power));
		
		}
		
	}
	int PowerOfTwo(int n) {
		if(n ==0)
			return 1;
		else
			return 2* PowerOfTwo(n-1);
	}

}
