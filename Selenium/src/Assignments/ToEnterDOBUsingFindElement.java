package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterDOBUsingFindElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//option[text()='12']")).click();
		driver.findElement(By.xpath("//option[text()='Dec']")).click();
		driver.findElement(By.xpath("//option[text()='1999']")).click();

	}

}
