package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_009 extends BaseClass {
	String expectedData="Books";
	   @Test
	   public void toCheckBookPage() {
	      driver.findElement(By.partialLinkText("Books")).click();
	      String actualData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
	      Assert.assertEquals(actualData, expectedData, "Failed to Navigated to Books page");
		    Reporter.log("TestCase 009 executed Successfully", true);
		 WebElement sortDropdown = driver.findElement(By.id("products-orderby"));
		 Select sortSelect = new Select(sortDropdown);
		 sortSelect.selectByIndex(3);
	 }
}
