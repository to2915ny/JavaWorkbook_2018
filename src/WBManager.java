import java.util.Scanner;
import stepB.StepBManager;
import stepC.StepCManager;
import stepD.StepDManager;
import stepE.StepEManager;
import stepF.StepFManager;

public class WBManager {

	public static void main(String[] args) {
		
		
			
				
			Scanner s = new Scanner(System.in);
			System.out.print("원하는 Step은?");
			String step = s.next();
			if(step.equalsIgnoreCase("B")) 
					new StepBManager();
			if(step.equalsIgnoreCase("C"))
					new StepCManager();
			if(step.equalsIgnoreCase("D"))
					new StepDManager();
			if(step.equalsIgnoreCase("E"))
					new StepEManager();
			if(step.equalsIgnoreCase("F"))
					new StepFManager();
				
				System.out.printf("종료되었습니다.\n");
			
		

	}

}
