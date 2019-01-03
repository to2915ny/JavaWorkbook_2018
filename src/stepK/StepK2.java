package stepK;

import java.util.Scanner;

public class StepK2 {
	Scanner s = new Scanner(System.in);
	public void main() {
		MenuPan menu = new MenuPan();
		int count,i;
		System.out.print("등록하실 메뉴의 개수를 입력하시오 : ");
		count = s.nextInt();
		for(i=0;i<count;i++) {
		menu.input(i);
		}
		System.out.print("========================================\n");
		System.out.print("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		for(i=0;i<count;i++) {
			menu.output(i);
			}
		
	}
	
}
