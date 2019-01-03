package stepK;

import java.util.Scanner;

public class StepK4 {
	private double x,y;
	private int fir,sec,thi,four;
	private String kind[]=new String[100];
	public void main() {
		Scanner s = new Scanner(System.in);
		point coord = new point();
		int count;
		System.out.print("몇 개의 좌표를 입력하겠습니까?.");
		count = s.nextInt();
		for(int i=0;i<count;i++) {
		System.out.print((i+1)+"번째 좌표의 X,Y값을 입력하시오.");
		
		this.x=s.nextDouble();
		this.y=s.nextDouble();
		
		if(coord.get_area(this.x, this.y) == 1) {
			fir++;
			this.kind[i] = "1사분면";}
		else if(coord.get_area(this.x, this.y) == 2) {
			sec++;
			this.kind[i] = "2사분면";}
		else if(coord.get_area(this.x, this.y) == 3) {
			thi++;
			this.kind[i] = "3사분면";}
		else if(coord.get_area(this.x, this.y) == 4) {
			four++;
			this.kind[i] = "4사분면";}
		}
		
		System.out.print("========================================\n");
		
		for(int i=0;i<count;i++) 
			System.out.print((i+1)+"번째 좌표는 "+this.kind[i]+"에 위치합니다.\n");
		
		System.out.print("1사분면의 좌표는 모두 "+this.fir+"입니다.\n");
		System.out.print("2사분면의 좌표는 모두 "+this.sec+"입니다.\n");
		System.out.print("3사분면의 좌표는 모두 "+this.thi+"입니다.\n");
		System.out.print("4사분면의 좌표는 모두 "+this.four+"입니다.\n");
		
	}

}
