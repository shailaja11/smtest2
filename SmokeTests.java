package ScratchFramework.ScratchFramework;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class SmokeTests {
	
	WebDriver driver;
	@Test
	public void verifyLogin(){
		
     HomePage homePage = LoginPage.Login("admin","password");
     
		Assert.assertTrue(homePage.isUserLoggedin());
   
	}

	@Test
	public void verifyCreateCustomer()
	{
		LoginPage loginpage = new LoginPage();
		HomePage homePage = LoginPage.Login("admin","password");
		CustomerPage customerpage =  homePage.gotoCustomerPage();
		
		CustomerPage.addCustomerWithDefaultDetails();
		Assert.assertTrue(CustomerPage.isCustomerCreated());
		
		
	}
	
    @After
	public void closetheBrowser()
	{
	   driver.close();
	}
	
	@Test
	 public void test() throws IOException {

		             // Code to capture the screenshot

		 
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		             // Code to copy the screenshot in the desired location
	
		 FileUtils(scrFile, new File("C:\\CaptureScreenshot\\google.jpg"));     
		
	
		      }

	private void FileUtils(File scrFile, File file) {
		// TODO Auto-generated method stub
		
	}

	
}
