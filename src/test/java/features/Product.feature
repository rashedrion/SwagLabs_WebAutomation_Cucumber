Feature: Product feature test

  Background:
#    Given user logged in with "standard_user" "secret_sauce"
#    Given user is on the login page
#    When user input valid "standard_user" and "secret_sauce"
#  And user click on the login button
    Given user is on the login page
    And user input valid "standard_user" and "secret_sauce"
    And user click on the login button

  Scenario: Test product page title
    Then user should see product url


  Scenario: Test cart items add
    When user click on add to cart button
    Then user should see button on remove
