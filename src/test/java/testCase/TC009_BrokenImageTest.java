package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.elementsPage;
import testBase.BaseClass;

public class TC009_BrokenImageTest extends BaseClass{
	@Test
public void verifyImageURL() throws InterruptedException {
	elementsPage el=new elementsPage(driver);
	el.clkElements();
	el.clkBrokenImageURL();
	String valid=el.getValidImageAttri();
	Assert.assertTrue(valid.endsWith(".jpg"),"Image is not valid");
	String broken=el.getBrokenImageAttri();
	Assert.assertTrue(broken.contains("#")||broken.isEmpty(),"This is not broken");
}
}
