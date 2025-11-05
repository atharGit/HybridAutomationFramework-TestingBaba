package testCase;

import org.testng.annotations.Test;

import pageObjects.AlertFrameWindowsPage;
import testBase.BaseClass;

public class TC013_ConfirmationAlertTest extends BaseClass{
	@Test
	public void verifyConfirmationAlert() throws InterruptedException {
		AlertFrameWindowsPage afwp=new AlertFrameWindowsPage(driver);
		afwp.clkAlertFrameWindow();
		afwp.clkBtnAlerts();
		afwp.clkBtnConfirmationAlert();
	}

}
