package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlertFrameWindowsPage;
import testBase.BaseClass;

public class TC014_PromtAlertTest extends BaseClass{
@Test
public void verifyPromtAlert() throws InterruptedException {
	AlertFrameWindowsPage afwp=new AlertFrameWindowsPage(driver);
	afwp.clkAlertFrameWindow();
	afwp.clkBtnAlerts();
	afwp.promtAlert("Athar");
	String CrntMsg=afwp.getCnfMsgPromtalrt();
	String ExpectedMsg="Athar";
	Assert.assertEquals(CrntMsg, ExpectedMsg,"Something went wrong 404!");
}
}
