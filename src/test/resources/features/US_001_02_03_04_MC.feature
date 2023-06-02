Feature: US_001 As a user I should be able to access the home page.
  Background:
  Given MC goes to home page


  Scenario: US_001_TC001 The home page must be accessible when the URL is entered.



    Given MC verifies the url

  Scenario: US_002_TC001 Blog, Services, Solutions, Pricing, Contact us, About us, ?,
  Login, Sign Up headings should be visible and clickable


    Given MC headings are visible in the home page
    Then MC verifies headings are clickable in the home page


  Scenario: US_003_TC001 Try it for Free, Sign In headers should be visible and clickable


    Given MC verifies try it for Free is visible and clickable
    Then MC verifies Sign In headers is visible and clickable











