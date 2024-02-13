package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseEnumInSendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER); //to perform keys actions we use enum...enum consist of predefined methods.

	}

}
