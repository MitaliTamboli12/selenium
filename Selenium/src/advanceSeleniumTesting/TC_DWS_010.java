package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_010 extends BaseClass {
	String expectedData = "Electronics";
    String expectedData1 = "Camera, photo";
	@Test
	public void toCheckElectronicsPage() {
		 driver.findElement(By.partialLinkText("Electronics")).click();
		 String actualData = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
		Assert.assertEquals(actualData, expectedData, "Failed to Navigated to Electronics page");

//		if (actualData.equals(expectedData)) {
//			Reporter.log("Navigated to Electronics page successfully", true);
//		} else {
//			Reporter.log("Failed to Navigated to Electronics page", true);
//		}
		driver.findElement(By.partialLinkText("Camera, photo")).click();
        String actualData1 = driver.findElement(By.xpath("//h1[text()='Camera, photo']")).getText();
//		if (actualData1.equals(expectedData1)) {
//			Reporter.log("Navigated to Camera, photo page successfully",true);
//		}else {
//			Reporter.log("Failed to Navigated to Camera, photo page",true);
//		}
    	Assert.assertEquals(actualData1, expectedData1, "Failed to Navigated to camera page");
		Reporter.log("TestCase 010 executed Successfully", true);
	}
}
