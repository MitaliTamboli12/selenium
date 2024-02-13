package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureEntirewebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver(); //cross browser testing
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot) driver;   //typecasting because driver belongs to webdriver
		File temp = ts.getScreenshotAs(OutputType.FILE);   //use getscreenshot method and it will save temperory
		File src = new File("./errorShots/youTube.jpeg");   // to save the shot permanantly create object and write the path
		FileHandler.copy(temp, src); 

	}

}
