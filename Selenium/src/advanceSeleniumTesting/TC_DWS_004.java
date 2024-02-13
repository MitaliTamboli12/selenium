package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass {
	String expectedData="Apparel & Shoes";
	   @Test
	   public void toCheckApparel_ShoesPage() {
	      driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	      String actualData = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).getText();
		    if (actualData.equals(expectedData)) {
				Reporter.log("Navigated to Apparel & Shoes page successfully",true);
			}else {
			    Reporter.log("Failed to Navigated to Apparel & Shoes page", true);
			   }
		    Reporter.log("TestCase 004 executed Successfully", true);
	   }
}
