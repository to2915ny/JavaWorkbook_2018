package stepC;

import java.util.Scanner;

public class StepC2 {
	private double input_degree;
	
	
	public StepC2(){
		input();
	}
	
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("물의 온도를 입력하세요.");
		this.input_degree = s.nextDouble();
	}
	public void temp() {
		if(this.input_degree>=0.0 && this.input_degree<25.0)
			System.out.print("냉수입니다.\n");
		else if(this.input_degree>=25.0 && this.input_degree<40.0)
			System.out.print("미온수입니다.\n");
		else if(this.input_degree>=40.0 && this.input_degree<80.0)
			System.out.print("온수입니다.\n");
		else if(this.input_degree>=80.0)
			System.out.print("끓는 물입니다.\n");
		else
			System.out.print("잘못입력하셨습니다.\n");
	}
}

