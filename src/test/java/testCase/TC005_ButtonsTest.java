package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.elementsPage;
import testBase.BaseClass;

public class TC005_ButtonsTest extends BaseClass{
	@Test
public void verifyButtonsClick() throws InterruptedException {
	elementsPage el=new elementsPage(driver);
	el.clkElements();
	el.clkButton();
	el.clkDoubleClick();
	String msgDblBtn=el.getCnfMsgDblClk();
	Assert.assertEquals(msgDblBtn,"you have done a double click");
	
	el.clkRightClickBtn();
	String msgRight=el.getCnfMsgRightClk();
	Assert.assertEquals(msgRight, "you have done a right click");
	
	el.clkClickBtn();
	String msgClickbtn=el.getCnfMsgClkBtn();
	Assert.assertEquals(msgClickbtn, "you have done a dynamic click");
}
}
