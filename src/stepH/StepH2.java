package stepH;

import java.util.Random;
import java.util.Scanner;

public class StepH2 {
	private int lotto[] = new int[6];
	private String onemore;

	StepH2(){input();}

	void input(){
	String no = "N";
	Scanner s = new Scanner(System.in);
	int i, count;
	Random generator = new Random();
	do {
		System.out.print("생성된 로또 번호는 ");
	for(i=0;i<6;i++)
		this.lotto[i] = generator.nextInt(45)+1;
	
	for(i=0;i<6;i++) {
		for(count=i+1;count<6;count++) {
			if(this.lotto[i]==this.lotto[count]) {
				this.lotto[i]= generator.nextInt(45)+1;
				i = 0;
			}
		}
	}



	
	for(i=0;i<6;i++)
		System.out.print(lotto[i]+" ");
	System.out.print("입니다\n");
	System.out.print("더 만드시겠습니까? (Y/N)");
	this.onemore = s.next();
	if(this.onemore.equals(no))
		break;
		
	}while(true);
	


	}
}
