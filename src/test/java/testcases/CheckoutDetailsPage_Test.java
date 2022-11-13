package testcases;

import org.testng.annotations.Test;

import pages.CheckoutDetails_Page;

public class CheckoutDetailsPage_Test {
	
	@Test
	public void checkoutDetails_Page() throws Exception {
		CheckoutDetails_Page check = new CheckoutDetails_Page();
		check.shippingAddressdropdown();
		check.shippingaddress();
		check.ShippingMethodNextDayAir();
		check.paymentmethod();
		check.paymentinfo();
		check.confirmorder();
		
	}

}
