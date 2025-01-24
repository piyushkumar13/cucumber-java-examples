# Created by pikumar at 24/01/25
Feature: Check Order

  Background:
    Given user navigates to website
    When user enters username and password
    Then logs in to the site

  Scenario: Check cart
    Given user has added some items to cart
    When user clicks on cart tab
    Then list of selected items are listed

  Scenario: Check pending order
    When user clicks on pending order option
    Then all pending orders are listed

  Scenario: Check cancelled order
    When user clicks on cancelled order option
    Then all cancelled orders are listed