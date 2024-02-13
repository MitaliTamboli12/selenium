package WebDriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethods {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://baskinrobbinsindia.com/");
	
	//To maximize
	//driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//To minimize
	//driver.manage().window().minimize();
	//Thread.sleep(2000);
	
	//To fullscreen
	//driver.manage().window().fullscreen();
	
	//To get size
	//Dimension sizeOfBrowser = driver.manage().window().getSize();
	//System.out.println(sizeOfBrowser);
	//System.out.println(sizeOfBrowser.getWidth());
	//System.out.println(sizeOfBrowser.getHeight());
	
	//To set Size
	//driver.manage().window().setSize(new Dimension(300,700));
	
	//To get Position
	//Point pos = driver.manage().window().getPosition();
	//System.out.println(pos);
	//System.out.println(pos.getX());
	//System.out.println(pos.getY());

	//To set position
	driver.manage().window().setPosition(new Point(300,200));

	}

}
