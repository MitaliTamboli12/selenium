package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAddProductToCartOfWoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
//		Thread.sleep(3000);
//		for (;;) {
//			try {
//				driver.findElement(By.id("loginclose1")).click();
//				break;
//     		} catch (Exception e) {
//				Thread.sleep(2000);
//			}
//		}
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.partialLinkText("Berlin")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();
		
		driver.findElement(By.linkText("Bedroom")).click();
		driver.findElement(By.partialLinkText("Walken")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();
		
		driver.findElement(By.linkText("Mattresses")).click();
		driver.findElement(By.partialLinkText("Penguin")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();	
		
	    driver.findElement(By.xpath("//a[@title='Cart']")).click();

	}

}
