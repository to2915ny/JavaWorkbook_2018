package stepA;
import java.util.*;
public class StepA3 {

	public static void main(String[] args) {
		// 아파트 평형 계산
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("아파트의 분양 면적을 입력하시오. : ");
		
		double m2_area = write.nextDouble();
		
		double pyung_area = m2_area / 3.305;
		
		System.out.print("아파트의 평형은 "+ Math.round(pyung_area) + " 입니다.");
		
	}

}
