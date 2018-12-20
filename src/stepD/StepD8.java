package stepD;

import java.util.Scanner;

public class StepD8 {
	private int a,b,c,x_begin,x_end,x,y;
	public StepD8() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("2차 함수 y=ax^2+bx+c 의 계수 a와 b, c를 입력하시오.");
		this.a = s.nextInt();
		this.b = s.nextInt();
		this.c = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오.");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	}
	
	public void QuadEqu() {
		for(int i = this.x_begin;i<=this.x_end;i++) {
			this.x = i;
			this.y = this.a*(this.x*this.x) + (this.b*this.x) + this.c;
			System.out.print("좌표("+this.x+", "+ this.y+")\n");
		}
	}

}
