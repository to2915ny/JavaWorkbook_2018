package stepD;

import java.util.Scanner;

public class StepD5 {
private int width, height,count1,count2,count3,count4,count5;
	
	
	public StepD5() {
		
	}
	
	public void areaCal() {
		Scanner s = new Scanner(System.in);
		
		while(true){
		System.out.print("직사각형의 가로 크기와 세로 크기를 입력하시오.");
		this.width = s.nextInt();
		this.height = s.nextInt();
		if(this.width<0 || this.height<0)
			break;
		countCal();
		}
		

		System.out.print("정사각형 개수는"+this.count1+"입니다.\n");
		System.out.print("좌우로 길쭉한 직사각형 개수는"+this.count2+"입니다.\n");
		System.out.print("위아래로 길쭉한 직사각형개수는"+this.count3+"입니다.\n");
		System.out.print("일반적인 가로형 직사각형개수는"+this.count4+"입니다.\n");
		System.out.print("일반적인 세로형 직사각형개수는"+this.count5+"입니다.\n");
	}
	
	 void countCal() {
	
		if(this.width == this.height )
			this.count1++;
		else if(this.width >= (this.height *2) )
			this.count2++;
		else if(this.height >= (this.width *2) )
			this.count3++;
		else if(this.width > this.height )
			this.count4++;
		else if(this.height > this.width )
			this.count5++;
	
	 
	 }
	 
	 
	 


}

