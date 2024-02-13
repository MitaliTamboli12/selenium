package DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToreadDataFromProperties {

	public static void main(String[] args) throws IOException {
		
		//To create object for file input stream
		FileInputStream fis = new FileInputStream("./testData/testData.properties");
		
		//To create object for properties file
		Properties prop = new Properties();
		
		//To call methods
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
	    String password = prop.getProperty("password");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	
		

	}

}

