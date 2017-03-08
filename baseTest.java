package ScratchFramework.ScratchFramework;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.log4testng.Logger;

public class baseTest {

	
	WebDriver driver;
	
	@beforeClass
	public void beforeclass(){
		
		driver = new FirefoxDriver();
		Logger logger = Logger.getLogger(Before.class);
		driver.get("www.monster.com");
		logger.info("Landing on Customer Page ..");
		
		
	}
}
