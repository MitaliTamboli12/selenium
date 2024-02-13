package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass {
	String expectedData="Digital downloads";
	   @Test (groups = "smoke")
	   public void toCheckDigital_DownloadsPage() {
	      driver.findElement(By.partialLinkText("Digital downloads")).click();
	      String actualData = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
		    if (actualData.equals(expectedData)) {
				Reporter.log("Navigated to Digital downloads page successfully",true);
			}else {
			    Reporter.log("Failed to Navigated to Digital downloads page", true);
			   }
		    Reporter.log("TestCase 005 executed Successfully", true);
	   }
}
