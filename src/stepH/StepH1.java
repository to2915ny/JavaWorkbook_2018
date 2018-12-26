package stepH;

import java.util.Random;
import java.util.Scanner;

public class StepH1 {
	private int answer;
	private int try_;

	StepH1(){input();}

	void input(){
	int count=1;
	Scanner s =new Scanner(System.in);
	Random generator = new Random();
	this.answer = generator.nextInt(100)+1;
	while(true){
	System.out.print("1부터 100까지 숫자하나를 맞춰보세요");
	this.try_=s.nextInt();
	if(this.try_<this.answer)
	       System.out.print("좀 더 큰숫자입니다.\n");
	else if(this.try_>this.answer)
	        System.out.print("좀 더 작은 숫자입니다.\n");
	else if(this.try_== this.answer)
	      break;
	count++;
	}
	System.out.print(count+"번만에 숫자를 맞추셨습니다.\n");
	}

}
