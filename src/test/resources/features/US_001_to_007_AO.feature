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

  Scenario: US_005_TC001 As a user, I should be able to see the various headers and check some language features on the homepage.

    Then AO verifies 'All in One Place for Practice Management' section is visible
    Then AO verifies 'Why You Love Hypnotes?' section is visible.

  Scenario: US_006_TC001 As a user, I should be able to see various titles and make various controls on the homepage.

    Then AO verifies About Hypnotes header is visible and clickable
    Then AO clicks on About Hypnotes link and verifies relevant page has url "https://test.hypnotes.net/about-us"
    Then AO verifies Who is Hypnotes? and other titles are visible

  Scenario: US_007_TC001 As a user, I should be able to see various titles and make various controls on the homepage.

    Then AO verifies Youtube video under About Hypnotes section on homepage is clickable
    Then AO verifies Youtube video starts to play.
    Then AO verifies More about Hypnotes section is visible














