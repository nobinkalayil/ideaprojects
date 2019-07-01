package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HeaderPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;
public class ResultSteps extends HeaderPage {

    private HeaderPage headerPage = new HeaderPage();




    @Given("^I am on home page$")
    public void i_am_on_home_page()  {



    }

    @When("^I select shop by department tab$")
    public void i_select_shop_by_department_tab()  {
        headerPage.shopByDepartment();

    }

    @When("^Navigate to Movies, TV & Games > PC & Video Games$")
    public void navigate_to_Movies_TV_Games_PC_Video_Games()  {
        headerPage.navigateToMoviePcTV();

    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String item)  {
        headerPage.searchForThatProduct(item);

    }

    @When("^I select the product and add it to trolley$")
    public void i_select_the_product_and_add_it_to_trolley()  {
        headerPage.selectProductToBasket();


    }

    @Then("^I will be diverted to check out page,where i can see the number of item selected and the total amount$")
    public void i_will_be_diverted_to_check_out_page_where_i_can_see_the_number_of_item_selected_and_the_total_amount()  {
        headerPage.editBasketProduct();
        String actual = headerPage.getBasketpronames();
        String Expected = searchItem;
        assertThat(actual, is("Nintendo Switch - Neon Red/Neon Blue"));

        System.out.println(actual);

    }


}
