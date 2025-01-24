/*
 *  Copyright (c) 2024 Piyush Kumar
 *  All Rights Reserved Worldwide.
 */

package org.example.cucumber.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Piyush Kumar.
 * @since 24/01/25.
 */
public class _1BasicExample {

    private Page page;

    @Given("user navigates to practicesoftwaretesting website")
    public void user_navigates_to_url() {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();

        page = browser.newPage();
        page.navigate("https://practicesoftwaretesting.com");
    }

    @When("user types plier in search box")
    public void user_types_plier_in_search_box() {

        page.getByPlaceholder("Search").fill("pliers");
    }

    @When("clicks the search button")
    public void clicks_the_search_button() {

        page.locator("button:has-text('Search')").click();
    }

    @Then("users receives list of pliers")
    public void users_receives_list_of_pliers() {
        page.waitForTimeout(2000);

        int cardsCount = page.locator(".card").count();

        System.out.println("The cards count is : " + cardsCount);

        assertThat(cardsCount).isEqualTo(4);
    }

}
