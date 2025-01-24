# Created by pikumar at 24/01/25
@All
Feature: Exploring cucumber tag feature

  @Smoke
  Scenario: Tag1 scenario
    Given when tag1 is given
    When smoke scenario runner is executed
    Then tag1 scenario is executed


  @Smoke
  Scenario: Tag2 scenario
    Given when tag2 is given
    When smoke scenario runner is executed
    Then tag2 scenario is executed

  @Regression
  Scenario: Tag3 scenario
    Given when tag3 is given
    When regression scenario runner is executed
    Then tag3 scenario is executed

  @Smoke
  @Regression
  Scenario: Tag4 scenario
    Given when tag4 is given
    When smoke regression scenario runner is executed
    Then tag4 scenario is executed