package stepB;
import java.util.*;
public class StepB3 {
	
	private int width, height;
	private int area;
	
	public StepB3() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오.");
		this.width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오.");
		this.height = s.nextInt();
	}
	
	public void areaCal() {
		this.area = this.width * this.height;
		System.out.println("직사각형의 넓이는 "+ this.area+" 이고,");
		if(this.width == this.height )
			System.out.print("정사각형입니다.\n");
		else
			System.out.print("정사각형이 아닙니다.\n");
	}

}
