package stepK;

import java.util.Scanner;

class MenuPan{
	private int num[] = new int[100];
	private String name[] = new String[100];
	private String origin[] = new String[100];
	private int cost[] = new int[100];
	
	public MenuPan() {
		
	}
	
	void input(int n) {
		Scanner s = new Scanner(System.in);
		System.out.print("메뉴의 번호, 메뉴명,원산지, 가격을 입력하시오. ");
		this.num[n] = s.nextInt();
		this.name[n] = s.next();
		this.origin[n] = s.next();
		this.cost[n] = s.nextInt();
		
		
		
		
	}
	void output(int n) {
		System.out.println(this.num[n]+"\t"+this.name[n]+"\t"+this.origin[n]+"\t"+this.cost[n]);
	}
}
public class StepK1 {
	public void main() {
		MenuPan menu = new MenuPan();
		menu.input(0);
		System.out.print("========================================\n");
		System.out.print("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		menu.output(0);
	}
	
	

}
