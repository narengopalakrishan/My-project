Feature: To check the login functionality

  Scenario Outline: Check whether login is successfully
    Given user is on login page
    When enter <userid> and <password>
    And click login button
    Then user is logged-in
    And close chrome
 Examples:
|userid|password|
|Naren|Qwert@123|
|7788665544|abcd@123|