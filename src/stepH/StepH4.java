package stepH;

import java.util.Random;
import java.util.Scanner;

public class StepH4 {
	private int com_finger,my_finger;
	private int score[][]= new int [2][3]; 
	public StepH4() {input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		Random generator = new Random();

		
		while(true) {
			this.com_finger = generator.nextInt(3)+1;
			System.out.print("가위(1), 바위(2). 보(3)를 입력하세요.\n");
			this.my_finger = s.nextInt();
			if(this.my_finger ==0)
				break;
			else if(this.my_finger ==1 && this.com_finger ==2) { 
				System.out.print("컴퓨터가 낸 것은 바위입니다.---> 컴퓨터 승!\n");
				this.score[0][0]++;
				this.score[1][2]++;
			}
			else if(this.my_finger ==2 && this.com_finger ==3) { 
				System.out.print("컴퓨터가 낸 것은 보입니다.---> 컴퓨터 승!\n");
				this.score[0][0]++;
				this.score[1][2]++;
				
				}
			else if(this.my_finger ==3 && this.com_finger ==1) { 
				System.out.print("컴퓨터가 낸 것은 가위입니다.---> 컴퓨터 승!\n");
				this.score[0][0]++;
				this.score[1][2]++;
			}
			else if(this.my_finger ==1 && this.com_finger ==3) {
				System.out.print("컴퓨터가 낸 것은 보입니다.---> 사용자 승!\n");
				this.score[0][2]++;
				this.score[1][0]++;
			}
			else if(this.my_finger ==2 && this.com_finger ==1) { 
				System.out.print("컴퓨터가 낸 것은 가위입니다.---> 사용자 승!\n");
				this.score[0][2]++;
				this.score[1][0]++;
			}
			else if(this.my_finger ==3 && this.com_finger ==2) {
				System.out.print("컴퓨터가 낸 것은 바위입니다.---> 사용자 승!\n");
				this.score[0][2]++;
				this.score[1][0]++;
			}
			
			
			else if(this.my_finger == this.com_finger) { 
				if(this.com_finger ==1)
				System.out.print("컴퓨터가 낸 것은 가위입니다.---> 비김!\n");
				else if(this.com_finger ==2)
					System.out.print("컴퓨터가 낸 것은 바위입니다.---> 비김!\n");
				else if(this.com_finger ==3)
					System.out.print("컴퓨터가 낸 것은 보입니다.---> 비김!\n");
				this.score[0][1]++;
				this.score[1][1]++;
			
			}
			
			
		}
		System.out.print("컴퓨터: 이긴 횟수는 "+score[0][0]+"회, 진 횟수"+score[0][2]+"회, 비긴횟수는"+score[0][1]+"회 입니다.\n");
		System.out.print("사용자: 이긴 횟수는 "+score[1][0]+"회, 진 횟수"+score[1][2]+"회, 비긴횟수는"+score[1][1]+"회 입니다.\n");

	
	}
}
