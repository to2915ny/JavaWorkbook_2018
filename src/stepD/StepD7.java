package stepD;

import java.util.Scanner;

public class StepD7 {
	private int a,b,x_begin,x_end,x,y;
	public StepD7() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("1차 함수 y=ax+b 의 계수 a와 b를 입력하시오.");
		this.a = s.nextInt();
		this.b = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오.");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	}
	
	public void linearEqu() {
		for(int i = this.x_begin;i<=this.x_end;i++) {
			this.x = i;
			this.y = this.a*this.x + this.b;
			System.out.print("좌표("+this.x+", "+ this.y+")\n");
		}
	}

}
