package com.company.webapp;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BaseSeleniumTests {

	private static final String FIREDRIVER_EXE = "geckodriver";
    protected WebDriver driver;

    @Before
    public void setUp() {
        String driverFile = findFile();
        System.setProperty("webdriver.gecko.driver", driverFile);
        this.driver = new FirefoxDriver();
    }

    private String findFile() {
		return	"src/test/resources/" + FIREDRIVER_EXE;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	
}
