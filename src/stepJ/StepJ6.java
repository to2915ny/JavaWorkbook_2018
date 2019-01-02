package stepJ;

public class StepJ6 {
	StepJ6(){
		input();
	}
	void input() {
		System.out.print("1 부터 20까지 피보나치 수는 다음과 같습니다.\n");
		
		for(int i=1;i<=20;i++) 
			System.out.println(i+"번째 : "+fibonacci(i));
		
	
	}
	
	int fibonacci(int n) {
		
		if(n==1 || n==2)
			return 1;
		else
			return fibonacci(n-1)+ fibonacci(n-2);
	}

}
