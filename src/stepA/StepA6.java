package stepA;
import java.util.*;
public class StepA6 {

	public static void main(String[] args) {
		// Calculate file size
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요.: ");
		
		int giga = write.nextInt();
		
		int mega = giga * 1024;
		
		int kilo = mega * 1024;
		
		long bytes = (long)kilo * 1024;
		
		System.out.println(mega + " 메가바이트,");
		System.out.println(kilo + " 킬로바이트,");
		System.out.print(bytes + " 바이트");

	}

}
