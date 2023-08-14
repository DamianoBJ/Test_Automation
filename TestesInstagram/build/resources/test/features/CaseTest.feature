Feature: Test in instagram page, Create new account, recovery acess , test of login page and more

  Scenario: 1- Create new account, to acess the instagram
    Given browser instagram is open, in home page
    And Click in button Sign in, but dont have any infformation of user / pass
    When Click in Sign up
    And open page to create account
    Then fill in the fields email, Name, Name User, Password
    And Clink in Sign up
    And Open de homepage of instagram to navegate in the website


  Scenario: 2-