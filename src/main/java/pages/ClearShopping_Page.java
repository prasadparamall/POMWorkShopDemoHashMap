package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import baseclass.baseclass;

public class ClearShopping_Page extends baseclass {
	
	public ClearShopping_Page() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//span[@class='cart-qty']")
	private WebElement cardqty;

	@FindBy(xpath = "//ul[@class='top-menu']//a[normalize-space()='Books']")
	private WebElement books;

	@FindBy(xpath = "//span[normalize-space()='Shopping cart']")
	private WebElement movetoshippingcar;

	@FindBy(xpath = " //tr[@class='cart-item-row']/td[1]")
	private List<WebElement> cardlist;

	@FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement updateshippindcard;

	
	
	

	public void clearAddItems() throws Exception {
		
		String items = cardqty.getText();
		String listitems = "(0)";
		
		if(items.equalsIgnoreCase(listitems)) {
			books.click();
		}else {
			movetoshippingcar.click();
			Thread.sleep(2000);
			
			Iterator<WebElement> listcarditems = cardlist.iterator();
			while(listcarditems.hasNext()) {
				listcarditems.next().click();
			}
			updateshippindcard.click();
			
			String actuurl = driver.getCurrentUrl();
			String expeurl = "https://demowebshop.tricentis.com/cart";
			
			if(actuurl.equalsIgnoreCase(expeurl))
			{
				books.click();
				Thread.sleep(2000);
			}else {
				System.out.println("faild navigation");
			}
		
		}

	}


	
}
