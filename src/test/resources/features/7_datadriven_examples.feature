# Created by pikumar at 24/01/25
Feature: Student Registration

  Scenario Outline: Student registration with different different fields
    Given user is on registration page
    When user enters provides username <Username> password <Password> rollno <RollNo> course fee <Course Fees>
    Then user registration should be successful
    Examples:
      | Username   | Password       | RollNo | Course Fees |
      | "Piyush"   | "Piyush@123"   | 1      | 1550.50     |
      | "Himanshu" | "Himanshu@123" | 112    | 1650.00       |
      | "Nitin"    | "Nitin@123"    | 1324   | 1500.50     |

