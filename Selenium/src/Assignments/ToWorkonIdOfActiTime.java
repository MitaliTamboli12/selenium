package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkonIdOfActiTime {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(3000);
        driver.findElement(By.id("FirstName")).sendKeys("Mitali");
        driver.findElement(By.id("LastName")).sendKeys("Tamboli");
        driver.findElement(By.id("Email")).sendKeys("mitali@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("ABC");
	}

}

