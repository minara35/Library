package com.library.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLoginStepDefinitions {
    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("-> User is on the login page");

    }




    @When("User logs in as librarian")
    public void user_logs_in_as_librarian() {
        System.out.println("-> User logs in as librarian");

    }
    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("-> User should see dashboard");

    }




}
