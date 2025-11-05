package pageObjects;

import java.time.Duration;
import java.util.Set;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class AlertFrameWindowsPage extends basePage{
	//Initilize constructer
public AlertFrameWindowsPage(WebDriver driver) {
	super(driver);
}

//Elements
@FindBy(xpath="//span[normalize-space()='&Windows']")
WebElement btnAlertFrameWindows;
@FindBy(xpath="//a[normalize-space()='browser windows']")
WebElement btnBrowserWindows;
@FindBy(xpath="//a[normalize-space()='New Tab']")
WebElement btnNewTab;

@FindBy(xpath="//a[normalize-space()='New Window']")
WebElement btnNewWindow;
@FindBy(xpath="//a[normalize-space()='New Window Message']")
WebElement btnNewWindowMsg;

@FindBy(xpath="//a[normalize-space()='alerts']")
WebElement btnAlerts;
@FindBy(xpath="//button[@onclick='myalert()']")
WebElement btnAlert;

@FindBy(xpath="//button[@onclick='aftersec5()']")
WebElement btnDelayedAlert;

@FindBy(xpath="//button[@onclick='myconfirm()']")
WebElement btnConfirmationAlert;

@FindBy(xpath = "//button[@onclick='myprompt()']")
WebElement btnPromptConfirmation;
@FindBy(xpath = "//span[@id='name-result']")
WebElement CnfMsgPromptConfirmation;


//Actions
public void clkAlertFrameWindow() {
	btnAlertFrameWindows.click();
}
public void clkBrowserWindows() {
	btnBrowserWindows.click();
}
public void clkNewTab() throws InterruptedException {
	String tab1=driver.getWindowHandle();
	btnNewTab.click();
	Set<String> tabs=driver.getWindowHandles();
	tabs.remove(tab1);
	String tab2=(String)tabs.toArray()[0];
	driver.switchTo().window(tab2);
	String expectedTitle="Google";
	String currentTitle=driver.getTitle();
	Assert.assertEquals(currentTitle, expectedTitle,"Tab not changed");
	driver.close();
//	Thread.sleep(1000);
	driver.switchTo().window(tab1);
}

public void clkNewWindow() throws InterruptedException {
	String window1=driver.getWindowHandle();
	btnNewWindow.click();
	Set<String> windows=driver.getWindowHandles();
	windows.remove(window1);
	String window2=(String)windows.toArray()[0];
	driver.switchTo().window(window2);
	String expectedTitle="Google";
	String currentTitle=driver.getTitle();
	Assert.assertEquals(currentTitle, expectedTitle,"Window not changed");
	driver.close();
//	Thread.sleep(1000);
	driver.switchTo().window(window1);
	
}

public void clkNewWindowMsg() {
	String win1=driver.getWindowHandle();
	btnNewWindowMsg.click();
	Set<String> wins=driver.getWindowHandles();
	wins.remove(win1);
	String win2=(String)wins.toArray()[0];
	driver.switchTo().window(win2);
	driver.close();
}

public void clkBtnAlerts() throws InterruptedException {
	Thread.sleep(250);
	btnAlerts.click();
}

public String clkBtnAlert() {
	btnAlert.click();
	Alert alrt=driver.switchTo().alert();
	return(alrt.getText());
}

public String clkBtnDelayedAlert() {
	btnDelayedAlert.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alrt=driver.switchTo().alert();
	return(alrt.getText());
}

public void clkBtnConfirmationAlert() {
	btnConfirmationAlert.click();
	Alert alrt=driver.switchTo().alert();
	alrt.accept(); //alrt.dismiss();
}

public void promtAlert(String promt) {
	btnPromptConfirmation.click();
	Alert alrt=driver.switchTo().alert();
	alrt.sendKeys(promt);
	alrt.accept();
}
public String getCnfMsgPromtalrt() {
	String msg=CnfMsgPromptConfirmation.getText();
	return(msg);
}

}
