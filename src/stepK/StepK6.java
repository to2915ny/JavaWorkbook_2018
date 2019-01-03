package stepK;

import java.util.Scanner;

public class StepK6 {
	public void main() {
		Scanner s = new Scanner(System.in);
		UserInfo user = new UserInfo();
		System.out.print("등록할 학생의 명수는?");
		int count = s.nextInt();
		
		for(int i=0;i<count;i++) 
			user.input(i);
		
		System.out.print("=================================\n");
		System.out.print("등록된"+count+"명의 학생 목록은 다음과 같습니다.\n");
		System.out.print("=================================\n");
		System.out.print("번호\t아이디\t비밀번호\n");
		
		for(int i=0;i<count;i++) 
			user.print(i);
			
	}

}
