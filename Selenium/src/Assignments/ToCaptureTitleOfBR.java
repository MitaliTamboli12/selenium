package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitleOfBR {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		String TitleOfBR = driver.getTitle();
		System.out.println(TitleOfBR);
	}

}
