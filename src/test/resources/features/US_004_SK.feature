Feature: US 4

#  Facebook, LinkedIn, Twitter, Instagram icons should be visible.
#  Facebook, LinkedIn, Twitter, Instagram icons should be clickable.
#  After clicking the Facebook, LinkedIn, Twitter, Instagram icons, the company-related pages should be visible.
  Scenario: As a user, I should be able to see social media icons and control some functions on the homepage.
    Given SK navigates to home page
    When SK goes to bottom of the page
    Then SK verifies Facebook, LinkedIn, Twitter, Instagram icons are visible and clickable.