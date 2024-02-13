package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterOnDemowebshop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("Mitali");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Tamboli");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("tambolimitali10@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Mitali@12343");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Mitali@12343");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
