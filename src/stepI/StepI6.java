package stepI;

import java.util.Random;

public class StepI6 {
	public StepI6() {
		 input();
	}
	
	void input() {
		int big = 0,mid =0 ,small=0;
		
		System.out.print("10개의 숫자를 생성합니다.\n");
		int i=0;
		int random;
		while(i<10) {
			
		random = GetRandom();
		if(random ==1)
			big +=1;
		else if(random ==2)
			mid +=1;
		else
			small +=1;
		i++;
		}
		System.out.print("대 (70 이상): "+big+"회 생성.\n");
		System.out.print("중 (40 이상): "+mid+"회 생성.\n");
		System.out.print("소 (40 미만): "+small+"회 생성.\n");
			
	}
	
	byte GetRandom() {
		Random generator = new Random();
		
			int random = generator.nextInt(100)+1;
			System.out.print("생성된 임의의 숫자는 "+random+" 입니다.\n");
			
			if(random>=70)
				return 1;
			else if(random>=40 && random<70)
				return 2;
			else 
				return 3;
			
			
		
	
		
		
	}

}
