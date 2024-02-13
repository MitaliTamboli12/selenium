package Basics;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("Mitali123");
		driver.findElement(By.name("password")).sendKeys("Mitali1234");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
		Thread.sleep(2000);
		driver.quit();
	}
}
