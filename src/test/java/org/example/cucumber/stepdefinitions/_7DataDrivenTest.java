/*
 *  Copyright (c) 2024 Piyush Kumar
 *  All Rights Reserved Worldwide.
 */

package org.example.cucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Piyush Kumar.
 * @since 24/01/25.
 */
public class _7DataDrivenTest {

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        System.out.println("Printing : user is on registration page");
    }

    @When("user enters provides username {string} password {string} rollno {int} course fee {double}")
    public void user_enters_provides_username_password_rollno_course_fee(String username, String password, Integer rollNo, Double courseFee) {
        System.out.println("Printing : username : " +  username + " password : " + password + " rollNo : " + rollNo + " courseFee : " + courseFee);
    }

    @Then("user registration should be successful")
    public void user_registration_should_be_successful() {
        System.out.println("Printing : user registration should be successful");
    }
}
