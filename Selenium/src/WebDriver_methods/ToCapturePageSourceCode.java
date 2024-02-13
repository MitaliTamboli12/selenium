package WebDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturePageSourceCode {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/swiggy-instamart");
		String SourceCode = driver.getPageSource();
		System.out.println(SourceCode);

	}

}
