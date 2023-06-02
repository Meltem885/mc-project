@US_014

Feature: US_014 As a user, I should be able to see the functionality of the register page and check valid/invalid name, surname and email.

  Background:
    Given AO goes to home page
    When AO clicks on Sign Up button
    And AO clicks on the Client button

  Scenario: US_014_TC_001 Name, Surname, Email, Password fields must be visible and functional
    Then AO verifies Name, Surname, Email, Password fields are visible and functional

  Scenario Outline: US_014_TC_002 Name, Surname, Email, Password fields should not be left blank
    When AO enters "<name>" in the name field
    And AO enters "<surname>" in the surname field
    And AO enters "<email>" in the email field
    And AO enters "<password>" in the password field
    And AO clicks on Sign Up button in register Page
    Then AO gets "Please fill in this field." warning message
    Examples:
      | name | surname | email        | password  |
      |      | Oz      | oz@gmail.com | Oztu1234. |
      | Alo  |         | oz@gmail.com | Oztu1234. |
      | Alo  | Oz      |              | Oztu1234. |
      |      | Oz      |              | Oztu1234. |
      |      |         | oz@gmail.com | Oztu1234. |
      | Alo  |         |              | Oztu1234. |







#  Name, Surname, Email, Password fields should not be left blank.
#  A warning should appear if no valid email has been entered: Please enter a valid email