Feature: Realizar login com o cadastro standart ja criado

  Scenario: Realizar login no site
    Given browser swagLabs is open
    And user is on login page
    When user enters user and pass
    And click in login button
    Then user is navigated

