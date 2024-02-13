package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		// To switch to frames
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		// To handle the popup
		Alert alertPopup = driver.switchTo().alert();
		System.out.println(alertPopup.getText());
		 alertPopup.accept();
		// alertPopup.dismiss();

		 //driver.quit();

	}

}
