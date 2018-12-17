package stepB;
import java.util.Scanner;
public class StepB5 {
	
	private int days,seconds,m_count;
	
	public StepB5() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("날수를 입력하세요.");
		this.days = s.nextInt();
		
	}
	
	public void calDays() {
		this.seconds = days * 24 * 60 * 60;
		System.out.print("날수에 해당되는 기간은 모두 " +this.seconds+" 입니다.\n");
		this.m_count = this.seconds / 1000000;
		if(this.m_count>0)
			System.out.print("100만 초가 모두 "+this.m_count+" 번이나 포함됩니다.\n");
		
	}

}
