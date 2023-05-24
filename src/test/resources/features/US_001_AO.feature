@US_001
Feature: US_001 As a user I should be able to access the home page.

  Scenario: US_001_TC001 The home page must be accessible when the URL is entered

    Given AO goes to home page
    Then AO verifies the url
