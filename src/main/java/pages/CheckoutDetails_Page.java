package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import baseclass.baseclass;

public class CheckoutDetails_Page extends baseclass{
	
	public CheckoutDetails_Page() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//select[@id='shipping-address-select']")
	private WebElement drop1_XPATH ;

	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement sacontinue_XPATH ;
	@FindBy(xpath = "//input[@id='shippingoption_1']")
	private WebElement nextdayair_XPATH ;

	@FindBy(xpath = "//input[@class='button-1 shipping-method-next-step-button']")
	private WebElement smcontine_XPATH ;
	@FindBy(xpath = "//input[@id='paymentmethod_0']")
	private WebElement cod_XPATH ;

	@FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
	private WebElement pmcontinue_XPATH ;
	@FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
	private WebElement picontinue_XPATH ;

	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement cocontinue_XPATH ;
	
	
	

    public void shippingAddressdropdown() {
	
    	select(drop1_XPATH,"prasad1 test1, door no:12345, andhrapradesh 123456, India");
    }
    
  
	public void shippingaddress() {
       sacontinue_XPATH.click();  
        
	}
	

    
	public void ShippingMethodNextDayAir() {
		
		nextdayair_XPATH.click();
		smcontine_XPATH.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    
	public void paymentmethod() {
		
		cod_XPATH.click();
		pmcontinue_XPATH.click();	
		
	}
  
	public void paymentinfo() {
		
		picontinue_XPATH.click();	
	}
   
	public void confirmorder() throws InterruptedException {
		
		cocontinue_XPATH.click();
		Thread.sleep(2000);
	} 
	
	
	
	
	
	
	

}
