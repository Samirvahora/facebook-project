
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class swich {

		public static void main(String[] args) {
			
			ChromeDriver driver= new ChromeDriver();
			
			
			driver.get("https://jqueryui.com/");

	driver.findElementByXPath(".//*[@id='sidebar']/aside[1]/ul/li[4]/a").click();
	WebElement a=driver.findElementByXPath(".//*[@id='content']/iframe");	
	driver.switchTo().frame(a);
	driver.findElementByXPath(".//*[@id='selectable']/li[1]").click();
	driver.switchTo().defaultContent();
	driver.findElementByXPath(".//*[@id='sidebar']/aside[1]/ul/li[5]/a").click();
		}


}
