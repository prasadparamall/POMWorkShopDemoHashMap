package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import baseclass.baseclass;

public class AddBooks_Page extends baseclass {
	
	public AddBooks_Page() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//div[@class='master-wrapper-content']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement addtocard;

	@FindBy(xpath = "//div[@class='product-grid']//div[3]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement addtocard2;

	

	public void addbooks() throws InterruptedException {
		addtocard.click();
		Thread.sleep(2000);
		addtocard2.click();
		Thread.sleep(1000);

	}


	
}
