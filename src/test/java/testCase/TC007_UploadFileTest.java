package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.elementsPage;
import testBase.BaseClass;

public class TC007_UploadFileTest extends BaseClass{
	@Test
	public void verifyUploadFile() throws InterruptedException {
		elementsPage el=new elementsPage(driver);
		el.clkElements();
		el.clkUploadNDwnldBtn();
		el.chooseFile("//testData//import28.csv");
		String msgUploadedFile=el.getMsgUploadedFile();
		System.out.println(msgUploadedFile);
		Assert.assertEquals(msgUploadedFile, "");
	}

}
