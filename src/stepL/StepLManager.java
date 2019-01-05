package stepL;

import java.text.ParseException;
import java.util.Scanner;


public class StepLManager {
	public StepLManager() throws ParseException {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기\n");
			printf("2. 주차장 입출차\n");
			printf("3. 식당 주문 관리\n");
			printf("4. 학생 정보 관리\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepL1 l1 = new StepL1();
				l1.main();
				break;
			case 2:
				
				StepL2 l2 = new StepL2();
				l2.main();
				break;
			case 3:
				
				StepL3 l3 = new StepL3();
				l3.main();
				break;
			case 4:
				
				StepL4 l4 = new StepL4();
				l4.main();
				break;
			
			
				
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}

}
