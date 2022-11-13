package testcases;

import org.testng.annotations.Test;

import baseclass.baseclass;



public class OpenBrowserAndUrl_Test {

	@Test(priority = 1)
	public void openBrowserAndURL() throws Exception {
		baseclass.setup();;	
		Thread.sleep(2000);
	}
	
	
}
