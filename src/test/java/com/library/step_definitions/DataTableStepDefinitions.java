package com.library.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTableStepDefinitions {
    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> fruitsList) {
       //print out the size it the list
        System.out.println("fruits = " + fruitsList.size()); //soutv to print automatically
        System.out.println("fruitsList = " + fruitsList);

    }

}
