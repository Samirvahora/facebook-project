import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class reopen {
	@Test(priority=4)
	public void opennet(){
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
