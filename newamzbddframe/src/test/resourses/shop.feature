Feature: Select an item and proceed till checkout
  As a user
  I want to search for a product
  So I can purchase it

  @reg
  Scenario: Purchase a product
    Given I am on home page
    When I select shop by department tab
    And Navigate to Movies, TV & Games > PC & Video Games
    And I search for "Nintendo Switch Neon Red/ Neon Blue"
    When I select the product and add it to trolley
    Then I will be diverted to check out page,where i can see the number of item selected and the total amount