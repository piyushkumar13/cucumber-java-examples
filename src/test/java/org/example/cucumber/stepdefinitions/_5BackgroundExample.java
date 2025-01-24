/*
 *  Copyright (c) 2024 Piyush Kumar
 *  All Rights Reserved Worldwide.
 */

package org.example.cucumber.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.TestInstance;

/**
 * @author Piyush Kumar.
 * @since 24/01/25.
 */

public class _5BackgroundExample {

    /* More details on cucumber hooks : https://cucumber.io/docs/cucumber/api?lang=java#hooks */
//    @BeforeAll
//    public static void beforeAllSetUp(){
//        System.out.println("Inside beforeAllSetUp");
//    }
//
//    @Before
//    public void beforeSetUp(){
//        System.out.println("Inside beforeSetUp");
//    }
//
//    @After
//    public void afterCleanUp(){
//        System.out.println("Inside afterCleanUp");
//    }
//
//    @BeforeStep
//    public void beforeStep(){
//        System.out.println("Inside beforeStep");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("Inside afterStep");
//    }
//
//    @AfterAll
//    public static void afterAllCleanUp(){
//        System.out.println("Inside afterAllCleanUp");
//    }

    @Given("user navigates to website")
    public void user_navigates_to_website() {
        System.out.println("Printing : user navigates to website");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Printing : user enters username and password");
    }

    @Then("logs in to the site")
    public void logs_in_to_the_site() {
        System.out.println("Printing : logs in to the site");
    }

    @When("user clicks on cancelled order option")
    public void user_clicks_on_cancelled_order_option() {
        System.out.println("Printing : user clicks on cancelled order option");
    }

    @Then("all cancelled orders are listed")
    public void all_cancelled_orders_are_listed() {
        System.out.println("Printing : all cancelled orders are listed");
    }

    @Given("user has added some items to cart")
    public void user_has_added_some_items_to_cart() {
        System.out.println("Printing : user has added some items to cart");
    }

    @When("user clicks on cart tab")
    public void user_clicks_on_cart_tab() {
        System.out.println("Printing : user clicks on cart tab");
    }

    @Then("list of selected items are listed")
    public void list_of_selected_items_are_listed() {
        System.out.println("Printing : list of selected items are listed");
    }

    @When("user clicks on pending order option")
    public void user_clicks_on_pending_order_option() {
        System.out.println("Printing : user clicks on pending order option");
    }

    @Then("all pending orders are listed")
    public void all_pending_orders_are_listed() {
        System.out.println("Printing : all pending orders are listed");
    }
}
