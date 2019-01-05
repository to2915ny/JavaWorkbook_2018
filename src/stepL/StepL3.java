package stepL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class Restaurant{
	ArrayList<Restaurant> u= new ArrayList<Restaurant>();
	private int steak,customer,spaghetti,pasta,cost;
	private String member,date;
	public Restaurant() {
		
	}
	Restaurant(int customer,int steak,int spaghetti,int pasta,int cost,String member,String date){
		
		this.customer = customer;
		this.steak = steak;
		this.spaghetti = spaghetti;
		this.pasta = pasta;
		this.member = member;
		this.date = date;
		this.cost = cost;
	}
	void add(int customer,int steak,int spaghetti,int pasta,int cost,String member,String date) {
		u.add(new Restaurant(customer,steak,spaghetti,pasta,cost,member,date));
		
	}
	void delete(int n)  {
		
		
		u.remove(n-1);
		
	}
	void output(int n) {
		System.out.println((n+1)+"\t"+this.customer+"\t"+this.steak+"\t"+this.spaghetti+"\t"+this.pasta+"\t"+
	this.member+"\t"+this.cost+"\t"+this.date);
	}
	void list() {
		System.out.print("번호\t손님수\t스테이크\t스파게티\t파스타\t멤버쉽\t결제금액\t입장시간\n");
		for(int i=0;i<u.size();i++)
			u.get(i).output(i);
	}
}

public class StepL3 {
	Scanner s = new Scanner(System.in);
	public void main() {
		Restaurant rest = new Restaurant();
		SimpleDateFormat f = new SimpleDateFormat("YYYY년 MM월 dd일 hh:mm",Locale.KOREA);
		int check,customer,steak,spag,pasta,cost;
		String member;
		String yes = "Y";
		
		while(true) {
			System.out.print("1)주문 2)결제 3)리스트 4)종료 ==>");
			check = s.nextInt();
			
			if(check == 4) {
				
				System.out.println("-----------------------------------------");
				System.out.print("종료되었습니다.\n");
				break;
				
			}
			else if(check ==1) {
				System.out.println("-----------------------------------------");
				System.out.print("손님 수를 입력하세요.");
				customer = s.nextInt();
				System.out.print("스테이크,스파게티,파스타의 개수를 입력하세요.");
				steak =s.nextInt();
				spag = s.nextInt();
				pasta =s.nextInt();
				System.out.print("멤버십 카드가 있습니까?(Y:있음)");
				member = s.next();
				
				cost = steak * 25000 + spag * 15000 + pasta * 17000;
				if(member.equals(yes))
					cost = (int) (cost * 0.9);
				if(cost < 100000)
					cost = (int) (cost * 1.07);
				else if(cost >100000)
					cost = (int) (cost * 1.1);
				cost = (int) (cost * 1.1);
				
				System.out.print("들어 오신 시간은 "+f.format(new Date())+"입니다.\n");
				System.out.print("총 금액은 "+cost+" 입니다.\n");
				
				
				
				rest.add(customer,steak,spag,pasta,cost,member,f.format(new Date()));
				
			}
			else if(check ==2) {
				System.out.println("-----------------------------------------");
				rest.list();
				System.out.print("결제하실 번호를 입력하세요.==>");
				rest.delete(s.nextInt());
				System.out.print("결제되었습니다.==>");
			}
			
			else if(check ==3) {
				System.out.println("-----------------------------------------");
				rest.list();
			}
				
		}
		
	}

}
