package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HeaderPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchStep {
    private HeaderPage headerPage = new HeaderPage();


    @Given("^I am on homepage$")
    public void i_am_on_homepage()  {
        String actual = headerPage.getCurrenturl();
        assertThat(actual, is(endsWith("co.uk/")));

    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String item)  {
        headerPage.doSearch(item);

    }

    @Then("^I should be able to see respective results$")
    public void i_should_be_able_to_see_respective_results() {
        String actual= headerPage.getHeadername();
        System.out.println(actual);
        assertThat(actual, containsString("puma"));

    }
}
