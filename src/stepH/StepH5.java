package stepH;

import java.util.Random;
import java.util.Scanner;

public class StepH5 {
	private int coins,dummy;
	private int number[] = new int[3];
	Scanner s = new Scanner (System.in);
	Random generator = new Random();
	public StepH5() {input();}
	
	void input() {
		
		System.out.print("사용할 코인의 개수를 입력하세요.");
		this.coins = s.nextInt();
		
	}
	public void slotMachine() {
		int i,count,match_count=0;
		for(i=1;i<=this.coins;i++) {
			System.out.print("게임 "+i+"회 start!!! (아무숫자나 입력하세요)" );
			this.dummy = s.nextInt();
			System.out.print("게임 결과 :");
			for(int j=0;j<3;j++) {
				number[j]=generator.nextInt(9)+1;
				System.out.print(number[j]+" ");
			
				
			}
			for(int j=0;j<3;j++) {
			for(count=j+1;count<3;count++) {
				if(number[j]== number[count])
					match_count++;
					
			}
			}
				if(match_count == 1) {
					System.out.print("--> 숫자 2개 일치.... 코인 2개 증정\n");
					this.coins = this.coins +2;
					match_count =0;
				}
				else if(match_count == 3) {
					System.out.print("--> 숫자 3개 일치.... 코인 4개 증정\n");
					this.coins = this.coins +4;
					match_count =0;
				}
				System.out.print("남아있는 코인은 "+(this.coins-i)+ "입니다.\n");
				
			}
		System.out.print("게입 종료!!\n");
		
		
			
			
			
				
		}
	}
	

