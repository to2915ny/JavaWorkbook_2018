package stepE;

import java.util.Scanner;


public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 입력한 숫자 크기의 정사각형 출력하기\n");
			printf("2. 입력한 숫자 크기의 높이늘 갖는 우직각 삼각형 출력하기\n");
			printf("3. 입력한 숫자 크기의 높이를 갖는 이등변 삼각형 출력하기\n");
			printf("4. 홀수단 또는 짝수단의 구구단 출력하기\n");
			printf("5. 홀수단 또는 짝수단의 구구단을 열의 개수를 맞추어 출력하기\n");
			printf("6. 2차원 숫자 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepE1 e1 = new StepE1();
				e1.hashtagCal();
				break;
			case 2:
				
				StepE2 e2 = new StepE2();
				e2.starCal();
				break;
			case 3:
				
				StepE3 e3 = new StepE3();
				e3.starCal2();
				break;
			case 4:
				StepE4 e4 = new StepE4();
				e4.timeTable();
				break;
			case 5 :
				
				StepE5 e5= new StepE5();
				e5.timeTable2();
				break;
			
			case 6 : 
				StepE6 e6 = new StepE6();
				e6.twoDimension();
				break;
				
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}
}
