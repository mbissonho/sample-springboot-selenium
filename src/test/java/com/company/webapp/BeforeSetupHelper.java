package com.company.webapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BeforeSetupHelper {

private static WebDriver firefoxWebdriver = null;
	
	public static void setUpFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver","/home/mateus/Desktop/sample-springboot-selenium/src/test/resources/geckodriver");
		BeforeSetupHelper.firefoxWebdriver = (WebDriver) new FirefoxDriver();
	}
	
	public static WebDriver getFirefoxWebdriver() {
		return firefoxWebdriver;
	}
	
}
