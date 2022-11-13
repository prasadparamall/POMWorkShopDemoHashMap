package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.Logout_Page;
import baseclass.baseclass;


public class LogoutPage_Test {
	
	@Test(priority = 1)
	public void logout() throws Exception {
		Logout_Page logout1 = new Logout_Page();
		
		logout1.logout_Page();
	}
	
	@AfterMethod
	public void tearDown(){
		if(baseclass.driver!=null){
		baseclass.quitBrowser();
		}
	}
	

}
