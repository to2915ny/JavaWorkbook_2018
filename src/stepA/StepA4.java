package stepA;
import java.util.*;
public class StepA4 {

	public static void main(String[] args) {
		// 날짜계산
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("날 수를 입력세요. ");
		
		int days = write.nextInt();
		
		int seconds = days * 24 * 60 * 60;
		
		System.out.print("날 수에 해당되는 시간은 모두 " +seconds+ " 입니다");
	}

}
