package pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import baseclass.baseclass;
import utilities.KeyPaths;

public class SuccessOrder_Page extends baseclass{
	
	public SuccessOrder_Page() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//div[@class='section order-completed']/ul/li[1]")
	private WebElement orderno_XPATH ;

	@FindBy(xpath = "//div[@class='section order-completed']/div/strong")
	private WebElement success_XPATH ;
	@FindBy(xpath = "//div[@class='section order-completed']/ul/li[2]/a")
	private WebElement orderdetails_XPATH ;

	@FindBy(xpath = "//div[@class='page-body']")
	private WebElement getdetails_XPATH ;
	@FindBy(xpath = "//div[@class='section order-completed']/div[2]/input")
	private WebElement continulast ;

	
	
	public void successfullprocessed() throws Exception {
		String orno = orderno_XPATH.getText();
	    System.out.println(orno);
	   log.info("Get text for order number.......");
		
	    String succe = success_XPATH.getText();
	    System.out.println(succe);
	   log.info("Get text for successfully ............");
		
		Thread.sleep(2000);
		
		
	} 
	

	public void orderDetails() throws Exception {
		
		orderdetails_XPATH.click();
		Thread.sleep(2000);
		
		ArrayList<String> arr = new ArrayList<String>();
		
		String orde = getdetails_XPATH.getText();
		arr.add(orde);
		
		for(String aee: arr) {
		System.out.println(aee);
		}
	   log.info("Get text for order number.......");
	   
	    Thread.sleep(2000);
	    driver.navigate().to(KeyPaths.navigate);
		
		continulast.click();
		Thread.sleep(2000);
		
	} 


}
