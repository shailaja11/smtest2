package ScratchFramework.ScratchFramework;

import org.testng.log4testng.Logger;

public class CustomerPage {

	
	static Logger logger = Logger.getLogger(CustomerPage.class);
	public static void addCustomerWithDefaultDetails() {
		logger.info("Landing on Customer Page ..");
		
	}

	public static boolean isCustomerCreated() {
		logger.info("Getting Customer info ..");
		return true;
	}

}
