package stepC;

import java.util.Scanner;

public class StepC7 {
	private int mega;
	private long bytes;
	private byte kind;
	private double time;
	
	public StepC7() {
		input();
		}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요.");
		this.mega = s.nextInt();
		System.out.print("전송방식을 1:Wifi 2:BlueTooth 3:LTE 4:USB에서 선택.");
		this.kind = s.nextByte();
		
	}
	
	public void timeTaken() {
	
		this.bytes = (long)(this.mega * 1024 * 1024);
		
		if(this.kind == 4)
			this.time = (double) (this.bytes/ 60000000);
		
		else if(this.kind == 1)
			this.time = (double) (this.bytes/1500000);
		else if(this.kind == 2)
			this.time = (double) (this.bytes/300000);
		else if(this.kind == 3)
			this.time = (double) (this.bytes/1000000);
		
		System.out.print("파일 전송 시간은 " + this.time+ " 초입니다\n");
	}
}
