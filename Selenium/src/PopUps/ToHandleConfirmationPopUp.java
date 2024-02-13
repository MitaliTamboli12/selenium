package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopUp {

	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://licindia.in/");
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.partialLinkText("Login")).click();
		// To switch to alert
		Alert ConfirmationPopup = driver.switchTo().alert();
		System.out.println(ConfirmationPopup.getText());
		//ConfirmationPopup.accept();//To click on Ok button
		ConfirmationPopup.dismiss(); //To click on cancel button
	

	}

}
