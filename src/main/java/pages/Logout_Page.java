package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class Logout_Page extends baseclass {
	
	public Logout_Page() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//a[@class='ico-logout']")
	private WebElement userlogout;
	
	public void logout_Page() throws Exception {
		userlogout.click();
			Thread.sleep(2000);
	}

}
 
