package testCase;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.elementsPage;
import testBase.BaseClass;

public class TC008_DynamicPropertiesTest extends BaseClass{
    @Test
	public void verifyDynamicProperties() throws InterruptedException {
		elementsPage el=new elementsPage(driver);
		el.clkElements();
		el.clkDynamicPropertiesBtn();
		// Test "Will enable in 5 seconds" button
		Assert.assertFalse(el.btnEnableIn5sec.isEnabled(),"Button should be initially disabled.");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(el.btnEnableIn5sec));
		Assert.assertTrue(el.btnEnableIn5sec.isEnabled(),"Button should be enabled after 5 seconds.");
		el.clkEnableIn5SecBtn();
		
		// Test "Color Change" button
		el.clkDynamicPropertiesBtn();
		String oldclr=el.getIntialColor();
		String newclr=el.getNewColor();
		//System.out.println("intial Color -"+oldclr+"New Color"+newclr);
		Assert.assertNotEquals(oldclr, newclr,"Color should have changed.");
		
		//Test "visible Button after 5 second
		el.clkDynamicPropertiesBtn();
		Assert.assertFalse(el.btnVisibleIn5sec.isDisplayed(),"Button visible before 5 sec");
		wait.until(ExpectedConditions.visibilityOf(el.btnVisibleIn5sec));
		Assert.assertTrue(el.btnVisibleIn5sec.isDisplayed(),"Button not visible after 5 sec");
		
		}
}
