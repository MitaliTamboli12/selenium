package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_007 extends BaseClass {
	String expectedData="Gift Cards";
	   @Test
	   public void toGiftCards() {
	      driver.findElement(By.partialLinkText("Gift Cards")).click();
	      String actualData = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
		    if (actualData.equals(expectedData)) {
				Reporter.log("Navigated to Gift Cards successfully",true);
			}else {
			    Reporter.log("Failed to Navigated to Gift Cards page", true);
			   }
		    Reporter.log("TestCase 007 executed Successfully", true);
	   }
}
