package stepK;

import java.util.Scanner;

class UserInfo {
	Scanner s = new Scanner(System.in);
	private String id[] = new String[100];
	private int passcode[] = new int[100];
	
	void input(int n) {
		System.out.print("학생의 아이디, 비밀번호를 입력하시오 --> ");
		this.id[n] = s.next();
		this.passcode[n] = s.nextInt();
	}
	
	void print(int index) {
		System.out.println((index+1)+"\t"+this.id[index]+"\t"+this.passcode[index]);
	}
	
}
public class StepK5 {
	public void main() {
		UserInfo user = new UserInfo();
		user.input(0);
		System.out.print("=================================\n");
		System.out.print("등록된 학생 목록은 다음과 같습니다.\n");
		System.out.print("=================================\n");
		System.out.print("번호\t아이디\t비밀번호\n");
		user.print(0);
	}
}
