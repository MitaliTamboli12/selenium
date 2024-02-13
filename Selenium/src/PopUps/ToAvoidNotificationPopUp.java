package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;

public class ToAvoidNotificationPopUp {

	public static void main(String[] args) {
	  //Browser settings
		//EdgeOptions settings = new EdgeOptions();
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--disable-notifications");
		//settings.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(settings);
		//WebDriver driver = new EdgeDriver(settings); //add ref. variable
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.yatra.com/");
		driver.quit();

	}

}
