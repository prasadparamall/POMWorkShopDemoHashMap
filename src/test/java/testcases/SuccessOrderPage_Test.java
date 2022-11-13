package testcases;

import org.testng.annotations.Test;

import pages.SuccessOrder_Page;

public class SuccessOrderPage_Test {
	
	@Test
	public void successOrder_Page() throws Exception {
		SuccessOrder_Page sucee = new SuccessOrder_Page();
		sucee.successfullprocessed();
		sucee.orderDetails();
		
	}

}
