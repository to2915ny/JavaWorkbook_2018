package stepJ;

import java.util.Scanner;

public class StepJ1 {
	private int birth_year;
	private int age[] = new int[100];
	private int count_baby,count_young,count_youth,count_person,count_child;
	private int count_adult,count_old;
	
	StepJ1(){
		input();
	}
	void input(){
		Scanner s = new Scanner(System.in);
		int i;
		for(i=0;i<100;i++) {
			System.out.print((i+1)+"번째 사람의 태어난 년도를 입력하시오.");
			this.birth_year = s.nextInt();
			if(this.birth_year >2012)
				break;
			this.age[i] = 2012 - this.birth_year +1;
			if(AskAge(this.age[i]) ==5)
				count_old++;
			else if(AskAge(this.age[i]) ==4)
				count_adult++;
			else if(AskAge(this.age[i]) ==3)
				count_young++;
			else if(AskAge(this.age[i]) ==2)
				count_youth++;
			else if(AskAge(this.age[i]) ==1)
				count_child++;
			else if(AskAge(this.age[i]) ==0)
				count_baby++;
			System.out.print((i+1)+"번째 사람의 나이는 "+this.age[i]+" 입니다.\n");
		}
		
		System.out.print("유아는 "+this.count_baby+" 입니다.\n");
		System.out.print("어린이는 "+this.count_child+" 입니다.\n");
		System.out.print("청소년은 "+this.count_youth+" 입니다.\n");
		System.out.print("청년는 "+this.count_young+" 입니다.\n");
		System.out.print("중년은 "+this.count_adult+" 입니다.\n");
		System.out.print("노년은 "+this.count_old+" 입니다.\n");
		
	}
	
	 int AskAge(int birthyear) {
		 if(birthyear<7)
				return 0;
			else if(birthyear>=7 && birthyear < 13) 
				return 1;
			else if(birthyear>=13 && birthyear < 20) 
				return 2;
			else if(birthyear>=20 && birthyear < 30) 
				return 3;
			else if(birthyear>=30 && birthyear < 60) 
				return 4;
			else 
				return 5;
		
	}
	
	
		
	
}
