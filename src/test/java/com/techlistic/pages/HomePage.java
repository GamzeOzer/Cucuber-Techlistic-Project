package com.techlistic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.techlistic.utils.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//a[text()='AUtoMation Practice form']")
	public WebElement AutomationPracticeFormLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
