package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		//To switch by using int index
		//driver.switchTo().frame(0);
		
		//To switch by using id or name
		//driver.switchTo().frame("send-sms-iframe");
		
		//To Switch by using Webelement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("8549785642");
	
		//To switch back using parentframe
		//driver.switchTo().parentFrame();  //to switch back to immediate parent
		
		//To switch back using defaultContent
		driver.switchTo().defaultContent();  //to switch back to main home page
		
		driver.findElement(By.linkText("About Us")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
