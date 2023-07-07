Feature: As a user, I should be able to get services.

  Scenario: TC001 - positive scenario
    Given user connects to the "/dashboard/getAllReport" without payload
    Then user verifies the status code is 200
