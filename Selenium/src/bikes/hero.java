package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hero {
	@Test (groups = "smoke")
	  public void herobike() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.heromotocorp.com/en-in.html");
		Reporter.log("Hero got launched successfully",true);
		driver.quit();
	}

}
