package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class jawa {
	
	@Test (groups = "integration")
	public void jawaBike() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jawamotorcycles.com/");
		Reporter.log("Jawa got launched successfully", true);
		driver.quit();
	}

}
