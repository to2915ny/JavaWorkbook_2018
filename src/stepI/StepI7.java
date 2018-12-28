package stepI;

import java.util.Scanner;

public class StepI7 {
	Scanner s = new Scanner(System.in);
	private int menu,price;
	public StepI7(){
		
		
		showMenu();
	}
	void showMenu() {
		String no ="N";
		int count=1;
		String choice;
		while(true) {
		System.out.print("1.콜라(700원) 2.커피(300원) 3. 레몬주스(1000원) 4. 홍차(500원) 5. 코코아(600원)\n");
		this.price += SelectCan();
		System.out.print("더 필요하십니까 (Y/N)");
		choice = s.next();
		if(choice.equals(no))
			break;
		count++;
		
		}
		System.out.print(count+"개의 음료를 선택하여 총 "+this.price+"입니다.\n");
	
	}
	
	int SelectCan() {
		
		System.out.print("메뉴를 선택해주세요 : ");
		this.menu = s.nextInt();
		
		if(this.menu == 1)
			return 700;
		else if(this.menu == 2)
			return 300;
		else if(this.menu == 3)
			return 1000;
		else if(this.menu == 4)
			return 500;
		else if(menu == 5)
			return 600;
		
		return 0;
		
	}

}
