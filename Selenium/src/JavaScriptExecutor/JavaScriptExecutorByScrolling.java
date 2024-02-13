package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorByScrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.google.co.in/");
//		driver.findElement(By.name("q")).sendKeys("flowers", Keys.ENTER);
//		driver.findElement(By.linkText("Images")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		for (;;) {
//			try {
//				driver.findElement(By.xpath("//div[text()='How to Make Flowers Last Longer: 10+ ...']")).click();
//				break;
//			} catch (Exception e) {
//				js.executeScript("window.scrollBy(0,1000)");
//			}
//
//		}
//		//Scrollintoview method
     	driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		WebElement indianflag = driver.findElement(By.xpath("//td[text()='India']"));
		js.executeScript("arguments[0].scrollIntoView(true);",indianflag); // if we give true then element will be in top of the webpage,if we give false then element will be in bottom of the page.
	//	driver.quit();
	}
}
