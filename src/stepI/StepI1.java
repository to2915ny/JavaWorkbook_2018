package stepI;

import java.util.Scanner;

public class StepI1 {
	private int price,menu;
	public StepI1() {
		while(true) {
		
		 ShowMenu();
		 pick();
		 if(this.menu ==5)
			 break;
		}
		System.out.print("총 주문 금액은 "+this.price+" 입니다.\n");
		
	}
	
	void ShowMenu() {
		System.out.print("1. 피자(15,000원) 2.스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)\n");
		
	}
	
	void pick() {
		Scanner s = new Scanner(System.in);
		System.out.print("메뉴를 선택해주세요.(종료 :5)");
		this.menu = s.nextInt();
		
		if(this.menu == 1)
			this.price += 15000;
		else if(this.menu == 2)
			this.price += 10000;
		else if(this.menu == 3)
			this.price += 7000;
		else if(this.menu == 4)
			this.price += 2000;
		else if(menu == 5)
			return;
		
		System.out.print("현재까지의 주문 금액은 "+this.price+" 입니다.\n");
	}
}	
