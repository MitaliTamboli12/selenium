package Assignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToBookFlightOnSkyScanner {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.skyscanner.co.in/");
		driver.findElement(By.xpath("//button[@data-testid='depart-btn']")).click();
		for (;;) {
			try {
				driver.findElement(By.xpath("//h2[text()='August']/..//button[text()='13']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//button[@aria-label='Next month, June']")).click();
			}

		}
		driver.quit();
	}
}
