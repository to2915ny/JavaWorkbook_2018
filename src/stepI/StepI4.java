package stepI;

import java.util.Scanner;

public class StepI4 {
	private int price,menu;
	public StepI4() {
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
		
		this.price += priceCal();
		if(this.menu == 5)
			this.price += 1;
		System.out.print("현재까지의 주문 금액은 "+this.price+" 입니다.\n");
	}
	int priceCal() {
		if(this.menu == 1)
			return 15000;
		else if(this.menu == 2)
			return 10000;
		else if(this.menu == 3)
			return 7000;
		else if(this.menu == 4)
			return 2000;
		else if(menu == 5)
			return -1;
		
		return 0;
		
	}
}
