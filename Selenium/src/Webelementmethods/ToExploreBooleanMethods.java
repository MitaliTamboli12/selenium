package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.instagram.com/");
		// Thread.sleep(5000);
		// WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		// System.out.println("Before Entering Data");
		// System.out.println(loginButton.isDisplayed());
		// System.out.println(loginButton.isEnabled());
		// System.out.println("==========================");
		// System.out.println("After Entering Data");
		// driver.findElement(By.name("username")).sendKeys("Mitali1234567");
		// driver.findElement(By.name("password")).sendKeys("1234567");
		// System.out.println(loginButton.isDisplayed());
		// System.out.println(loginButton.isEnabled());

		// To Learn isSelected

		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(4000);
		WebElement select = driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']"));
		System.out.println(select.isSelected());
		System.out.println("After Selecting");
		select.click();
		System.out.println(select.isSelected());

		driver.close();

	}

}
