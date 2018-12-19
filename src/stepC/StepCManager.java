package stepC;

import java.util.Scanner;



public class StepCManager {

	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 직사각형 형태 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 연중 날짜 계산\n");
			printf("6. 점수 계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8, 3개의 수 중 최댓값과 최솟값 구하기\n");
			printf("9, 소득세 계산\n");
			printf("10, 간단한 사칙연산 계산기\n");
			printf("11, 윤년 판정\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepC1 c1 = new StepC1();
				c1.printAge();
				break;
			case 2:
				
				StepC2 c2 = new StepC2();
				c2.temp();
				break;
			case 3:
				
				StepC3 c3 = new StepC3();
				c3.areaCal();
				break;
			case 4:
				StepC4 c4 = new StepC4();
				c4.pyungResult();
				break;
			case 5 :
				
				StepC5 c5= new StepC5();
				c5.calDays();
				break;
			
			case 6 : 
				StepC6 c6 = new StepC6();
				c6.score();
				break;
				
			case 7 : 
				StepC7 c7 = new StepC7();
				c7.timeTaken();
				break;
			case 8 : 
				StepC8 c8 = new StepC8();
				c8.conditions();
				break;
			case 9 :
				StepC9 c9 = new StepC9();
				c9.taxCal();
				break;
			case 10:
				StepC10 c10 = new StepC10();
				c10.Cal();
				break;
			case 11:
				StepC11 c11 = new StepC11();
				c11.calendar();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}

}
