/*
 *  Copyright (c) 2024 Piyush Kumar
 *  All Rights Reserved Worldwide.
 */

package org.example.cucumber.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;

/**
 * @author Piyush Kumar.
 * @since 24/01/25.
 */
public class _6DatatableExample {

    @Given("user is on signin page")
    public void user_is_on_signin_page() {

        System.out.println("Printing : user is on signin page");
    }

    @When("user enters following user credentials")
    public void user_enters_following_user_credentials(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("Printing : user enters following user credentials");

        List<List<String>> usersCredsList = dataTable.asLists(String.class);

        System.out.println("Printing : User1 username ::: " + usersCredsList.get(0).get(0));
        System.out.println("Printing : User1 password ::: " + usersCredsList.get(0).get(1));

        System.out.println("Printing : User2 username ::: " + usersCredsList.get(1).get(0));
        System.out.println("Printing : User2 password ::: " + usersCredsList.get(1).get(1));
    }

    @Then("user signin should be successful")
    public void user_signin_should_be_successful() {

        System.out.println("Printing : user signin should be successful");
    }

    @Given("user is on signin page with columns")
    public void user_is_on_signin_page_with_columns() {
        System.out.println("Printing : user is on signin page with columns");

    }

    @When("user enters following user credentials with columns")
    public void user_enters_following_user_credentials_with_columns(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        System.out.println("Printing : user enters following user credentials with columns");

        List<Map<String, String>> userCredsMap = dataTable.asMaps(String.class, String.class);

        System.out.println("Printing : User1 username with columns ::: " + userCredsMap.get(0).get("UserName"));
        System.out.println("Printing : User1 password with columns ::: " + userCredsMap.get(0).get("Password"));

        System.out.println("Printing : User2 username with columns ::: " + userCredsMap.get(1).get("UserName"));
        System.out.println("Printing : User2 password with columns ::: " + userCredsMap.get(1).get("Password"));

    }

    @Then("user signin should be successful with columns")
    public void user_signin_should_be_successful_with_columns() {

        System.out.println("Printing : user signin should be successful with columns");
    }
}
