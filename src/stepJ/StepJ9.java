package stepJ;

import java.util.Scanner;

public class StepJ9 {
	Scanner s = new Scanner(System.in);
	private int base,power;
	public StepJ9() {
		input();
	}
	void input() {
		System.out.print("숫자 2개를 입력하시오.");
		this.base = s.nextInt();
		this.power = s.nextInt();
		
		System.out.print(this.base+"의 "+this.power+"승은 "+Power(this.base, this.power)+"\n");
	}
	
	int Power(int n, int a) {
		if(a ==0)
			return 1;
		else if(a==1)
			return n;
		else if(a>1 && a%2==0)
			return Power(n,a/2) * Power(n,a/2);
		else
			return Power(n,a/2) * Power(n,a/2) * n;
	}
}
