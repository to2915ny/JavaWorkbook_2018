package stepA;

import java.util.*;

public class StepA0 { //나이 계산

	public static void main(String[] args) {
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하시오. : ");
		
		int birth_year = write.nextInt();
		
		int age = 2018 - birth_year + 1;
		
		System.out.print("당신의 나이는 " + age +" 입니다." );

	}

}
