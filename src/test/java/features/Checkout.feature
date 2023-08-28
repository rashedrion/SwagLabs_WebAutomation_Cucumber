Feature: Checkout feature test
  Background:
    Given user is on the login page
    And user input valid "standard_user" and "secret_sauce"
    And user click on the login button
    And user click on add to cart button
    And user click on cart icon
    And user click on checkout_button
    And user should go checkout page


   Scenario:User checkout with valid data
     When user input valid first name and last name and postal code
     And user click on continue button
     Then user should see checkout overview page
     When  user click on finish button
     Then user should show checkout completed
