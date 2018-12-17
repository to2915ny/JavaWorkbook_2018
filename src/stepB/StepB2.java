package stepB;

import java.util.*;

public class StepB2 {
	
	private double input_degree;
	private String kind;
	private double output_degree;
	
	public StepB2(){
		input();
	}
	
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("온도를 입력하세요.");
		this.input_degree = s.nextDouble();
		System.out.print("입력하신 온도가 섭씨온도이면 C 를, 화씨온도이면 F를 입력하세요.");
		this.kind = s.next();
		
	}
	
	public void temp() {
		String cel = "C";
		String far = "F";
		if(this.kind.equals(far)) {
			this.output_degree = (this.input_degree-32)/1.8;
			}
		else {
			this.output_degree = this.input_degree * 1.8 + 32;
		}
		System.out.print("변환한 온도는 " + this.output_degree + " 입니다.\n");
			
	}

}
