# Created by pikumar at 24/01/25
Feature: User signin

  Scenario: User signin with different username and password
    Given user is on signin page
    When user enters following user credentials
      | testUser1 | testUser1@123 |
      | testUser2 | testUser2@123 |
    Then user signin should be successful

  Scenario: User signin with different username and password with columns
    Given user is on signin page with columns
    When user enters following user credentials with columns
      | UserName  | Password      |
      | testUser1 | testUser1@123 |
      | testUser2 | testUser2@123 |
    Then user signin should be successful with columns