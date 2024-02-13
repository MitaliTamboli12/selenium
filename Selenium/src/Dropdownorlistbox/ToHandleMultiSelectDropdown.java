package Dropdownorlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		//listbox
		WebElement multilistbox = driver.findElement(By.id("cars"));
		
		//handle it by using select
		Select multiSelect = new Select(multilistbox);
		
		//call methods
		System.out.println(multiSelect.isMultiple());
		multiSelect.selectByVisibleText("Free ( 90 ) ");
		multiSelect.selectByIndex(1);
		multiSelect.selectByValue("199");
		
		//deselecting
		multiSelect.deselectByIndex(2);
		multiSelect.deselectByValue("99");
		//multiSelect.deselectAll();
		
		//get first selected option
		
		//get all selected option 
		

	}

}
