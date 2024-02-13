package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPlaySongOnYoutube {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("ajib dastan hai yeh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(1000);
	    WebElement video = driver.findElement(By.xpath("//a[@id='video-title']"));
	    Thread.sleep(5000);
	    video.click();
	 
	    
	}

}