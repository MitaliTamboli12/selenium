package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMethodAttribute {
	public static ChromeDriver driver;
 @Test
 public void createAccount() {
	  driver = new ChromeDriver();
	 driver.get("https://demowebshop.tricentis.com/register");
	 driver.findElement(By.id("FirstName")).sendKeys("mitali");
	 driver.findElement(By.id("LastName")).sendKeys("tamboli");
	 driver.findElement(By.id("Email")).sendKeys("tamboli@gmail.com");
	 driver.findElement(By.id("Password")).sendKeys("mita1@123");
	 driver.findElement(By.id("ConfirmPassword")).sendKeys("mita1@123");
	 driver.findElement(By.id("register-button")).click();
	 Reporter.log("Account Created Successfully", true);
 }
 
  @Test (dependsOnMethods = "createAccount")
  public void login() {
	driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("tamboli@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("mita1@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Reporter.log("Logged in Successfully", true);
	
  }
 
// @Test(dependsOnMethods = "createAccount") //When methods are depend on one another
// public void editAccount() {
//	 Reporter.log("Account Edited Successfully", true);
// }
// @Test(dependsOnMethods = {"editAccount","createAccount"}) // When method is depend on many methods
// public void deleteAccount() {
//	 Reporter.log("Account Deleted Successfully", true);
// }
 
}
