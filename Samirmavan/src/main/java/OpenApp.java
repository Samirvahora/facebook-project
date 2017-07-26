import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenApp {
	
	ChromeDriver driver;
	
	
	
	@BeforeMethod
	public void m1(){
		System.out.println("before method-M1");
	}
	
	@AfterMethod
	public void m2(){
		System.out.println("After method-M2");
	}
	
	@Test(priority=1)
	public void openBrowser(){
		driver= new ChromeDriver();
	}
	
	
	@Test(priority=2)
	public void OpenFacebook(){
		
		
		driver.get("https://www.facebook.com/");
		driver.findElementByXPath(".//*[@id='u_0_2']");
		driver.findElementByXPath(".//*[@id='u_0_4']");
		driver.findElementByXPath(".//*[@id='month']");
	}

	@Test(priority=3)
	public void Logout(){
		driver.quit();
		
	}

}

