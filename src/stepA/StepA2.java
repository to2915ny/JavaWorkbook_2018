package stepA;

import java.util.*;

public class StepA2{ //직사각형 넓이 계산

	public static void main(String[] args) { //넓이 계산
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 크기를 입력하시오. : ");
		
		int width = write.nextInt();
		
		System.out.print("직사각형의 세로 크기를 입력하시오. : ");
		
		int height = write.nextInt();
		
		int area = width * height;
		
		System.out.print("직사각형의 넓이는 "+ area + " 입니다.");
		
		
	
	}

}
