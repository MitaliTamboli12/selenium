package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToCaptureErrorMsgOfWoodenStreet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.woodenstreet.com/");

		// To close the pop up
		driver.findElement(By.id("loginclose1")).click();

		// To mouseover to profile
		WebElement profile = driver.findElement(By.xpath("//li[@class='login without-login']"));
		// WebElement profile = driver.findElement(By.linkText("Profile"));  //we can use either xpath or linktext
		// WebElement login = driver.findElement(By.id("login_submit_btn"));  // without using explicit wait it is not working
		// To call Actions class
		Actions action = new Actions(driver);
		// To call Methods
		action.moveToElement(profile).perform();

		// To click on my profile
		driver.findElement(By.id("account-edit")).click();
		// driver.findElement(By.linkText("My Profile")).click(); //we can use either id or linktext
		// action.click(login).perform();

		// To click on login button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login_submit_btn")));
		WebElement login = driver.findElement(By.id("login_submit_btn"));
		action.click(login).perform();

		// To get error msg
		String Text = driver.findElement(By.xpath("//p[text()='Please provide valid email']")).getText(); //we can use either xpath by text function or xpath by contains.
		System.out.println(Text);

		// To get color of errormsg
		WebElement errormsgcolor = driver.findElement(By.xpath("//p[@class='error-block small']"));
		System.out.println(errormsgcolor.getCssValue("color"));

		driver.quit();

	}
}
