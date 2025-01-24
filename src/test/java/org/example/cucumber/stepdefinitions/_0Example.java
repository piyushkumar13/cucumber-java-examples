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
public class _0Example {

    @Given("I launch browser")
    public void i_launch_browser() {

        System.out.println("Printing : I launch browser");

    }
    @When("click on button")
    public void click_on_button() {

        System.out.println("Printing : click on button");

    }
    @Then("should open")
    public void should_open() {
        System.out.println("Printing : should open");
    }

}
