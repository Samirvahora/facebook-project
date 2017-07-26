import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class open{
	ChromeDriver Driver;
	
	
	@Test(priority=1)
	public void openBrowser(){
		Driver=new ChromeDriver();
	}
		//@Test(priority=2,dependsOnMethods={"opneBrowser"})
		public void openFacebook(){
			Driver.get("https://www.facebook.com/");
			String a=Driver.getTitle();
			//Assert.assertEquals(expected, actual);
			//Assert.assertSame(message, expected, actual);
			Assert.assertEquals("Facebook", 'a');
			
			
		}
		@Test(priority=3)
		public void Logout(){
			Driver.quit();
		}
	
		
	}

