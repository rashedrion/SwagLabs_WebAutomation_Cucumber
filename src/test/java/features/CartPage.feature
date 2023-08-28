Feature: Cart feature test
  Background:
    Given user is on the login page
    And user input valid "standard_user" and "secret_sauce"
    And user click on the login button
    And user click on add to cart button

  Scenario: Test cart icon click
    When user click on cart icon
    Then user should show cart page title

   Scenario: Test cart items Information
     When user click on cart icon
     Then user should see product name
     And user should see product price

   Scenario: Test cart items remove
     When user click on cart icon
     And user click on remove item button
     Then user should see Null

    Scenario: Test checkout button
      When user click on cart icon
      And user click on checkout_button
      Then user should go checkout page
