package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {
	String expectedData="Books";
   @Test
   public void toCheckBookPage() {
      driver.findElement(By.partialLinkText("Books")).click();
      String actualData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
//	    if (actualData.equals(expectedData)) {
//			Reporter.log("Navigated to Books page successfully",true);
//		}else {
//	    Reporter.log("Failed to Navigated to Books page", true);
//   }
      Assert.assertEquals(actualData, expectedData, "Failed to Navigated to Books page");
	    Reporter.log("TestCase 001 executed Successfully", true);
 }
}
