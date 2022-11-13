package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class GotoCard_Page extends baseclass {
	
	public GotoCard_Page() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Shopping cart']")
	private WebElement movetocard;

	@FindBy(xpath = "//input[@value='Go to cart']")
	private WebElement gotocardbutton;
	
	@FindBy(xpath = "//div[@class='header-links-wrapper']/div[1]/ul/li[3]/a/span[1]")
	private WebElement shoppingcart;

	
	
	public void gotoCards() throws InterruptedException {
          
		shoppingcart.click();
		Thread.sleep(2000);
	}

}
