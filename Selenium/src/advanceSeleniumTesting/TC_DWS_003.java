package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass{
	String expectedData="Electronics";
	   @Test
	   public void toCheckElectronicsPage() {
	      driver.findElement(By.partialLinkText("Electronics")).click();
	      String actualData = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
		    if (actualData.equals(expectedData)) {
				Reporter.log("Navigated to Electronics page successfully",true);
			}else {
			    Reporter.log("Failed to Navigated to Electronics page", true);
			   }
		    Reporter.log("TestCase 003 executed Successfully", true);
	   }
}
