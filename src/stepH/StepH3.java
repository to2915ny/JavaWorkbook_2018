package stepH;

import java.util.Random;
import java.util.Scanner;

public class StepH3 {
	private int[] lotto_com = new int[6];
	private int[] lotto_user = new int[6];
	private int match_count;
	public StepH3(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		Random generator = new Random();
		int i,count=0,j;
		boolean dup;
		while(count<6) {
		//user input
		
		System.out.print("원하는 "+(count+1)+"번째 로또숫자를 입력하세요");
		this.lotto_user[count]=s.nextInt();
		dup = true;
		if(this.lotto_user[count]>45) {
			System.out.print("=> 잘못 입력하셨습니다.\n");
			dup = false;
		}
		
		for(i=0;i<count;i++) {
			if(this.lotto_user[i] == this.lotto_user[count]) {
				System.out.print("=> 잘못 입력하셨습니다.\n");
				dup = false;
				break;
			}
		}
		if(dup)
			count++;
	              
	           
		}
	
		//com input
		for(i=0;i<6;i++)
			this.lotto_com[i] = generator.nextInt(45)+1;
		for(i=0;i<6;i++) {
			for(j=i+1;j<6;j++) {
				if(this.lotto_com[i]==this.lotto_com[j]) {
					this.lotto_com[i]= generator.nextInt(45)+1;
					i = 0;
				}
			}
		}

		System.out.print("이번 주의 로또 번호는 ");
		for(i=0;i<6;i++)
			System.out.print(lotto_com[i]+" ");
		System.out.print("입니다\n");
		//check lotto count
		
		for(i=0;i<6;i++) {
			for(j=0;j<6;j++) {
				if(lotto_com[i]==lotto_user[j])
					match_count++;
					
			}
		}
		System.out.print("일치하는 로또 번호는 "+match_count+"개 입니다.\n");
		
		
	}

}
