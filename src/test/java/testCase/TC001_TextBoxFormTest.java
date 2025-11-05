package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.elementsPage;
import testBase.BaseClass;

public class TC001_TextBoxFormTest extends BaseClass{
    @Test
	public void verifyTextBoxForm() {
		elementsPage el=new elementsPage(driver);
		el.clkElements();
		el.clkTextBox();
		el.setFullName("Azhar");
		el.setEmail("test@example.com");
		el.setFullAdd("Address 12345");
		el.setPmntAdd("permanet Adress");
		el.clkSubmit();
		String msg=el.getConfirmationMsg();
		System.out.println(msg);
		Assert.assertEquals(msg, "Azhar");
	}
}
