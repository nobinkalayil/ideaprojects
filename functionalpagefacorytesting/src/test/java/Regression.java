import org.junit.Test;
import pageObject.HeaderPage;
import pageObject.ResultPage;


import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;
import java.util.List;

public class Regression extends Hooks {
    private HeaderPage headerPage =new HeaderPage();
    private ResultPage resultsPage=new ResultPage();

    @Test
    public void productReviewrating() {

     headerPage.searchproduct("nike");
    // resultsPage.linktext("GOT IT");
         resultsPage.selectRevieRating("4or more");
    //    resultsPage.selectPricerate("£10 - £15");
    //   resultsPage.ReviewpriceList();
    //  resultsPage.ReviewpriceList();
    //  List<Double> priceRate = resultsPage.getAllRating();

    List<Double> actual = resultsPage.getAllRating();

    //  System.out.println(actual);


    assertThat(actual, everyItem(greaterThan(4.0)));
    //  assertThat(priceRate, everyItem(greaterThan(10.0)));
    //  assertThat(priceRate,everyItem(lessThanOrEqualTo(21.0)));
    //  assertThat(priceRate, everyItem(greaterThanOrEqualTo(5.0)));



}
}
