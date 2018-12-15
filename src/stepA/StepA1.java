package stepA;
import java.util.*;

public class StepA1 { //온도 변환

	public static void main(String[] args) {
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("섭씨 온도를 입력하시오 : ");
		
		double c_degree = write.nextDouble();
		
		double f_degree = c_degree * 1.8 + 32;
		
		System.out.print("화씨 온도는 " +f_degree+" 입니다.");
	}

}
