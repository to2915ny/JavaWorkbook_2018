package stepH;

import java.util.Scanner;

public class StepH7 {
	private String input;
	
	StepH7(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		String exit = "x";
		while(true) {
	
		
		System.out.print("문자열을 입력하세요 (x:종료) : \n");
		this.input = s.nextLine();	
		if(this.input.equals(exit))
				break;
		this.input = this.input.trim();
		
		String input[] = this.input.split("");
		System.out.print("총 문자의 개수는 "+input.length+ "입니다.\n");
		for(int i =0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}
		
	}

}
