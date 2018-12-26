package stepH;

import java.util.Scanner;

public class StepH8 {
private String input;
private String findStr;
private String replaceStr;
Scanner s = new Scanner(System.in);
	StepH8(){
		input();
	}
	
	void input() {

		String exit = "x";
		while(true) {
	
		
		System.out.print("문자열을 입력하세요 (x:종료) : ");
		this.input = s.nextLine();	
		if(this.input.equals(exit))
				break;

		System.out.print("찾을 문자열을 입력하세요 : ");
		this.findStr = s.next();	
		System.out.print("바꿀 문자열을 입력하세요 : ");
		this.replaceStr = s.next();	
		findString();
		
	}
		
	}
	
	void findString() {
		int index;
		int findStringlen = this.findStr.length();
		int count=0;
		for(int i=0;i<this.input.length();i++) {
			index = this.input.indexOf(this.findStr,i);
			if(index == -1)
				break;
			else {
				i = index + findStringlen;
				count++;
			}
		}
		System.out.println(this.input.replace(this.findStr, this.replaceStr));
		System.out.println("--> 총 " + count + "번 바뀌었습니다");
		String dummy = s.nextLine();
	}

}
