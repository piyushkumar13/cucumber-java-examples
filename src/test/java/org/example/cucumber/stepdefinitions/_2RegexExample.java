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
public class _2RegexExample {

    @Given("^user navigates to \"(.*)\" url$")
    public void user_navigates_to_url(String url) {
        System.out.println("url is : " + url);

    }
    @When("^user types \"(.*)\" in search box$")
    public void user_types_in_search_box(String category) {

        System.out.println("User typed category : " + category);
    }
    @When("user clicks the search button")
    public void user_clicks_the_search_button() {

        System.out.println("Printing : user clicks the search button");
    }
    @Then("^users finds (\\d+) pliers$")
    public void users_receives_pliers(int num) {

        System.out.println("No of pliers : " + num);
    }

}
