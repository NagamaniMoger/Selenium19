package com.herokuapp.theinternet.dropdowntests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DropdownPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class DropdownTest extends TestUtilities {

	@Test
	public void optionTwoTest() {
		log.info("Starting option Two Test");
		
		//Open main Page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		
		//Click on dropdown link
		DropdownPage dropdownPage = welcomePage.clickDropdownLink();
		
		//Select Option 2
		dropdownPage.selectOption(2);
		
		//Verify Option 2 is selected
		String selectedOption = dropdownPage.getSelectedOption();
		Assert.assertTrue(selectedOption.equals("Option 2"), "Option 2 not selected instaed selected - " + selectedOption);
	}
}
