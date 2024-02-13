package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/swiggy-instamart");
		String urlOfwebpage = driver.getCurrentUrl();
		System.out.println(urlOfwebpage);

	}

}
