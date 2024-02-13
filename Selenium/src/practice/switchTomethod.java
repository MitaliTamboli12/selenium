package practice;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class switchTomethod {
   public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	String parentId = driver.getWindowHandle();
	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	searchBox.sendKeys("toys");
	searchBox.sendKeys(Keys.ENTER);
	driver.findElement(By.partialLinkText("Imagimake Mapology")).click();
	Set<String> allwindowIds = driver.getWindowHandles();
	allwindowIds.remove(parentId);
	for(String windowId:allwindowIds ) {
		driver.switchTo().window(windowId);
		driver.close();
		Thread.sleep(2000);
	}
}
}
