package stepG;

import java.util.Scanner;

public class StepG5 {
	
	private int hour,minute,charge,total_charge;
	
	public StepG5() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("사용한 시간을 시간과 분으로 입력하세요 : ");
			this.hour = s.nextInt();
			this.minute = s.nextInt();
			if(this.hour ==0  && this.minute ==0)
				break;
			if(this.hour<2) {
			this.charge = this.hour *2000;
				if(this.minute>0 && this.minute <30)
					this.charge= this.charge +1000;
				else if(this.minute >30 && this.minute <60)
					this.charge = this.charge +2000;
			this.total_charge = this.total_charge + this.charge;
			}
			else if(this.hour>= 2 && this.hour<3) {
				this.charge = this.hour* 2000;
				if(this.minute>0 && this.minute <30)
					this.charge= this.charge +1000;
				else if(this.minute >30 && this.minute <60)
					this.charge = this.charge +2000;
				this.charge = (int) (this.charge * 0.95);
				this.total_charge=this.total_charge+this.charge;
			}
			else if(this.hour>= 3 && this.hour<5) {
				this.charge = this.hour* 2000;
				if(this.minute>0 && this.minute <30)
					this.charge= this.charge +1000;
				else if(this.minute >30 && this.minute <60)
					this.charge = this.charge +2000;
				this.charge = (int) (this.charge * 0.90);
				this.total_charge=this.total_charge+this.charge;
			}
			else if(this.hour>=5) {
				this.charge = this.hour* 2000;
				if(this.minute>0 && this.minute <30)
					this.charge= this.charge +1000;
				else if(this.minute >30 && this.minute <60)
					this.charge = this.charge +2000;
				this.charge = (int) (this.charge * 0.80);
				this.total_charge=this.total_charge+this.charge;
			}
			System.out.print("고객님의 이용료는 " +this.charge+" 입니다.\n");
			this.charge =0;
			
		}
		System.out.print("지금까지의 이용료 총금액은 "+this.total_charge+"입니다.\n");
	
	}

}
