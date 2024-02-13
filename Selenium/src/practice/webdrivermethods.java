package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		// to use manage method
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		// to use get method
		driver.get("https://www.hackerrank.com/");
		// to use getTitle method
		String titleofWebpage = driver.getTitle();
		System.out.println(titleofWebpage);
		// To use getCurrentUrl method
		String urlofWebpage = driver.getCurrentUrl();
		System.out.println(urlofWebpage);
		// to use getPageSource method
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		// to use getSize method
		Dimension browserSize = driver.manage().window().getSize();
		System.out.println(browserSize);
		System.out.println(browserSize.getWidth());
		System.out.println(browserSize.getHeight());
		// to use setSize method
		driver.manage().window().setSize(new Dimension(300, 300));
    	// to use getPosition method
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());
		//To use setPosition method
		driver.manage().window().setPosition(new Point(200, 300));
		//to use getWindowHandle
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		//to close the browser
		//driver.quit();
		
		
		//To use navigate methods
		driver.get("https://www.amazon.in/");
		Navigation nav = driver.navigate();
		Thread.sleep(2000);
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		Thread.sleep(2000);
		
	    //To use to string url
		driver.navigate().to("https://www.amazon.in/");
		
		//To use to url 
		driver.navigate().to( new URL("https://www.facebook.com/"));
		
		//To get all windowIds
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
	
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
