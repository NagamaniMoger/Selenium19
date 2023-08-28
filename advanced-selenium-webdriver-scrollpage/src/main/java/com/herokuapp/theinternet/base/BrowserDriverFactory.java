package com.herokuapp.theinternet.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverFactory {
	
	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private String browser;
	private Logger log;
	
	public BrowserDriverFactory(String browser, Logger log)
	{
		this.browser=browser.toLowerCase();
		this.log = log;
	}
	
	public WebDriver createDriver()
	{
		// Create driver
		//System.out.println("Create driver: " + browser );
		log.info("Create driver: " + browser );
		
		switch(browser)
		{
			case "chrome":
				driver.set(new ChromeDriver());
				break;
				
			case "firefox":
				driver.set(new FirefoxDriver());
				break;
				
			default :
				System.out.println("Do not know how to start:" + browser + ", strating chrome instead.");
				driver.set(new ChromeDriver());
				break;
		}
		
		return driver.get();
	}

}
