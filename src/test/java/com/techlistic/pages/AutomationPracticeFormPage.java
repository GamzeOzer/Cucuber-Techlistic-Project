package com.techlistic.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.techlistic.utils.BaseClass;

public class AutomationPracticeFormPage extends BaseClass {

	@FindBy(xpath="//input[@name='firstname']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@name='sex']")
	public List<WebElement> genderList;
	
	@FindBy(xpath="//input[@name='exp']")
	public List<WebElement> expList;
	
	@FindBy(id="datepicker")
	public	WebElement datePicker;
	
	@FindBy(xpath="//input[@name='profession']")
	public List<WebElement> professionList;
	
	@FindBy(xpath="//input[@name='tool']")
	public List<WebElement> toolList;
	
	@FindBy(id="continents")
	public WebElement continents;
	
	@FindBy(id="selenium_commands")
	public WebElement seleniumCommands;
	
	@FindBy(id="photo")
	public WebElement uploadFile;
	
	@FindBy(xpath="//a[text()='Click here to Download File']")
	public WebElement downloadFile;
	
	@FindBy(id="submit")
	public WebElement submitBtn;
	
	@FindBy(xpath="//span[@style='font-weight: 700; margin: 0px; padding: 0px;']")
	public List<WebElement> labels;
	
	public AutomationPracticeFormPage() {
		PageFactory.initElements(driver, this);
	}
}
