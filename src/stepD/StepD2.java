package stepD;

import java.util.Scanner;

public class StepD2 {
private int number,max,min=Integer.MAX_VALUE;
	
	
	public StepD2(){
		resultMaxMin();
		}
	
	 void getMax_Min() {
		 
		if(this.number>= this.max)
			this.max = this.number;
		if(this.number <= this.min)
			this.min = this.number;
		
	}	
	
	public void resultMaxMin() {
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("숫자를 입력하세요.");
			this.number = s.nextInt();
			if(this.number<0 || this.number>100)
				break;
			getMax_Min();
		}
		
		System.out.print("입력한 숫자까지의 가장 큰 수는 "+this.max+"이고, 가장 작은수는"+this.min+" 입니다.\n");
		
	}	

}
