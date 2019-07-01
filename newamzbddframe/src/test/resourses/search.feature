Feature:
  As a end user
  I want to search for product
  So that I can view results

  Scenario: Search for a product
    Given  I am on homepage
    When I search for a product "puma"
    Then I should be able to see respective results
