package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformeDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/product.php");
		WebElement addButton = driver.findElement(By.id("add"));
		
		//To use actions class
		Actions action = new Actions(driver);
		
		//To call the methods
		action.doubleClick(addButton).perform();
		action.doubleClick(addButton).perform();
		action.doubleClick(addButton).perform();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
