package stepL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
class CarList{
	ArrayList<CarList> u= new ArrayList<CarList>();
	private String brand;
	private int num,cost;
	private String date;
	
	public CarList() {
		
	}
	CarList(int num,String brand, String date){
		this.num = num;
		this.brand = brand;
		this.date = date;

		
	}
	void add(int num ,String brand,String date) {
		u.add(new CarList(num,brand,date));
		
	}
	
	void delete(int n) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd hh:mm",Locale.KOREA);
		
		Date before = f.parse(u.get(n-1).date);
		Date after = f.parse(f.format(new Date()));
		long diff = after.getTime() - before.getTime();
		
		int min = (int) (diff /(60 * 1000));
		if(min/10==1)
			this.cost = 0;
		else	
			this.cost = (min/10) *500;
		
		u.remove(n-1);
		System.out.println("현재 시간은 "+f.format(new Date())+" 이므로 주차금액 " +this.cost);
	}
	void output(int n) {
		System.out.println((n+1)+"\t"+this.num+"\t"+this.brand+"\t"+this.date);
	}
	void list() {
		for(int i=0;i<u.size();i++)
			u.get(i).output(i);
	}
}
public class StepL2 {
	public void main() throws ParseException {
		Scanner s = new Scanner(System.in);
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd hh:mm",Locale.KOREA);
		CarList car= new CarList();
		int check,count = 0;
		System.out.print("주차할 수 있는 차의 개수를 입력하세요.");
		count = s.nextInt();
		int total = 0;;
		while(true) {
			
			System.out.print("1)입차 2)출차 3)리스트 4)입차 총개수 5)주차잔여개수 6)종료 ==>");
			check = s.nextInt();
			
			if(check == 6) {
				
				System.out.println("-----------------------------------------");
				System.out.print("종료되었습니다.\n");
				break;
				
			}
			else if(check ==1 && count != 0) {
				System.out.println("-----------------------------------------");
				System.out.print("입차할 차의 번호와 차종을 입력하세요.");
				car.add(s.nextInt(),s.next(),f.format(new Date()));
				car.list();
				System.out.print("입력되었습니다.\n");
				count--;
				total++;
				
			}
		else if(check ==2) {
				System.out.println("-----------------------------------------");
				car.list();
				System.out.print("출차 번호를 입력하세요.==>");
				car.delete(s.nextInt());
				count++;
				total--;
				
			
			}
			else if(check ==3) {
				System.out.println("-----------------------------------------");
				car.list();
				
				
			}
			else if(check ==4) {
				System.out.println("-----------------------------------------");
				System.out.print(total+"개의 차가 등록되어있습니다.\n");
			}
			else if(check ==5) {
				System.out.println("-----------------------------------------");
				
				System.out.print(count+"개의 주차자리가 있습니다.\n");
			}
			
		}
		
	}
}
