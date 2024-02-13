package Actions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformCkickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("12375426");
		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		//To use actions class
		Actions action = new Actions(driver);
		//Call the methods
		//To call the click and hold methods
		action.clickAndHold(eyeIcon).perform();
		Thread.sleep(3000);
		//To call release method
		action.release(eyeIcon).perform();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
