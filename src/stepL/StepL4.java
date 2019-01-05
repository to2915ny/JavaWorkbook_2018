package stepL;

import java.util.ArrayList;
import java.util.Scanner;

class StudentInfo{
	Scanner s = new Scanner(System.in);
	ArrayList<StudentInfo> u= new ArrayList<StudentInfo>();
	private String name,adress,sex,bokhak,number;
	private int studentID;
	public StudentInfo() {
		
	}
	StudentInfo(String name, int studentID, String sex, String adress, String number, String bokhak){
		this.name = name;
		this.studentID = studentID;
		this.sex = sex;
		this.adress = adress;
		this.number = number;
		this.bokhak = bokhak;
	}
	void add(String name, int studentID, String sex, String adress, String number, String bokhak) {
		u.add(new StudentInfo(name,studentID,sex,adress,number,bokhak));
		
	}
	void edit() {
		int num,studentid;
		String sex,adress,bokhak,name,number;
		
		System.out.print("==> 수정할 번호를 입력하세요 : ");
		num = s.nextInt();
		System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
		name = s.next();
		studentid = s.nextInt();
		sex = s.next();
		System.out.print("주소를 입력하세요 : ");
		s.nextLine();
		adress= s.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		number = s.next();
		System.out.print("복학생입니까?(Y/N) ");
		bokhak = s.next();
		u.set(num-1,new StudentInfo( name,studentid,sex,adress,number,bokhak));
	}
	
	void namesearch() {
		String checkname;
		System.out.print("검색하실 이름을 입력하세요.==>");
		checkname = s.next();
		System.out.print("이름\t학번\t성별\t주소\t전화번호\t복학생\n");
		for(int i=0;i<u.size();i++) {
			if(u.get(i).name.contains(checkname))
				u.get(i).output();
		}
		System.out.print("검색되었습니다.\n");
		
		
	}
	void bokhaksearch() {
		String checkname = "Y";
		int count = 0;
		System.out.print("이름\t학번\t성별\t주소\t전화번호\t복학생\n");
		for(int i=0;i<u.size();i++) {
			if(u.get(i).bokhak.equals(checkname)) {
				u.get(i).output();
				count++;
			}
		}
		System.out.print("복학생은 "+count+"명입니다.\n");
		
	}
	void adresssearch() {
		String checkname;
		System.out.print("검색하실 이름을 입력하세요.==>");
		checkname = s.next();
		System.out.print("이름\t학번\t성별\t주소\t전화번호\t복학생\n");
		for(int i=0;i<u.size();i++) {
			if(u.get(i).adress.contains(checkname))
				u.get(i).output();
		}
		System.out.print("검색되었습니다.\n");
		
	}
	void delete(int n)  {
		
		
		u.remove(n-1);
		
	}
	void output() {
		System.out.println(this.name+"\t"+this.studentID+"\t"+this.sex+"\t"+this.adress+"\t"+
	this.number+"\t"+this.bokhak);
	}
	void list() {
		System.out.print("이름\t학번\t성별\t주소\t전화번호\t복학생\n");
		for(int i=0;i<u.size();i++)
			u.get(i).output();
	}
}
public class StepL4 {
	Scanner s = new Scanner(System.in);
	;
	public void main() {
		StudentInfo student = new StudentInfo();
		int check,studentid,count = 0;
		String name,sex,adress,bokhak,number;
		while(true) {
			System.out.print("1)학생등록 2)정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==>");
			check = s.nextInt();
			
			if(check == 8) {
				
				System.out.println("-----------------------------------------");
				System.out.print("종료되었습니다.\n");
				break;
				
			}
			else if(check ==1) {
				
				System.out.println("-----------------------------------------");
				System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
				name = s.next();
				studentid = s.nextInt();
				sex = s.next();
				System.out.print("주소를 입력하세요 : ");
				s.nextLine();
				adress= s.nextLine();
				System.out.print("전화번호를 입력하세요 : ");
				number = s.next();
				System.out.print("복학생입니까?(Y/N) ");
				bokhak = s.next();
				count++;
				student.add(name, studentid, sex, adress, number, bokhak);
				System.out.print("총 "+count+"명이 등록되었습니다.\n");
				
				
			}
			else if(check ==2) {
				System.out.println("-----------------------------------------");
				student.list();
				student.edit();
				
			}
			else if(check ==3) {
				System.out.println("-----------------------------------------");
				System.out.print("삭제할 번호를 입력하세요.==>");
				student.delete(s.nextInt());
				System.out.println("삭제되었습니다.");
				count--;
			}
			else if(check ==4) {
				System.out.println("-----------------------------------------");
				student.list();
			}
			else if(check ==5) {
				System.out.println("-----------------------------------------");
				student.namesearch();
				
				
			}
			else if(check ==6) {
				System.out.println("-----------------------------------------");
				student.bokhaksearch();
		}
			else if(check ==7) {
				System.out.println("-----------------------------------------");
				student.adresssearch();
			}
			}
	}

}
