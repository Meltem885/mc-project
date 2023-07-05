Feature:
#   US_001: User should create an account in the Amazon
  @sk
  Scenario: User should create an account in the Amazon by using valid credential
    Given user navigates to "https://www.amazon.co.uk/"
    When user hover-overs on the Hello, sign in module
    And user sees Start here. link and clicks on it
    And user enters First and last name
    And user enters phone number or email
    And user enters password
    And user reenters password
    And user clicks continue button
#
#    Scenario Outline:
#      Given user navigates to "https://www.amazon.co.uk/"
#      When user hover-overs on the Hello, sign in module
#      And user sees Start here. link and clicks on it
#      And user enters "<First and last name>"
#      And user enters "<phone number or email>"
#      And user enters "<password>"
#      And user "<reenters password>"
#
#
#      Examples:
#        |  First and last name|phone number or email|password| reenters password|