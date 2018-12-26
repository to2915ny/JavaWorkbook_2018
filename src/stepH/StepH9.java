package stepH;

import java.util.Scanner;

public class StepH9 {
	private String input;
	private String userList[]=new String[1000];
	private String userInfo[]=new String[1000];
		
		StepH9(){
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

			findUser();
			
		}
			
		}
		
		void findUser() {
			int count=0,index;
			String[] temp;
			temp = this.input.split("###");
			for(int i=0;i<temp.length;i++) {
				count++;
				index = temp[i].indexOf("|");
				this.userList[i]= temp[i].substring(0,index);
				this.userInfo[i] = temp[i].substring(index+1,temp[i].length());
				
			}
			
			System.out.println("--> 총 " + count + "명이 등록되었습니다\n");

			for(int i = 0; i < count; i++) 
				System.out.println("--> "+(i+1)+". " + this.userList[i] + " " + this.userInfo[i]);
			
		}

}
