package stepF;

import java.util.Scanner;


public class StepFManager {
	public StepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 두 번째로 큰 수의 순서 찾기\n");
			printf("2. 심사점수 계산\n");
			printf("3. 5명의 국, 영, 수 3과목 점수의 과목별 총점, 평균값 구하기\n");
			printf("4. 비만 판정\n");
			printf("5. 5층 아파트의 거주자 숫자 구하기\n");
			printf("6. 5층 아파트의 층별, 호수별 거주자 숫자 구하기\n");
			printf("7. 겹치지 않는 숫자 10개 입력 받기\n");
			printf("8. 배열을 이용한 연중 날짜 계산\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepF1 f1 = new StepF1();
				f1.findSecondMax();
				break;
			case 2:
				
				StepF2 f2 = new StepF2();
				f2.evaluate();
				break;
			case 3:
				
				StepF3 f3 = new StepF3();
				f3.totalSumAvg();
				break;
			case 4:
				StepF4 f4 = new StepF4();
				f4.bmiCal();
				break;
			case 5 :
				
				StepF5 f5= new StepF5();
			
				break;
			
			case 6 : 
				StepF6 f6 = new StepF6();
				
				break;
			case 7 : 
				StepF7 f7 = new StepF7();

				break;
			case 8 : 
				StepF8 f8 = new StepF8();
				f8.calendar();
				break;
				
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}
}
