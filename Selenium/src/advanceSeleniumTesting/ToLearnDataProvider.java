package advanceSeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	@DataProvider(name="cred")
   public String[][] toSendData() {
	String[][] sarr ={
		   {"mitali@gmail.com","mitali@123"},
		   {"mitali1@gmail.com","mitali@111"},
		   {"tambolimitali1@gmail.com","tambolim@123"}
    };
	return sarr;
   }
	@Test(dataProvider = "cred")    //dependency injection =fetching the data from data provider to test annotation.
	public void toLogin(String email,String Password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.quit();
	}
}
