@Login

Feature: Facebook Login

  @SignUp
  Scenario Outline: Sign up
    Given User is on the login page
    When User captures email and password "<MobileNumber>","<password>"
    Then User logged in successfully
    Then User selects Allow button
      Examples:
     | MobileNumber       | password     |
      | 9966477626 | Sriraju.5 |