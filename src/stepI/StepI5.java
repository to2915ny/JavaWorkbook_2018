package stepI;

import java.util.Scanner;

public class StepI5 {
	public StepI5() {
		input();
	}
	void input() {
		System.out.print("10개의 숫자 중 최댓값을 구합니다.\n");
		System.out.print("최댓값은 "+MaxOfTen()+" 입니다.\n");
	}
	
	int MaxOfTen() {
		int max = 0,temp;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+"번의 수를 입력하시오");
			temp = s.nextInt();
			if(temp>max)
				max = temp;
			}
		return max;
	}
}
