package stepB;
import java.util.*;

public class StepBManager {
	public StepBManager(){

	int menu;
	Scanner s = new Scanner(System.in);
	while(true) {
		printf("---------------------\n");
		printf("1. 나이계산 및 미성년자 판정\n");
		printf("2. 온도 상호 변환\n");
		printf("3. 직사각형 넓이 계산 및 정사각형 판정\n");
		printf("4. 아파트 평형 계산 및 종류 판정\n");
		printf("5. 날짜 계산\n");
		printf("6. 점수 계산\n");
		printf("7. 파일 전송 시간 계산\n");
		printf("8, 다양한 조건 판정\n");
		printf("9, 비만 판정\n");
		printf("=>원하는 메뉴는?(0:exit) :");
		menu = s.nextInt();
		if(menu == 0) break;
		switch(menu) {
		case 1:
			
			StepB1 b1 = new StepB1();
			b1.printAge();
			break;
		case 2:
			
			StepB2 b2 = new StepB2();
			b2.temp();
			break;
		case 3:
			
			StepB3 b3 = new StepB3();
			b3.areaCal();
			break;
		case 4:
			StepB4 b4 = new StepB4();
			b4.pyungResult();
			break;
		case 5 :
			
			StepB5 b5= new StepB5();
			b5.calDays();
			break;
		
		case 6 : 
			StepB6 b6 = new StepB6();
			b6.score();
			break;
			
		case 7 : 
			StepB7 b7 = new StepB7();
			b7.timeTaken();
			break;
		case 8 : 
			StepB8 b8 = new StepB8();
			b8.conditions();
			break;
		case 9 :
			StepB9 b9 = new StepB9();
			b9.obesity();
			break;
		}
	}
	
}
void printf(String s){System.out.print(s);} 
}

