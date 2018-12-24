package stepG;

import java.util.Scanner;

public class StepG6 {
	private int order[]= {0,0,0};
	private int total_sale;
	private int subtotal;
	private int price[] = {1000,6000,3000};
	
	public StepG6() {
		input();
		
	}
	
	void input() {
		System.out.print("세 종류의 제품이 있습니다.\n");
		System.out.print("1.가죽장갑 천원, 2. 털장갑 6천원, 3. 비닐장갑 3천원\n");
		
	}
	
	public void market() {
		Scanner s = new Scanner(System.in);
		int i;
		while(true) {
			for(i=0;i<3;i++) { 
				System.out.print((i+1)+"번 제품은 몇개를 구입하실래요?");
				this.order[i] = s.nextInt();
			}
			if(this.order[0]==0 &&this.order[1]==0 &&this.order[2]==0)
				break;
			for(i=0;i<3;i++) {
				this.subtotal = this.subtotal + this.order[i]*this.price[i];
				
			}
			this.total_sale = this.total_sale + this.subtotal;
			
			System.out.print("판매금액은 "+this.subtotal+" 입니다.\n");
			this.subtotal =0;
		}
		System.out.print("지금까지의 총 매출금액은 " +this.total_sale+" 입니다.\n");
	}
}
