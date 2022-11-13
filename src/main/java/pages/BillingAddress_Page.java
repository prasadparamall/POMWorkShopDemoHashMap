package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import baseclass.baseclass;

public class BillingAddress_Page extends baseclass {
	
	public BillingAddress_Page() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement checkbox_XPATH;

	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkout_XPATH;
	@FindBy(xpath = "//select[@id='billing-address-select']")
	private WebElement dropdownclick_XPATH;

	@FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
	private WebElement firstname_XPATH ;
	@FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
	private WebElement lastname_XPATH ;

	@FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
	private WebElement emailbildingadd_XPATH ;
	@FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
	private WebElement countrydrop_XPATH ;

	@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
	private WebElement city_XPATH ;
	@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
	private WebElement address1_XPATH ;

	@FindBy(xpath = "//input[@id='BillingNewAddress_Address2']")
	private WebElement address2_XPATH ;
	@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
	private WebElement zipcode_XPATH ;

	@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
	private WebElement phonenumber_XPATH ;
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement bacontinue_XPATH ;

	

	
	public void checkout() throws InterruptedException {
		 
		checkbox_XPATH.click();
		checkout_XPATH.click();
		Thread.sleep(2000);
		log.info("Click on Radio button and Checkout button....");
	}
	
	
	public void BillingAddressdropdown() throws Exception {
		
		select(dropdownclick_XPATH,"New Address");
		Thread.sleep(2000);

}	
	
	
	public void BillingAdd(String fname,String lname,String email,String city,String address1,String address2,String zipcode,String phoneno) throws Exception {
				
		    firstname_XPATH.clear();
		    firstname_XPATH.sendKeys(fname);
			
			lastname_XPATH.clear();
			lastname_XPATH.sendKeys(lname);
			
			emailbildingadd_XPATH.clear();
			emailbildingadd_XPATH.sendKeys(email);
			
			select(countrydrop_XPATH,"India");
			
			city_XPATH.sendKeys(city);
			address1_XPATH.sendKeys(address1);
			address2_XPATH.sendKeys(address2);
			zipcode_XPATH.sendKeys(zipcode);
			phonenumber_XPATH.sendKeys(phoneno);
			
			bacontinue_XPATH.click();
			
			Thread.sleep(2000);
		
		}

	
	

}
