package stepF;

import java.util.Scanner;

public class StepF1 {
	
	private int[] num = new int[10];
	private int first,second,second_max_index,newnum;
	
	public StepF1() {
		
		
	}
	
	
	public void findSecondMax() {
		
		Scanner s = new Scanner(System.in);
		
		for(int i =0; i<10;i++) {
			
			System.out.print((i+1)+"번째 수를 입력하시오.");
			
			this.num[i] = s.nextInt();
			if(i==0) {
				this.first = this.num[i];
				this.second= this.num[i];
			}
			 if(this.num[i]>=this.first) {
				this.second = this.first;
				this.first= this.num[i];
				this.second_max_index = i;
			 }
			 else if(this.num[i]<=this.first && this.num[i]>= this.second) {
				this.second = this.num[i];
				this.second_max_index = i+1;
			}
			
		
				
			
		}
		System.out.print("두 번째로 큰 수는 "+this.second_max_index+"번째 수 "+this.second+"입니다.");
		
	}

}
