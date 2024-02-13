package Dropdownorlistbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		// dropdowns
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));

		//handling by select class
		Select daySelect = new Select(dayDropdown);
		Select monthSelect = new Select(monthDropdown);
		Select yearSelect = new Select(yearDropdown);

		// call select class methods
		daySelect.selectByIndex(11);
		monthSelect.selectByValue("12");
		yearSelect.selectByVisibleText("1999");
		
		//Every option present in monthdropdown
		List<WebElement> allMonths = monthSelect.getOptions();
		for (WebElement month : allMonths) {
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());
		}
		
		//To check whether dropdown is single or multiselect
		System.out.println("*****************");
		System.out.println(monthSelect.isMultiple());
		
	
	}
		

}
