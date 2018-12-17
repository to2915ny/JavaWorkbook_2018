package stepB;
import java.util.*;

public class StepB4 {
	private double m2_area;
	private double pyung_area;
	
	public StepB4() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오.");
		this.m2_area = s.nextDouble();
	}
	
	void pyungResult() {
		this.pyung_area = this.m2_area/3.305;
		System.out.println("아파트의 평형은 "+this.pyung_area+" 이고,");
		if(this.pyung_area<30)
			System.out.print("30평 미만이므로 작은 아파트입니다.\n");
		else
			System.out.print("30평 이상이므로 큰 아파트입니다.\n");
	}
}
