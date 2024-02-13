package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
        WebElement usernametextfield = driver.findElement(By.id("username"));
        usernametextfield.clear();
        usernametextfield.sendKeys("Mitali@123");
        WebElement passwordTextfield = driver.findElement(By.id("password"));
        passwordTextfield.clear();
        passwordTextfield.sendKeys("mitali12345");
     
	}

}
