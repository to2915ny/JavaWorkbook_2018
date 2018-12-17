package stepB;

import java.util.Scanner;

public class StepB7 {
	
	private int mega,time;
	private long bytes;
	private String usb2;
	
	public StepB7() {
		input();
		}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요.");
		this.mega = s.nextInt();
		System.out.print("USB포트가 2.0이면 Y, 아니면 N을 입력하세요.");
		this.usb2 = s.next();
		
	}
	
	public void timeTaken() {
		String no ="N";
		String yes ="Y";
		System.out.print(this.usb2);
		this.bytes = (long)(this.mega * 1024 * 1024);
		
		if(this.usb2.equals(yes))
			this.time = (int) (this.bytes/ 60000000);
		
		else
			this.time = (int) (this.bytes/1500000);
		
		System.out.print("파일 전송 시간은 " + this.time+ "입니다\n");
	}
	

}
