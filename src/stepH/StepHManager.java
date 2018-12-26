package stepH;

import java.util.Scanner;



public class StepHManager {
	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 숫자 알아 맞추기\n");
			printf("2. 로또 번호 만들기 \n");
			printf("3. 로또 번호 당첨 확인하기\n");
			printf("4. 가위바위보 게임하기\n");
			printf("5. 슬롯머신 만들기\n");
			printf("6. 5개 숫자의 제곱수 조합 구하기\n");
			printf("7. 문자의 개수와 나누어 출력하기\n");
			printf("8. 문자열 바꾸기\n");
			printf("9. 사용자 정보 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepH1 h1 = new StepH1();
				
				break;
			case 2:
				
				StepH2 h2 = new StepH2();
	
				break;
			case 3:
				
				StepH3 h3 = new StepH3();

				break;
			case 4:
				StepH4 h4 = new StepH4();
				break;
			case 5 :
				
				StepH5 h5= new StepH5();
				h5.slotMachine();
				break;
			
			case 6 : 
				StepH6 h6 = new StepH6();
				h6.maxMinPower();
				break;
			case 7 : 
				StepH7 h7 = new StepH7();
				break;
			case 8 : 
				StepH8 h8 = new StepH8();
				break;
			case 9 : 
				StepH9 h9 = new StepH9();
				break;
				
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}

}
