package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass {
	String expectedData="Computers";
	   @Test
	   public void toCheckComputersPage() {
	      driver.findElement(By.partialLinkText("Computers")).click();
	      String actualData = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
		    if (actualData.equals(expectedData)) {
				Reporter.log("Navigated to Computers page successfully",true);
			}else {
			    Reporter.log("Failed to Navigated to Computers page", true);
			   }
		    Reporter.log("TestCase 002 executed Successfully", true);
	   }
}
