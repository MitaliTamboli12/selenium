package WebDriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		//To string url
		//driver.navigate().to("https://www.amazon.in/");
		
		//To url url
		//driver.navigate().to(new URL("https://www.amazon.in/"));
		
		//Forward,back,refresh
		driver.get("https://www.amazon.in/");
		Navigation nav = driver.navigate();
		Thread.sleep(2000);
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();

	}

}
