package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCloseMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
         Thread.sleep(5000);
         driver.close();
	}

}
