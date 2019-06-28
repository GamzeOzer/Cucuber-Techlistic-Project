package com.techlistic.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.techlistic.pages.AutomationPracticeFormPage;
import com.techlistic.pages.HomePage;
import com.techlistic.utils.CommonMethods;
import com.techlistic.utils.Constants;
import com.techlistic.utils.ExcelUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AutomationPraticeFormSteps extends CommonMethods {
	HomePage home;
	AutomationPracticeFormPage form;

	@Given("I click Automation Practice Form link")
	public void i_click_Automation_Practice_Form_link() {
		home = new HomePage();
		click(home.AutomationPracticeFormLink);
	}

	@Given("I verify the title of the new page")
	public void i_verify_the_title_of_the_new_page() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals("Selenium Practice Form", driver.getTitle());
	}

	@When("I provide firstName, lastName and date")
	public void i_provide_firstName_lastName_and_date() {
		form = new AutomationPracticeFormPage();
		sendText(form.firstName, "Gamze");
		sendText(form.lastName, "Ozer");
		sendText(form.datePicker, "22 agust");
	}

	@When("I select gender, years of experinece and profession")
	public void i_select_gender_yeras_of_experinece_and_profession() {
		radioBtnSelect(form.genderList, "female");
		radioBtnSelect(form.expList, "5");
		checkBoxSelect(form.professionList, "Manual Tester", "Automation Tester");

	}

	@When("I select Automation Tools and Continents")
	public void i_select_Automation_Tools_and_Continents() {
		checkBoxSelect(form.toolList, "selenium webdriver");
		selectValueFromDD(form.continents, "North America");

	}

	@When("I upload a file")
	public void i_upload_a_file() {

	}

	@Then("I click on button")
	public void i_click_on_button() {
		click(form.submitBtn);
	}

	@When("I provide {string}, {string}, and {string}")
	public void i_provide_and(String firstName, String lastName, String date) {
		form = new AutomationPracticeFormPage();
		sendText(form.firstName, firstName);
		sendText(form.lastName, lastName);
		sendText(form.datePicker, date);
	}

	@Then("I see following labels")
	public void i_see_following_labels(DataTable dataTable) {
		form = new AutomationPracticeFormPage();
		List<String> expectedLabels = dataTable.asList();

		List<String> actualLabels = new ArrayList<>();
		List<WebElement> labels = form.labels;
		for (WebElement label : labels) {
			String labelText = label.getText();
			if (!labelText.isEmpty()) {
				actualLabels.add(labelText.replace(":", "").trim());
			}
		}

		Assert.assertEquals(expectedLabels, actualLabels);

	}

	@When("I provide firstName, lastName and date fields from {string}")
	public void i_provide_firstName_lastName_and_date_fields_from(String sheetName) {
		form=new AutomationPracticeFormPage();
		ExcelUtility excel = new ExcelUtility();
		excel.openExcel(Constants.XL_FILE_PATH, sheetName);
		int rows = excel.getRowNum();
		int cols = excel.getColNum(0);

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				switch (j) {
				case 0:
					String firstName = excel.getCellData(i, j);
					sendText(form.firstName, firstName);
					break;
					
				case 1:
					String lastName = excel.getCellData(i, j);
					sendText(form.lastName, lastName);
					break;
					
				case 2:
					String date = excel.getCellData(i, j);
					sendText(form.datePicker, date);
					break;	
				}
				
				//Assert.assertEq(firstName+" "+lastName, actual);
			}
		}
	}
	@When("I enter five different set of credentials to the form by using map and datatable")
	public void i_enter_five_different_set_of_credentials_to_the_form_by_using_map_and_datatable(DataTable dataTable) {
	    form=new AutomationPracticeFormPage();
		List<Map<String,String>> maps=dataTable.asMaps();
	    
	    for(Map<String,String> map:maps) {
	    	sendText(form.firstName, map.get("FirstName"));
	    	sendText(form.lastName, map.get("LastName"));
	    	sendText(form.datePicker, map.get("Date"));
	    }
	}


}
