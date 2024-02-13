package Assignments;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreOliveGarden {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.olivegarden.com/home");
		
		//To Maximize
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//To Minimize
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		//To get Fullscreen
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		//To get Position
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		System.out.println(pos.getX());
		System.out.println(pos.getY());

		//To set position
		driver.manage().window().setPosition(new Point(50,50));

	}

}
