package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBySurroundings {

	public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.shoppersstack.com/");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4']/../..//button[@id='addToCart']")).click();

	}

}
