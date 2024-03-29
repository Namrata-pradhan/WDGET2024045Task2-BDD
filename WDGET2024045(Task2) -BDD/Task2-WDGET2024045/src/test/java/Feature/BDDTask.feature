Feature: Login Action
  
  Description: This feature will test the Login and Logot functionality

  Scenario Outline: Login with valid and invalid credentail
    Given I open the browser
    When I enter the username "<user-name>" and password "<password>"
    Then Login sucessfully if "<caseType>" credentails are provided

    Examples: 
      | user-name     | password     | caseType |
      | standard_user | secret_sauce | vaild    |
      | secret_sauce  |         1234 | invalid  |
