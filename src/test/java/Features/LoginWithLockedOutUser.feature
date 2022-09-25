@Login

Feature: Locked out user login

  @SignUp
  Scenario Outline: Sign up
    Given User is on the login page
    When User captures username and password "<username>","<password>"
    Then Locked Out User not logged in successfully and error displayed
    Examples:
      | username        | password     |
      | locked_out_user | secret_sauce |