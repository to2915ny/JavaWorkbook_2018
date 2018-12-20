package stepD;

import java.util.Scanner;

public class StepD3 {

private int number,count=0;
private int totalsum;
private double average;
	
	
	public StepD3(){
	
		}
	
	 void getTotal() {
	
		this.totalsum = this.totalsum+ this.number;
		
		
	}	
	
	public void resultCal() {
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("0부터 100 사이의 숫자를 입력하세요.");
			this.number = s.nextInt();
			if(this.number<0 || this.number>100)
				break;
			getTotal();
			this.count++;
		};
		
		this.average = (double) this.totalsum/this.count;
		
		System.out.print("입력한 "+this.count+" 개의 숫자들의 총합계는 "+this.totalsum+"이고, 평균값은 "+this.average+" 입니다.\n");
		
	}	

}
