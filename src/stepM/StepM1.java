package stepM;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



class MenuList{
	Scanner s = new Scanner(System.in);
	private String menu,origin;
	private int cost;
	ArrayList<MenuList> u= new ArrayList<MenuList>();
	
	MenuList(String menu,String origin,int cost) {
		
		this.menu = menu;
		this.origin = origin;
		this.cost = cost;
	
	}
	
	public MenuList() {
		
	}

	void add(String menu,String origin,int cost) {
		u.add(new MenuList(menu,origin,cost));
		
	}
	void edit() {
		int num;
		
		System.out.print("==> 수정할 번호를 입력하세요 : ");
		num = s.nextInt();
		System.out.print("==> 메뉴의 메뉴명,원산지, 가격을 입력하시오. : ");
		u.set(num-1,new MenuList( s.next(),s.next(),s.nextInt()));
		
	}
	void delete(int n) {
		
		u.remove(n-1);
		
	}
	void output(int n) {
		System.out.println((n+1)+"\t"+this.menu+"\t"+this.origin+"\t"+this.cost);
	}
	String outputForSave(int n) {
		return (n+1)+"\t"+this.menu+"\t"+this.origin+"\t"+this.cost;
	}
	void list() {
		System.out.print("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		for(int i=0;i<u.size();i++)
			u.get(i).output(i);
	}
	void save() throws IOException {
		  FileWriter fw = new FileWriter("/Users/seungyonglee/eclipse-workspace/JavaWorkbook_2018/src/stepM/stepm1.txt");
		  fw.write("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		  for(int i=0;i<u.size();i++)
			  fw.write(u.get(i).outputForSave(i)+"\n");
		  fw.close();
			
	}
}

public class StepM1 {
	public void main() throws IOException {
		Scanner s = new Scanner(System.in);
		
		MenuList menu = new MenuList();
		int check,count = 0;
		while(true) {
			System.out.print("1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==>");
			check = s.nextInt();
			
			if(check == 6) {
				
				System.out.println("-----------------------------------------");
				menu.save();
				break;
				
			}
			else if(check ==1) {
				System.out.println("-----------------------------------------");
				System.out.print("메뉴의 메뉴명, 원산지,가격을 입력하시오.");
				menu.add(s.next(),s.next(),s.nextInt());
				System.out.print("입력되었습니다.\n");
				count++;
				
			}
			else if(check ==2) {
				System.out.println("-----------------------------------------");
				menu.list();
				menu.edit();
				System.out.println("수정되었습니다.");
			}
			else if(check ==3) {
				System.out.println("-----------------------------------------");
				System.out.print("삭제할 번호를 입력하세요.==>");
				menu.delete(s.nextInt());
				System.out.println("삭제되었습니다.");
				count--;
			}
			else if(check ==4) {
				System.out.println("-----------------------------------------");
				menu.list();
			}
			else if(check ==5) {
				System.out.println("-----------------------------------------");
				System.out.print(count+"개의 메뉴가 등록되어있습니다.\n");
			}
		}
		
	}
		
	

}
