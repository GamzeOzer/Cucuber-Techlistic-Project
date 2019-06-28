package com.techlistic.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static void setUp() {
		ConfigsReader.readPropertyFile();
		String browser=ConfigsReader.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", "src/test/resources/drivers/geckodriver");
			driver=new ChromeDriver();
	}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));
		driver.manage().window().fullscreen();
		
	
	}
	
	public static void tearDown() {
		driver.close();
	}
}
