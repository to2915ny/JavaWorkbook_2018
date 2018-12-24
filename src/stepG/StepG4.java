package stepG;

import java.util.Scanner;

public class StepG4 {
	private int kind=0,money,charge,total_charge;
	
	public StepG4() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("부동산 거래종류(1: 매매, 2:임대, 0:계산종료)를 입력하세요");
			this.kind = s.nextInt();
			if(this.kind ==0)
				break;
			if(this.kind ==1) {
				System.out.print("부동산 거래금액(원)을 입력하세요: ");
				this.money = s.nextInt();
				if(this.money<50000000) {
					this.charge = (int) (this.money * 0.006);
					if(this.charge>=250000)
						this.charge = 250000;
					this.total_charge = this.total_charge + this.charge;
					System.out.print("이에 대한 중개 수수료는 "+this.charge+"입니다.\n");
				}
						
			
				else if(this.money>=50000000 && this.money<200000000) {
					this.charge = (int) (this.money * 0.005);
					if(this.charge>=800000)
						this.charge = 800000;
					this.total_charge = this.total_charge + this.charge;
					System.out.print("이에 대한 중개 수수료는 "+this.charge+"입니다.");
				}
			
				else if(this.money>=200000000) {
					this.charge = (int) (this.money * 0.004);
					this.total_charge = this.total_charge + this.charge;
					System.out.print("이에 대한 중개 수수료는 "+this.charge+"입니다.");
				}
			}
			if(this.kind==2) {
				System.out.print("부동산 거래금액(원)을 입력하세요: ");
				this.money = s.nextInt();
				if(this.money<20000000) {
					this.charge = (int) (this.money * 0.005);
					if(this.charge>=70000)
						this.charge = 70000;
					this.total_charge = this.total_charge + this.charge;
					System.out.print("이에 대한 중개 수수료는 "+this.charge+"입니다.");
				}
				else if(this.money>=20000000 && this.money<50000000) {
					this.charge = (int) (this.money * 0.005);
					if(this.charge>=200000)
						this.charge = 200000;
					this.total_charge = this.total_charge + this.charge;
					System.out.print("이에 대한 중개 수수료는 "+this.charge+"입니다.");
				}
				else if(this.money>=50000000 && this.money<100000000) {
					this.charge = (int) (this.money * 0.004);
					if(this.charge>=300000)
						this.charge = 300000;
					this.total_charge = this.total_charge + this.charge;
					System.out.print("이에 대한 중개 수수료는 "+this.charge+"입니다.");
				}
				else if(this.money>100000000) {
					this.charge = (int) (this.money * 0.003);
					this.total_charge = this.total_charge + this.charge;
					System.out.print("이에 대한 중개 수수료는 "+this.charge+"입니다.");
				}
			}
		}
		System.out.print("지금까지의 수수료 총액은 "+this.total_charge+"원입니다.\n");
	}
	
}
