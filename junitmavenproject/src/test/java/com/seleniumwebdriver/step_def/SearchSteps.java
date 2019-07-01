package com.seleniumwebdriver.step_def;

import com.seleniumwebdriver.pages.HeaderPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;

public class SearchSteps {
    private HeaderPage headerPage = new HeaderPage();

    @Given("^: I am on homepage$")

    public void i_am_on_homepage()  {

    }

    @When("^: I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String item)  {
        headerPage.search(item);

    }

    @Then("^I should be able to see respective product$")
    public void i_should_be_able_to_see_respective_product()  {

    }


}
