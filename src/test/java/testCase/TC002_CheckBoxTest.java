package testCase;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.elementsPage;
import testBase.BaseClass;

public class TC002_CheckBoxTest extends BaseClass{
    @Test
	public void verifyCheckBox() {
		elementsPage el=new elementsPage(driver);
		el.clkElements();
		el.clkChcekbox();
		el.clkChcekboxLaptop();
		String msg=el.getMsgCnfChkbx();
		Assert.assertEquals(msg, "You are Selected Laptop");
	}
}
