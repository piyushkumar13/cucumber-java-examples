# Created by pikumar at 24/01/25
# We can check more cucumber expressions here : https://github.com/cucumber/cucumber-expressions#readme
Feature: Search Functionality
  As a user, I would like to search for products in the site, so that
  I can find my desired item which I want to purchase.

  Scenario: Search product by category
    Given the user browse to "https://practicesoftwaretesting.com" url
    When the user writes "hammer" in search box
    And user press the search button
    Then users finds 4 hammer