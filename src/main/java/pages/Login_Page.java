package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import baseclass.baseclass;

public class Login_Page extends baseclass {
	
	public Login_Page() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='RememberMe']")
	private WebElement rememberme;

	@FindBy(xpath = "//a[normalize-space()='Forgot password?']")
	private WebElement forgotpassword;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement login;

	@FindBy(xpath = "//input[@value='Register']")
	private WebElement register;
	
	

	public void doLogin(String email1, String password1) {
		email.sendKeys(email1);
		password.sendKeys(password1);
		

	}


	public void rememberme_link() {
		rememberme.click();

	}

	public void forgotpassword_link() {
		forgotpassword.click();

	}

	public void login_link() {
		login.click();

	}

	public void register_link() {
		register.click();

	}

}
