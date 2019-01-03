package stepK;

import java.util.Scanner;

class point{
	int get_area(double x, double y) {
		if(x>0 && y>0)
			return 1;
		else if(x<0 && y>0)
			return 2;
		else if(x<0 && y<0)
			return 3;
		else if(x ==0 && y ==0)
			return 0;
		else 
			return 4;
	}
}
public class StepK3 {
	private double x,y;
	private int fir,sec,thi,four;
	private String kind;
	public void main() {
		Scanner s = new Scanner(System.in);
		point coord = new point();
		
		System.out.print("좌표의 X,Y값을 입력하시오.");
		
		this.x=s.nextDouble();
		this.y=s.nextDouble();
		
		if(coord.get_area(this.x, this.y) == 1) {
			fir++;
			this.kind = "1사분면";}
		else if(coord.get_area(this.x, this.y) == 2) {
			sec++;
			this.kind = "2사분면";}
		else if(coord.get_area(this.x, this.y) == 3) {
			thi++;
			this.kind = "3사분면";}
		else if(coord.get_area(this.x, this.y) == 4) {
			four++;
			this.kind = "4사분면";}
		System.out.print("========================================\n");
		
		System.out.print("1번째 좌표는 "+this.kind+"에 위치합니다.\n");
		System.out.print("1사분면의 좌표는 모두 "+this.fir+"입니다.\n");
		System.out.print("2사분면의 좌표는 모두 "+this.sec+"입니다.\n");
		System.out.print("3사분면의 좌표는 모두 "+this.thi+"입니다.\n");
		System.out.print("4사분면의 좌표는 모두 "+this.four+"입니다.\n");
		
	}

}
