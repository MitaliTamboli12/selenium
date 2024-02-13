
package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_FB_001 {

	public static void main(String[] args) {
		
		//Expected Data
		String expectedLoginpagetitle = "Facebook – log in or sign up";
		String expectedUsername = "tambolimitali@gmail.com";
		String expectedPassword = "Mitali@123";
	//	String expectedHomepageTitle = "facebook";
		
		//Step 1 :- Open the Browser
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(settings); //Cross browser testing
		System.out.println("Browser got launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got maximized succesfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Step 2 :- Enter the valid URL
		driver.get("https://www.facebook.com/");
		String actualLoginpageTitle = driver.getTitle();
		if (actualLoginpageTitle.equals(expectedLoginpagetitle)) {
			System.out.println("Succesfully navigate to facebook loginpage");	
		}else {
			System.out.println("Failed to navigate to facebook loginpage");
		}
		
		//Step 3 :- Enter the Username
		WebElement usernameTextfield = driver.findElement(By.id("email"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(expectedUsername);
		String actualUsername = usernameTextfield.getAttribute("value");
		if(actualUsername.equals(expectedUsername)) {
			System.out.println("UsernameTextfield successfully accepted data");
		}else {
			System.out.println("UsernameTextfield failed to accepted data");
		}
		
		//Step 4:- Enter the password
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(expectedPassword);
		String actualPassword = passwordTextfield.getAttribute("value");
		if (actualPassword.equals(expectedPassword)) {
			System.out.println("PasswordTextfield successfully accepted data");
		}else {
			System.out.println("PasswordTextfield failed to accepted data");
		}
		
		//Step 5:- To click on Loginbutton
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		//Step 6:- Home page is opened
//  		WebElement actualHomePagetitle = driver.findElement(By.id("facebook"));
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
////		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("facebook")));
//		if(actualHomePagetitle.equals(expectedHomepageTitle)) {
//		System.out.println("Homepage is displayed");
//		}else {
//		System.out.println("Failed to displayed the Homepage");	
//		}
		//Step 6:- To close Browser
		System.out.println("Browser got closed successfully");
		driver.close();	
	}

}
