package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfield {
	@Test (groups = "system")
	public void enfield() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/in/");
		Reporter.log("Enfield got launched successfully",true);
		driver.quit();
	}

}
