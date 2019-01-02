package stepJ;

public class StepJ10 {
	StepJ10(){
		input();
	}
	void input() {

		double temp=0;
		for(int i=2;i<=20;i++) {
			System.out.println((i)+"번째 비율 ("+fibonacci(i+1)+"/"+fibonacci(i)+") : "+(double)(fibonacci(i+1))/(double)(fibonacci(i)) );
			if( Math.abs(((double)(fibonacci(i+1))/(double)(fibonacci(i)))-temp) <0.000001) 
				break;
			
			temp = (double)(fibonacci(i+1))/(double)(fibonacci(i));
		}
	}
	
	int fibonacci(int n) {
		
		if(n==1 || n==2)
			return 1;
		else
			return fibonacci(n-1)+ fibonacci(n-2);
	}

}
