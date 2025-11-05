package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlertFrameWindowsPage;
import testBase.BaseClass;

public class TC010_AlertFrameWindowHandlingTest extends BaseClass{
	@Test
	public void verifyAlertFrameWindow() throws InterruptedException {
		//1
		AlertFrameWindowsPage afwp= new AlertFrameWindowsPage(driver);
		afwp.clkAlertFrameWindow();
		afwp.clkBrowserWindows();
		afwp.clkNewTab();
//		String expectedTitle="Google";
//		String currentTitle=driver.getTitle();
//		Assert.assertEquals(currentTitle, expectedTitle,"Tab not changed");
		//2
		afwp.clkBrowserWindows();
		afwp.clkNewWindow();
		//3
		afwp.clkBrowserWindows();
		afwp.clkNewWindowMsg();
			
	}
	
	
}
