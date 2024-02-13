package advanceSeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class ToLearnTestNG { //TestNG Class
	
	@Test(priority = 1,invocationCount = 1,threadPoolSize = 2)
	public void cricbuzz() { //Tesctcase1
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed successfully",true); //TestSteps
		driver.quit();
	}
	
	@Test(priority = 3,invocationCount = 1)//attribute annotations //when invocation count is = 0 it is a way to skip manually
	public void buskinRobbins() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BuskinRobbins got executed successfully",true);
		driver.quit();
	}
	
	@Test(enabled = false) //when invocation = 0 it will skip  //enabled = false is one more way to skip
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed successfully",true);
		driver.quit();
	}

}
