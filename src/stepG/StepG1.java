package stepG;

import java.util.Scanner;

public class StepG1 {
	private int birth_year;
	private int age[] = new int[100];
	private int count_baby,count_young,count_youth,count_person,count_child;
	private int count_adult,count_old;
	
	StepG1(){
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
		}
		
	}
	
	public void printAge() {
		int i;
		for(i=0;i<100;i++) {
			if(this.age[i] ==0)
				break;
			System.out.print((i+1)+"번째 사람의 나이는 "+this.age[i]+" 입니다.\n");
			
			if(this.age[i]<7)
				this.count_baby++;
			else if(this.age[i]>=7 && this.age[i] < 13) 
				this.count_child++;
			else if(this.age[i]>=13 && this.age[i] < 20) 
				this.count_youth++;
			else if(this.age[i]>=20 && this.age[i] < 30) 
				this.count_young++;
			else if(this.age[i]>=30 && this.age[i] < 60) 
				this.count_adult++;
			else 
				this.count_old++;
		}
		System.out.print("유아는 "+this.count_baby+" 입니다.\n");
		System.out.print("어린이는 "+this.count_child+" 입니다.\n");
		System.out.print("청소년은 "+this.count_youth+" 입니다.\n");
		System.out.print("청년는 "+this.count_young+" 입니다.\n");
		System.out.print("중년은 "+this.count_adult+" 입니다.\n");
		System.out.print("노년은 "+this.count_old+" 입니다.\n");
	}
}
