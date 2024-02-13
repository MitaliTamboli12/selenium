package Webelementmethods;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreWebelementmethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("mitali23@gmail.com");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
        String errormsg = driver.findElement(By.xpath("//span[contains (text(),'unsuccessful')]")).getText();
        System.out.println(errormsg);
	
	}

}
