package stepB;

import java.util.Scanner;

public class StepB1 {

	public static void main(String[] args) {
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하시오. : ");
		
		int birth_year = write.nextInt();
		
		int age = 2018 - birth_year + 1;
		
		if(age <20)
			System.out.print("당신은 미셩년자 입니다." );
		else
			System.out.print("당신은 성인입니다.");

	}

}
