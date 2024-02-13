package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreKFC {

	public static void main(String[] args) throws InterruptedException {
	  ChromeDriver driver=new ChromeDriver();
	  
	  //Open KFC Browser
	  driver.get("https://online.kfc.co.in/");
	  
	  //Maximize
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  //Get Size of Browser
	  Dimension sizeOfBrowser = driver.manage().window().getSize();
		System.out.println(sizeOfBrowser);
		System.out.println(sizeOfBrowser.getWidth());
		System.out.println(sizeOfBrowser.getHeight());

	}

}
