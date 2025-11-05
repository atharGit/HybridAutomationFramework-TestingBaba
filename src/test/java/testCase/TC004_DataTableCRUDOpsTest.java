package testCase;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.elementsPage;
import testBase.BaseClass;
@Test
public class TC004_DataTableCRUDOpsTest extends BaseClass{
	public void verifyAdd() throws InterruptedException {
		elementsPage el=new elementsPage(driver);
		el.clkElements();
		el.clkWebTablesBtn();
		el.switchToIframeWebTble();
		el.setName("Athar");
		el.setEmailWT("athar@mail.com");
		el.clkSubmitWT();
		String msgAddedName=el.getCnfDataSavedName();
		String msgAddedEmail=el.getCnfDataSavedEmail();
		Assert.assertEquals(msgAddedName,"Athar");
		Assert.assertEquals(msgAddedEmail,"athar@mail.com");
		
		el.btnEdit();
		el.setEditName("Edit");
		el.setEditEmailWT("Edit");
		el.clkUpdateWT();
		String msgAddedNameEdit=el.getCnfDataSavedName();
		String msgAddedEmailEdit=el.getCnfDataSavedEmail();
		Assert.assertEquals(msgAddedNameEdit,"AtharEdit");
		Assert.assertEquals(msgAddedEmailEdit,"athar@mail.comEdit");
		
		el.clkDelete();
		List <WebElement> msg=el.cnfdeletedItemEmpy();
		Assert.assertTrue(msg.isEmpty(),"Deleted item is still present on the page!");
	}


}
