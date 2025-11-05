package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlertFrameWindowsPage;
import testBase.BaseClass;

public class TC012_DelayedAlertTest extends BaseClass{
	@Test
public void verifyDelayedAlert() throws InterruptedException {
	AlertFrameWindowsPage afwp=new AlertFrameWindowsPage(driver);
	afwp.clkAlertFrameWindow();
	afwp.clkBtnAlerts();
	String alertMsg=afwp.clkBtnDelayedAlert();
	Assert.assertEquals(alertMsg,"This alert appeared after 5 seconds");
}
}
