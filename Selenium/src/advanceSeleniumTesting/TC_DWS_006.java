package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_006 extends BaseClass{
	String expectedData="Jewelry";
	   @Test (groups = "smoke")
	   public void toJewelryPage() {
	      driver.findElement(By.partialLinkText("Jewelry")).click();
	      String actualData = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
		    if (actualData.equals(expectedData)) {
				Reporter.log("Navigated to Jewelry page successfully",true);
			}else {
			    Reporter.log("Failed to Navigated to Jewelry page page", true);
			   }
		    Reporter.log("TestCase 006 executed Successfully", true);
	   }
}
