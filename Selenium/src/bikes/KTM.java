package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KTM {
	@Test (groups = "smoke")
     public void ktm() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ktmindia.com/");
		Reporter.log("KTM got launched succesfully",true);
		driver.quit();
	}

}
