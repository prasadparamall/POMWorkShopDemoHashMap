package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import pages.BillingAddress_Page;
import utilities.HashMapUtilitie;
import utilities.Utilities;



public class BillingAddressPage_Test {
	
	String crend = HashMapUtilitie.BillingAdd().get("billinadd");
	String cre[] = crend.split("_");
	
	@Test
	public void BillingAdd() throws Exception {
		BillingAddress_Page billing = new BillingAddress_Page();
		billing.checkout();
		billing.BillingAddressdropdown();
		billing.BillingAdd(cre[0],cre[1],cre[2],cre[3],cre[4],cre[5],cre[6],cre[7]);
	
	}

}
