Feature: To check the login functionality of the project

  Background: user is on login page
    Given User is on correct URL

  Scenario Outline: Check whether login is successfull with valid credentials
    Then Enter <fullname1> and <password1>
    And click login button
    Then check user is move to homepage

    Examples: 
      | fullname1 | password1 |
      | naren     |     12345 |

  Scenario Outline: Check whether login is unsuccessfull with invalid credentials
    Then Enter <fullname2> and <password2>
    And click login button
    Then check invalid message was shown

    Examples: 
      | fullname2                    | password2  |
      | narengopalakrishan@gmail.com | qwerty#123 |
