package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseLocatorsinAmazon {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
	driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
