package stepG;

import java.util.Scanner;


public class StepGManager {
	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정 \n");
			printf("3. 점수 계산\n");
			printf("4. 부동산 중개 수수료 계산기\n");
			printf("5. PC방 이용료 계산기\n");
			printf("6. 쇼핑몰 매출 계산기\n");
			printf("7. 놀이공원 매표소\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepG1 g1 = new StepG1();
				g1.printAge();
				break;
			case 2:
				
				StepG2 g2 = new StepG2();
				g2.checkTemp();
				break;
			case 3:
				
				StepG3 g3 = new StepG3();
				g3.score();
				break;
			case 4:
				StepG4 g4 = new StepG4();
				break;
			case 5 :
				
				StepG5 g5= new StepG5();
				
				break;
			
			case 6 : 
				StepG6 g6 = new StepG6();
				g6.market();
				break;
			case 7 : 
				StepG7 g7 = new StepG7();
				g7.amusementPark();
				break;
				
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}
}
