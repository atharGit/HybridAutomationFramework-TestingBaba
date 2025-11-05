package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.elementsPage;
import testBase.BaseClass;
@Test
public class TC003_RadioButtonTest extends BaseClass{
public void verifyRadioBtn() {
	elementsPage el=new elementsPage(driver);
	el.clkElements();
	el.clkRadioBtn();
	el.clkRdBtnIn();
	String msg=el.getConfMsgRdBt();
	Assert.assertEquals(msg, "You have selected impressive");
}
}
