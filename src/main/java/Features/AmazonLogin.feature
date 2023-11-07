@Login

Feature: Amazon Login

  @SignUp
  Scenario Outline: Sign up
    Given User is on the login page
    When User captures MobileNumber and password "<MobileNumber>","<password>"
    Then User logged in successfully
    Then User selects Electronic option
      Examples:
     | MobileNumber       | password     |
      | 9966477626 | Sriraju.5 |