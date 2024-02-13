package advanceSeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;


public class BaseClass {
	public WebDriver driver;
	String expectedwelcomePageTitle = "Demo Web Shop";
    //@Parameters("browserName")
	@BeforeClass
//	public void toLaunch(String bName) {
	public void toLaunch() {
//    	if (bName.equalsIgnoreCase("edge")) {
//    			driver =new EdgeDriver();
//		} else if (bName.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
//		}
		
		Reporter.log("Browser got launched successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized successfully",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	}
	
	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualwelcomePageTitle = driver.getTitle();
		if(actualwelcomePageTitle.equals(expectedwelcomePageTitle)) {
			Reporter.log("Navigated to demowebshop successfully", true);
		}else {
			Reporter.log("Failed to Navigated to demowebshop",true);
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("mitali@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Mitali@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Navigated to Homepage successfully",true);
	}
	
	@AfterMethod
	  public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Successfully logged out",true);
	}
	
	@AfterClass
	public void toCloseBrowser() {
		Reporter.log("Browser got closed successfully",true);
		driver.quit();
	}
}
