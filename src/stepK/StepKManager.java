package stepK;

import java.util.Scanner;


public class StepKManager {
	public StepKManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기\n");
			printf("2. 메뉴판 저장하기\n");
			printf("3. 좌표 저장하기\n");
			printf("4. 좌표 저장하기\n");
			printf("5. 사용자 목록 저장하기\n");
			printf("6. 사용자 목록 저장하기\n");
			printf("7. 학생 점수 결과 저장하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepK1 k1 = new StepK1();
				k1.main();
				break;
			case 2:
				
				StepK2 k2 = new StepK2();
				k2.main();
				break;
			case 3:
				
				StepK3 k3 = new StepK3();
				k3.main();
				break;
			case 4:
				StepK4 k4 = new StepK4();
				k4.main();
				break;
			case 5 :
				
				StepK5 k5 = new StepK5();
				k5.main();
				
				break;
			
			case 6 : 
				StepK6 k6 = new StepK6();
				k6.main();
				break;
			case 7 : 
				StepK7 k7 = new StepK7();
				k7.main();
				break;
			
				
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}

}
