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
public class _4TagExample {

    @Given("when tag1 is given")
    public void when_tag1_is_given() {

        System.out.println("Printing : Tag1 is given");
    }

    @When("smoke scenario runner is executed")
    public void smoke_scenario_runner_is_executed() {

        System.out.println("Printing : smoke scenario runner is executed");
    }

    @Then("tag1 scenario is executed")
    public void tag1_scenario_is_executed() {
        System.out.println("Printing : tag1 scenario is executed");
    }

    @Given("when tag2 is given")
    public void when_tag2_is_given() {
        System.out.println("Printing : when tag2 is given");
    }

    @Then("tag2 scenario is executed")
    public void tag2_scenario_is_executed() {

        System.out.println("Printing : tag2 scenario is executed");
    }

    @Given("when tag3 is given")
    public void when_tag3_is_given() {

        System.out.println("Printing : when tag3 is given");
    }

    @When("regression scenario runner is executed")
    public void regression_scenario_runner_is_executed() {

        System.out.println("Printing : regression scenario runner is executed");
    }

    @Then("tag3 scenario is executed")
    public void tag3_scenario_is_executed() {

        System.out.println("Printing : tag3 scenario is executed");
    }

    @Given("when tag4 is given")
    public void when_tag4_is_given() {

        System.out.println("Printing : when tag4 is given");
    }

    @When("smoke regression scenario runner is executed")
    public void smoke_regression_scenario_runner_is_executed() {

        System.out.println("Printing : smoke regression scenario runner is executed");
    }

    @Then("tag4 scenario is executed")
    public void tag4_scenario_is_executed() {

        System.out.println("Printing : tag4 scenario is executed");
    }

}
