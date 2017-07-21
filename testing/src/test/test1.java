package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class test1 {
@Test(priority=1)
	public void t2() {
	
		ChromeDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.google.com");
		Driver.quit();

	}

}
