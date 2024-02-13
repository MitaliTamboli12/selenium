package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTagnameMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		String tagname = driver.findElement(By.linkText("Try Free")).getTagName();
        System.out.println(tagname);
	}

}
