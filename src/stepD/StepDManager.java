package stepD;

import java.util.Scanner;



public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 1부터 숫자 더하기\n");
			printf("2. 입력 받은 숫자들 중에서 가장 큰 수와 가장 작은 수 구하기\n");
			printf("3. 입력 받은 숫자들의 총합계와 평균 값 구하기\n");
			printf("4. 미성년자 숫자 세기\n");
			printf("5. 직사각형 형태 개수 세기\n");
			printf("6. 아파트 평형 계산 및 종류 판정\n");
			printf("7. 1차 방정식의 좌표 구하기\n");
			printf("8, 2차 방정식의 좌표 구하기\n");
			printf("9, 원하는 구구단의 단 출력하기\n");
			printf("10, 두 수의 배타적 배수 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepD1 d1 = new StepD1();
				d1.accumulate();
				break;
			case 2:
				
				StepD2 d2 = new StepD2();
				
				break;
			case 3:
				
				StepD3 d3 = new StepD3();
				d3.resultCal();
				break;
			case 4:
				StepD4 d4 = new StepD4();
				d4.printAge();
				break;
			case 5 :
				
				StepD5 d5= new StepD5();
				d5.areaCal();
				break;
			
			case 6 : 
				StepD6 d6 = new StepD6();
				d6.pyungResult();
				break;
				
			case 7 : 
				StepD7 d7 = new StepD7();
				d7.linearEqu();
				break;
			case 8 : 
				StepD8 d8 = new StepD8();
				d8.QuadEqu();
				break;
			case 9 :
				StepD9 d9 = new StepD9();
				d9.timeTable();
				break;
			case 10 :
				StepD10 d10 = new StepD10();
				d10.factors();
				break;
			
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}

}
