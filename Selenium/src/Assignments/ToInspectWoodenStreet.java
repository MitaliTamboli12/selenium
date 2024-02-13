package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToInspectWoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
    	for (;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
     		} catch (Exception e) {
				Thread.sleep(2000);
			}
		}
		List<WebElement> Menu = driver.findElements(By.xpath("//ul[@class='container flex']/li")); // //li[@class='menu-show']
		for (WebElement element : Menu) {
			System.out.println(element.getText());
		}

	}
}
