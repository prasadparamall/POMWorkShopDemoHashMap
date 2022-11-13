package testcases;


import java.util.HashMap;
import java.util.Hashtable;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home_Page;
import pages.Login_Page;
import utilities.HashMapUtilitie;
import utilities.Utilities;


public class LoginPage_Test {
	
	String crend = HashMapUtilitie.enterValidCreadentioals().get("validcred");
	String cre[] = crend.split("_");
		
	
	
	
	//Enter Valid Credentials
	@Test
	public void EnterValidCredentials() throws InterruptedException {
		
		
		Home_Page home=new Home_Page();
		Login_Page login= new Login_Page();
		
		home.login_link();
		Thread.sleep(2000);
		login.doLogin(cre[0], cre[1]);
		login.login_link();
		Thread.sleep(2000);
		
	
		
	}
	
	
	
}
