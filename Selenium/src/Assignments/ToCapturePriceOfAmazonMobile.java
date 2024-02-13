package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturePriceOfAmazonMobile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("mobiles");
		searchBox.sendKeys(Keys.ENTER);
		
		//To get mobile
		driver.findElement(By.xpath("//span[text()='POCO C51 (Royal Blue, 6GB RAM, 128GB Storage)']")).click();
		
		//To get and store parent window id
		String parentId = driver.getWindowHandle();
		
		//To get all the window id's
		Set<String> childIds = driver.getWindowHandles();
		//System.out.println(childIds);
		
		//Get one by one and compare with parentid if it's not equal jump to child window
		for (String windowId :childIds) {
			if(!windowId.equals(parentId)) {
		driver.switchTo().window(windowId);
		break;  //switch to first child window you can modify as needed
			}
		}
		WebElement price = driver.findElement(By.xpath("//span[text()='₹5,999']"));
		System.out.println(price.getText());
		//To close the child window
		driver.close();
		//To switch back to the parent window
		driver.switchTo().window(parentId);
		//To close the main window
		driver.quit();
	}

}
