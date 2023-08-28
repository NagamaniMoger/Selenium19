package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {
	
	private String pageUrl = "http://the-internet.herokuapp.com/";
	
	private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
	private By checkboxesLinkLocator = By.linkText("Checkboxes");
	private By dropdownLinkLocator = By.linkText("Dropdown");
	private By javaScriptAlertsLinkLocator = By.linkText("JavaScript Alerts");
	private By multipleWindowsLinkLocator = By.linkText("Multiple Windows");
	private By editorLinkLocator = By.linkText("WYSIWYG Editor");
	
	public WelcomePage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	//Open Welcome Page with it's url
	public void openPage() {
		log.info("Opening Page: " + pageUrl);
		//driver.get(pageUrl);
		openUrl(pageUrl);
		log.info("Page Opened");
	}
	
	//Open Login Page by clicking on Form Authentication Link
	public LoginPage clickFormAuthenticationLink() {
		log.info("Clicking Form Authentication Link on Welcome Page");
		//driver.findElement(formAuthenticationLinkLocator).click();
		click(formAuthenticationLinkLocator);
		return new LoginPage(driver,log);
	}
	
	//Open CheckboxesPage by clicking on checkboxes link
	public CheckboxesPage clickCheckboxesLink() {
		log.info("Clicking checkboxes link on welcome page");
		click(checkboxesLinkLocator);
		return new CheckboxesPage(driver, log);
	}
	
	//Dropdown Page
	public DropdownPage clickDropdownLink() {
		log.info("Clicking Dropdown Link on Welcome Page");
		click(dropdownLinkLocator);
		return new DropdownPage(driver, log);
	}
	
	//Alerts Page
	public JavaScriptAlertsPage clickJavaScriptAlertsLink() {
		log.info("Clicking JavaScript Alerts link on Welcome Page");
		click(javaScriptAlertsLinkLocator);
		return new JavaScriptAlertsPage(driver, log);
	}
	
	//New Windows and tabs
	public WindowsPage clickMultipleWindowsLink() {
		log.info("Clicking Multiple Windows link on Welcome Page");
		click(multipleWindowsLinkLocator);
		return new WindowsPage(driver, log);
	}
	
	//iframes
	public EditorPage clickWYSIWYGEditorLink() {
		log.info("Clicking WYSIWYG Editor link on Welcome Page");
		click(editorLinkLocator);
		return new EditorPage(driver, log);
	}
}
