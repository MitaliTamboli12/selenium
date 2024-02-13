package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("mitali@gmail.com");
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
//		Rectangle rect = driver.findElement(By.xpath("//input[@value='Log in']")).getRect();
//		System.out.println(rect.getHeight());
//		System.out.println(rect.getWidth());
//		System.out.println(rect.getDimension());
//		System.out.println(rect.getPoint());
//		System.out.println(rect.getX());
//		System.out.println(rect.getY());
////		Dimension size = driver.findElement(By.xpath("//input[@value='Log in']")).getSize();
////		Point loc = driver.findElement(By.xpath("//input[@value='Log in']")).getLocation();
////		System.out.println(loc.getX());
////		System.out.println(loc.getY());
////		System.out.println(size.getHeight());
////		System.out.println(size.getWidth());
////		System.out.println(size);
//		WebElement msg = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]"));
//		String att = driver.findElement(By.xpath("//input[@value='Log in']")).getAttribute("class");
//		String msg1 = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getTagName();
//		String msg2 = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
//		System.out.println(msg2);
//	    System.out.println(msg1);
//		System.out.println(att);
//		System.out.println(msg.getCssValue("color"));
        Thread.sleep(3000);
        driver.quit();
	}

}
