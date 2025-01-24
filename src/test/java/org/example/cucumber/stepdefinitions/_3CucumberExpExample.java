/*
 *  Copyright (c) 2024 Piyush Kumar
 *  All Rights Reserved Worldwide.
 */

package org.example.cucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * We can check more cucumber expressions here : https://github.com/cucumber/cucumber-expressions#readme
 *
 * @author Piyush Kumar.
 * @since 24/01/25.
 */
public class _3CucumberExpExample {

    @Given("the user browse to {string} url")
    public void the_user_browse_to_url(String url) {

        System.out.println("Url is : " + url);
    }

    @When("the user writes {string} in search box")
    public void the_user_writes_in_search_box(String category) {

        System.out.println("Category is : " + category);
    }

    @When("user press the search button")
    public void user_press_the_search_button() {

        System.out.println("User pressed the search button");
    }

    @Then("users finds {int} hammer")
    public void users_finds_hammer(Integer num) {

        System.out.println("Number of hammers : " + num);
    }
}
