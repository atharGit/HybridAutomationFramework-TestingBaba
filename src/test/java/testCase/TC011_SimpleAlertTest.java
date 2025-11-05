package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlertFrameWindowsPage;
import testBase.BaseClass;

public class TC011_SimpleAlertTest extends BaseClass{
	@Test
	public void verifySimpleAlerts() throws InterruptedException {
		AlertFrameWindowsPage afwp=new AlertFrameWindowsPage(driver);
		afwp.clkAlertFrameWindow();
		afwp.clkBtnAlerts();
		String alertmsg1=afwp.clkBtnAlert();
		Assert.assertEquals(alertmsg1,"you have clicked a button");
		
	}


}
