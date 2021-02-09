package kmitl.esd.exercise1.singleton.simple;

import java.util.logging.Logger;

public class SimpleSingletonPattern {
	/**
	 * A main function for showing that the implementation works
	 *
	 * @return void
	 */
	public static void main(String args[]) {
		CompanyManager companyManager = CompanyManager.getInstance();

		Logger.getLogger(SimpleSingletonPattern.class.getName()).info("Simple singleton pattern company manager: " + companyManager);
	}
}
