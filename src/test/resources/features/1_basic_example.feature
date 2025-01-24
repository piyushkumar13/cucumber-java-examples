# Created by pikumar at 24/01/25
Feature: Search Functionality
  As a user, I would like to search for products in the site, so that
  I can find my desired item which I want to purchase.

  Scenario: Search product by category
    Given user navigates to practicesoftwaretesting website
    When user types plier in search box
    And clicks the search button
    Then users receives list of pliers