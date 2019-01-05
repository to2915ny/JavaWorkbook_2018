import java.text.ParseException;
import java.util.Scanner;
import stepB.StepBManager;
import stepC.StepCManager;
import stepD.StepDManager;
import stepE.StepEManager;
import stepF.StepFManager;
import stepG.StepGManager;
import stepH.StepHManager;
import stepI.StepIManager;
import stepJ.StepJManager;
import stepK.StepKManager;
import stepL.StepLManager;
public class WBManager {

	public static void main(String[] args) throws ParseException {
		
		
			
				
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
			if(step.equalsIgnoreCase("G"))
				new StepGManager();
			if(step.equalsIgnoreCase("H"))
				new StepHManager();
			if(step.equalsIgnoreCase("I"))
				new StepIManager();
			if(step.equalsIgnoreCase("J"))
				new StepJManager();
			if(step.equalsIgnoreCase("K"))
				new StepKManager();
			if(step.equalsIgnoreCase("L"))
				new StepLManager();
				
				System.out.printf("종료되었습니다.\n");
			
		

	}

}
