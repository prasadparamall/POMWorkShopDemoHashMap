package testcases;

import org.testng.annotations.Test;

import pages.ClearShopping_Page;

public class ClearShoppingPage_Test {
	
	@Test
	public void clearshoppingcard() throws Exception {
		
		ClearShopping_Page clear = new ClearShopping_Page();
		clear.clearAddItems();
	}

}
