package stepD;

import java.util.Scanner;

public class StepD9 {
	private int dan;
	public StepD9() {
		
	}
	
	public void timeTable() {
		Scanner s = new Scanner(System.in);
		
		while(this.dan <2 || this.dan > 9) {
		System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오.");
		this.dan = s.nextInt();
		if(this.dan>=2 && this.dan <=9 )
			break;
		System.out.print("잘못입력했습니다.\n");
		}
		
		for(int i = 1;i<=9;i++) {
			System.out.print(this.dan+" x "+i+" = "+this.dan*i+"\n");
		}
	}
	
	
	
}
