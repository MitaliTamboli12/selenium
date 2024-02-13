package Webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToverifyFacebooklogo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
        if(logo==true) {
        	System.out.println("Logo is displaying");
        	
        }else {
        	System.out.println("Logo is not displaying");
        }
	}

}
