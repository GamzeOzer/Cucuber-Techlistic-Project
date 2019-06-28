Feature: Practice on Demo Webpage

  Background: 
    Given I click Automation Practice Form link
    And I verify the title of the new page

  @regression
  Scenario: Providing employee details
    When I provide firstName, lastName and date
    And I select gender, years of experinece and profession
    And I select Automation Tools and Continents
    And I upload a file
    Then I click on button

  @smoke
  Scenario Outline: Providing details on the form with parameters
    When I provide "<FirstName>", "<LastName>", and "<Date>"
    And I select gender, years of experinece and profession
    And I select Automation Tools and Continents
    And I upload a file
    Then I click on button

    Examples: 
      | FirstName | LastName  | Date         |
      | Mustafa   | Ozkan     | 07 June 2019 |
      | Gamze     | Ozer      | 08 June 2019 |
      | Halime    | Temiz     | 09 June 2019 |
      | Fatime    | Alaparmak | 10 June 2019 |
      | Hilal     | Kalyoncu  | 11 June 2019 |

  @regression @temp
  Scenario: Selenium Practice Form Labels Verification
    Then I see following labels
      | First name          |
      | Last name           |
      | Years of Experience |
      | Profession          |
      | Automation Tools    |
      | Continents          |
      | Selenium Commands   |
      | Upload Image        |
      | Download File       |

  @excell
  Scenario: Providing details with Excell sheet
    When I provide firstName, lastName and date fields from "DemoEmployeeDetails"
    And I select gender, years of experinece and profession
    And I select Automation Tools and Continents
    And I upload a file
    Then I click on button

  @dataTable
  Scenario: Replace variables with dataTable
    When I enter five different set of credentials to the form by using map and datatable
      | FirstName | LastName  | Date         |
      | Mustafa   | Ozkan     | 07 June 2019 |
      | Gamze     | Ozer      | 08 June 2019 |
      | Halime    | Temiz     | 09 June 2019 |
      | Fatime    | Alaparmak | 10 June 2019 |
      | Hilal     | Kalyoncu  | 11 June 2019 |
    And I select gender, years of experinece and profession
    And I select Automation Tools and Continents
    Then I click on button
