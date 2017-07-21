package test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
@Test(priority=2)
public class test2 {
	public void t1() {
		FirefoxDriver Driver=new FirefoxDriver();
		Driver.get("https:www.facebook.com");

}
}