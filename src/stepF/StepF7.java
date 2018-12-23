package stepF;

import java.util.Scanner;

public class StepF7 {
	private int [] number = new int[10];
	
	public StepF7() {
		input();
	}
	void input() {
		int count =0;
		boolean dup;
		Scanner s = new Scanner(System.in);
		int i;
		System.out.print("1부터 100사이의 숫자를 입력하시오\n");
		while(count<10) {
			
			System.out.print(count+1+"번째 숫자를 입력하시오.\n");
			number[count] = s.nextInt();
			dup = true;
			if(number[count]<0 || number[count]>100)
				System.out.print("숫자 다시 입력\n");
			for(i=0;i<count;i++) {
				if(number[i] == number[count]) {
					dup = false;
					break;
				}
			}
			
			if(dup)
				count++;
			
			
		}
		for(i=0;i<10;i++) {
			System.out.print(i+1+"번째 숫자는 "+number[i]+"입니다.\n");
			
		}
		
	}
}
