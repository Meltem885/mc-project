@US_001
Feature: US_001 As a user I should be able to access the home page.

  Scenario: US_001_TC001 The home page must be accessible when the URL is entered


    Given AO goes to home page
    Then AO verifies the url

  Scenario: US_002_TC001 Blog, Services, Solutions, Pricing, Contact us, About us, ?,
  Login, Sign Up headings should be visible and clickable.

    Given AO goes to home page
    Then AO verifies headings are visible in the home page
    Then AO verifies headings are clickable in the home page


  Scenario: US_003_TC001 Try it for Free, Sign In headers should be visible and clickable.

    Given AO goes to home page
    Then AO verifies try it for Free is visible and clickable
    Then AO verifies Sign In headers is visible and clickable





  Scenario: US_003_TC002 At the bottom of the page, Go ahead, give it a try! and Try it for Free should be visible and clickable.
                         After clicking Therapist Register section should be visible.
                         Related page url must be: https://test.hypnotes.net/register













