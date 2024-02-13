package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSessionId {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
    String parentId = driver.getWindowHandle();
    System.out.println(parentId);
	}

}