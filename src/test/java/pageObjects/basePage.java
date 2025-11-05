package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {
WebDriver driver;
//Constructor-intiate the webdriver  
public basePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
