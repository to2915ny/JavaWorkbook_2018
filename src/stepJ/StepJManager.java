package stepJ;

import java.util.Scanner;



public class StepJManager {
	public StepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 심사점수 계산 \n");
			printf("3. 물의 온도 구간 판정\n");
			printf("4. 연중 날짜 계산 메소드를 이용한 날짜 간격 세기\n");
			printf("5. 주차 관리 시스템\n");
			printf("6. 피보나치 수 구하기\n");
			printf("7. 2의 제곱수 구하기\n");
			printf("8. Ackermann 수 구하기\n");
			printf("9. pow() 메소드 만들기\n");
			printf("10. 피보나치 수열로 황금비율 구하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepJ1 j1 = new StepJ1();
				break;
			case 2:
				
				StepJ2 j2 = new StepJ2();

				break;
			case 3:
				
				StepJ3 j3 = new StepJ3();
				break;
			case 4:
				StepJ4 j4 = new StepJ4();
				break;
			case 5 :
				
				StepJ5 j5= new StepJ5();
				
				break;
			
			case 6 : 
				StepJ6 j6 = new StepJ6();
				break;
			case 7 : 
				StepJ7 j7 = new StepJ7();
				break;
			case 8 : 
				StepJ8 j8 = new StepJ8();
				break;
			case 9 : 
				StepJ9 j9 = new StepJ9();
				break;
			case 10 : 
				StepJ10 j10 = new StepJ10();
				break;
				
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}
}
