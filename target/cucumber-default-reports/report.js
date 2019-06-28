$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PracticeOnDemoWebPage.feature");
formatter.feature({
  "name": "Practice on Demo Webpage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click Automation Practice Form link",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationPraticeFormSteps.i_click_Automation_Practice_Form_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the title of the new page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationPraticeFormSteps.i_verify_the_title_of_the_new_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Replace variables with dataTable",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dataTable"
    }
  ]
});
formatter.step({
  "name": "I enter five different set of credentials to the form by using map and datatable",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Date"
      ]
    },
    {
      "cells": [
        "Mustafa",
        "Ozkan",
        "07 June 2019"
      ]
    },
    {
      "cells": [
        "Gamze",
        "Ozer",
        "08 June 2019"
      ]
    },
    {
      "cells": [
        "Halime",
        "Temiz",
        "09 June 2019"
      ]
    },
    {
      "cells": [
        "Fatime",
        "Alaparmak",
        "10 June 2019"
      ]
    },
    {
      "cells": [
        "Hilal",
        "Kalyoncu",
        "11 June 2019"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AutomationPraticeFormSteps.i_enter_five_different_set_of_credentials_to_the_form_by_using_map_and_datatable(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select gender, years of experinece and profession",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationPraticeFormSteps.i_select_gender_yeras_of_experinece_and_profession()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Automation Tools and Continents",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationPraticeFormSteps.i_select_Automation_Tools_and_Continents()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on button",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationPraticeFormSteps.i_click_on_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});