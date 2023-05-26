@US_001
Feature: US_001 As a user I should be able to access the home page.

  Background:
  Given AO goes to home page

  Scenario: US_001_TC001 The home page must be accessible when the URL is entered


   // Given AO goes to home page
    Then AO verifies the url

  Scenario: US_002_TC001 Blog, Services, Solutions, Pricing, Contact us, About us, ?,
  Login, Sign Up headings should be visible and clickable.

    // Given AO goes to home page
    Then AO verifies headings are visible in the home page
    Then AO verifies headings are clickable in the home page

  Scenario: US_003_TC001 Try it for Free, Sign In headers should be visible and clickable.

    // Given AO goes to home page
    Then AO verifies try it for Free is visible and clickable
    Then AO verifies Sign In headers is visible and clickable


  Scenario: US_003_TC002 At the bottom of the page, Go ahead, give it a try! and Try it for Free should be visible and clickable.
                         After clicking Therapist Register section should be visible.
                         Related page url must be: https://test.hypnotes.net/register
    // Given AO goes to home page
    And AO goes to at the button of home page
    Then AO verifies Go ahead, give it a try! text is visible
    Then AO verifies Try it for Free button is visible and clickable.
    And AO clicks the Try it for Free button
    Then AO verifies Therapist Register section is visible.
    Then AO verifies Related page url is "https://test.hypnotes.net/register"

Scenario: US_004_TC001 As a user, I should be able to see social media icons and control some functions on the homepage.

  Then AO verifies Facebook, LinkedIn, Twitter, Instagram icons is visible and clickable.
  Then AO clicks on Facebook and verifies the company-related pages is visible
  Then AO clicks on LinkedIn and verifies the company-related pages is visible
  Then AO clicks on Twitter and verifies the company-related pages is visible
  Then AO clicks on Instagram and verifies the company-related pages is visible










