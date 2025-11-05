package pageObjects;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementsPage extends basePage{
	
	//Initialize Constructor
public elementsPage(WebDriver driver) {
	super(driver);
}

//Elemnents
@FindBy(xpath="//button[normalize-space()='elements']")
WebElement btnElements;
@FindBy(xpath="//a[normalize-space()='text box']")
WebElement btnTextBox;
@FindBy(xpath="//input[@id='fullname1']")
WebElement txtFullName;
@FindBy(xpath="//input[@id='fullemail1']")
WebElement txtEmail;
@FindBy(xpath="//textarea[@id='fulladdresh1']")
WebElement txtAddress;
@FindBy(xpath="//textarea[@id='paddresh1']")
WebElement txtParmanetAdd;
@FindBy(xpath="//input[@value='Submit']")
WebElement btnSubmit;
@FindBy(xpath="//div[@class='col-md-6 mt-5']//label[@id='fullname']")
WebElement msgConfirmation;
//CheckBox
@FindBy(xpath="//a[normalize-space()='check box']")
WebElement btnCheckBox;
@FindBy(xpath="//iframe[@src='Checkbox.html']")
WebElement switchIframe;
@FindBy(xpath ="//input[@id='mylaptop']")
WebElement chkbxLaptop;
@FindBy(xpath="(//h6[normalize-space()='You are Selected Laptop'])[1]")
WebElement msgCnfChkbx;
//Radio Button
@FindBy(xpath="//a[normalize-space()='radio buttons']")
WebElement btnRadioBtn;
@FindBy(xpath="//input[@id='impressive']")
WebElement rdbtnImprs;
@FindBy(xpath="//p[@id='radio-content']")
WebElement msgConfmRdBt;
//Web Table
@FindBy(xpath="//a[normalize-space()='web tables']")
WebElement btnWebTables;
@FindBy(xpath=("//iframe[@src='Webtable.html']"))
WebElement switchIframeWT;
@FindBy(xpath="//input[@name='name']")
WebElement txtName;
@FindBy(xpath="//input[@name='email']")
WebElement txtEmailWT;
@FindBy(xpath="//button[@type='submit']")
WebElement btnSubmitWT;
@FindBy(xpath="//table[@class='table table-bordered data-table']//tr[1]//td[1]")
WebElement dataSavedName;
@FindBy(xpath="//table[@class='table table-bordered data-table']//tr[1]//td[2]")
WebElement dataSavedEmail;

@FindBy(xpath=("//button[normalize-space()='Edit']"))
WebElement btnEditWT;
@FindBy(xpath=("//input[@name='edit_name']"))
WebElement setEditName;
@FindBy(xpath=("//input[@name='edit_email']"))
WebElement setEditEmail;
@FindBy(xpath=("//button[normalize-space()='Update']"))
WebElement btnUpdateWT;

@FindBy(xpath=("//button[normalize-space()='Delete']"))
WebElement btnDeleteWT;
@FindBy(xpath=("//button[normalize-space()='Delete']"))
List <WebElement> cnfDeletedData;
//Buttons
@FindBy(xpath="//a[normalize-space()='buttons']")
WebElement btnButton;
@FindBy(xpath="//button[contains(text(),'Double')]")
WebElement btnDoubleClick;
@FindBy(xpath="//p[@id='double-content']")
WebElement cnfMsgDblBtn;
@FindBy(xpath=("//button[@id='noContextMenu']"))
WebElement btnRightClick;
@FindBy(xpath="//p[@id='right-content']")
WebElement cnfMsgRightbtn;
@FindBy(xpath=("//button[@onclick='clicktext()']"))
WebElement btnClick;
@FindBy(xpath="//p[@id='click-content']")
WebElement cnfMsgClickBtn;
//Links
@FindBy(xpath=("//a[normalize-space()='links']"))
WebElement btnLinks;
@FindBy(xpath=("//a[normalize-space()='Demo Page']"))
WebElement btnDemoPage;

//UploadFile
@FindBy(xpath="//a[normalize-space()='upload and download']")
WebElement btnUploadNDownload;
@FindBy(xpath="//input[@id='File1']")
WebElement btnChooseFile;
@FindBy(xpath = "//input[@id='File1']")
WebElement cnfMsgUploadedFile;

//Dynamic properties
@FindBy (xpath="//a[contains(text(),'dynamic')]")
WebElement btnDynamicProperties;
@FindBy (xpath="//button[@id='Enable']")
public WebElement btnEnableIn5sec;
@FindBy (xpath="//button[@id='Change']")
public WebElement btnColorChange;
@FindBy (xpath="//button[@id='Visible']")
public WebElement btnVisibleIn5sec;

//Broken image
@FindBy(xpath="//a[contains(text(),'broken')]")
public WebElement btnBrokenImage;
@FindBy(xpath="//img[@src=\"images/te4.jpg\"]")
public WebElement validImage;
@FindBy(xpath="//img[@src=\"#\"]")
public WebElement brokenImage;


//Actions
Actions actions = new Actions(driver);
public void clkElements() {
	btnElements.click();
}
public void clkTextBox() {
	btnTextBox.click();
}
public void setFullName(String fNme) {
	txtFullName.sendKeys(fNme);
}
public void setEmail(String email) {
	txtEmail.sendKeys(email);
}
public void setFullAdd(String fAdd) {
	txtAddress.sendKeys(fAdd);
}
public void setPmntAdd(String pmntAdd) {
	txtParmanetAdd.sendKeys(pmntAdd);
}
public void clkSubmit() {
	btnSubmit.click();
}
public String getConfirmationMsg() {
	return(msgConfirmation.getText());
}
//CheckBox
public void clkChcekbox() {
	btnCheckBox.click();
}
public void clkChcekboxLaptop() {
	driver.switchTo().frame(switchIframe);
	chkbxLaptop.click();
	driver.switchTo().defaultContent();
}
public String getMsgCnfChkbx() {
	driver.switchTo().frame(switchIframe);
	return msgCnfChkbx.getText();
}
//Radio Button
public void clkRadioBtn() {
	btnRadioBtn.click();
}
public void clkRdBtnIn() {
	rdbtnImprs.click();
}
public String getConfMsgRdBt() {
	return(msgConfmRdBt.getText());
}
//Web Element
public void clkWebTablesBtn() throws InterruptedException {
	Thread.sleep(500);
	btnWebTables.click();
}
public  void switchToIframeWebTble() {
	driver.switchTo().frame(switchIframeWT);
}
public void setName(String name) {
	txtName.sendKeys(name);
}
public void setEmailWT(String emailWT) {
	txtEmailWT.sendKeys(emailWT);
}
public void clkSubmitWT(){
	btnSubmitWT.click();
}
public String getCnfDataSavedName() {
	return(dataSavedName.getText());	
}
public String getCnfDataSavedEmail() {
	return(dataSavedEmail.getText());
}

public void btnEdit() {
	 btnEditWT.click();
}
public void setEditName(String editName) {
	setEditName.sendKeys(editName);
}
public void setEditEmailWT(String editEmailWT) {
	setEditEmail.sendKeys(editEmailWT);
}
public void clkUpdateWT(){
	btnUpdateWT.click();
}

public void clkDelete() {
	btnDeleteWT.click();
}
public List <WebElement> cnfdeletedItemEmpy() {
	return(cnfDeletedData);
}
//Buttons
public void clkButton() throws InterruptedException {
	Thread.sleep(500);
	btnButton.click();
}
public void clkDoubleClick() throws InterruptedException {
	Thread.sleep(500);
	actions.doubleClick(btnDoubleClick).perform();
}
public String getCnfMsgDblClk() {
	return(cnfMsgDblBtn.getText());
}
public void clkRightClickBtn() {
	actions.contextClick(btnRightClick).perform();
}
public String getCnfMsgRightClk() {
	return(cnfMsgRightbtn.getText());
}
public void clkClickBtn() {
	actions.click(btnClick).perform();
}
public String getCnfMsgClkBtn() {
	return(cnfMsgClickBtn.getText());
}
public void clkLinkbtn() throws InterruptedException {
	Thread.sleep(500);
	btnLinks.click();
}
public void clkDemoPagebtn() throws InterruptedException {
	String tab1=driver.getWindowHandle();
	btnDemoPage.click();
	Set<String> tabs=driver.getWindowHandles();
	tabs.remove(tab1);
	String tab2=(String)tabs.toArray()[0];
	driver.switchTo().window(tab2);
	}
public void clkUploadNDwnldBtn() throws InterruptedException {
	Thread.sleep(500);
	btnUploadNDownload.click();
}
public void chooseFile(String file) {
	String properity=System.getProperty("user.dir");
	btnChooseFile.sendKeys(properity+file);
}
public String getMsgUploadedFile() {
	return(cnfMsgUploadedFile.getText());
}
public void clkDynamicPropertiesBtn() throws InterruptedException {
	Thread.sleep(500);
	btnDynamicProperties.click();
}
public void clkEnableIn5SecBtn() {
	btnEnableIn5sec.click();
}
public void clkColorChangeBtn() {
	btnColorChange.click();
}
public String getIntialColor() {
	return(btnColorChange.getAttribute("style"));
}
public String getNewColor() throws InterruptedException {
	Thread.sleep(5000);
	return(btnColorChange.getAttribute("style"));
}
public void clkVisible5secBtn() {
	btnVisibleIn5sec.click();
}
//Broken Image
public void clkBrokenImageURL() throws InterruptedException {
	Thread.sleep(500);
	btnBrokenImage.click();
}
public String getValidImageAttri() {
	return(validImage.getAttribute("src"));
}
public String getBrokenImageAttri() {
	return(brokenImage.getAttribute("src"));
}

}
