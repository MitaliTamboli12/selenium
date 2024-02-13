package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photoManager = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		//to switch to frames
		driver.switchTo().frame(photoManager);
		
		//images
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trashBox = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));
		
		//To use actions class
		Actions action = new Actions(driver);
		
		//To drag images to trashbox
		action.dragAndDrop(image1,trashBox ).perform();
		Thread.sleep(2000);
		//action.dragAndDrop(image2, trashBox).perform();
		action.dragAndDropBy(image2, 500, 0).perform(); ////ToPerformDragAndDropBy method
		Thread.sleep(2000);
		//action.dragAndDrop(image3, trashBox).perform(); 
		action.clickAndHold(image3).moveToElement(trashBox).release().perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, trashBox).perform();
		Thread.sleep(2000);
		
		//To drag images from trashbox to gallery
		action.dragAndDrop(image1, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, gallery).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
