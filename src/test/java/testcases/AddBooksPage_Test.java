package testcases;

import org.testng.annotations.Test;

import pages.AddBooks_Page;

public class AddBooksPage_Test {
	
	@Test
	public void addbookspage() throws Exception {
		AddBooks_Page addBP = new AddBooks_Page();
		addBP.addbooks();
	}

}
