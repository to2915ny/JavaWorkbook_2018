package stepD;

import java.util.Scanner;

public class StepD4 {
	private int i=0,count_all,count_young,birth_year;
	private int age;
	
	public StepD4(){
		input();
		}
	public void printAge() {
		Scanner s = new Scanner(System.in);
		for(i=0;i<count_all;i++) {
			System.out.print("태어난 년도 입력.");
			this.birth_year = s.nextInt();
			this.age = 2014 - this.birth_year +1;
			if(this.age<20)
				this.count_young++;
		}
		
		System.out.print("가족들 중에 미성년자는 모두"+this.count_young+" 입니다.\n");
			
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("가족이 몇명인지 입력하세요.");
		this.count_all = s.nextInt();
	}	
}
