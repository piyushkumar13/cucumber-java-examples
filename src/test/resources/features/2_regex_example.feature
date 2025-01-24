# Created by pikumar at 24/01/25
Feature: Search Functionality
  As a user, I would like to search for products in the site, so that
  I can find my desired item which I want to purchase.

  Scenario: Search product by category
    Given user navigates to "https://practicesoftwaretesting.com" url
    When user types "plier" in search box
    And user clicks the search button
    Then users finds 4 pliers