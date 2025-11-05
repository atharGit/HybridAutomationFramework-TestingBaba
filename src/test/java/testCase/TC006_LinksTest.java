package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.elementsPage;
import testBase.BaseClass;

public class TC006_LinksTest extends BaseClass{
	@Test
public void verifyLinks() throws InterruptedException {
	elementsPage el=new elementsPage(driver);
	el.clkElements();
	el.clkLinkbtn();
	el.clkDemoPagebtn();
	String msgDemoPage=driver.getCurrentUrl();
	Assert.assertEquals(msgDemoPage,"https://www.testingbaba.com/old/index.html");
}
}
