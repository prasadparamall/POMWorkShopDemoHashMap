package testcases;

import org.testng.annotations.Test;


import pages.GotoCard_Page;

public class GotoCardPage_Test {
	
	@Test
	public void gotocard() throws Exception {
		GotoCard_Page gotoC = new GotoCard_Page();
		gotoC.gotoCards();
	}


}
