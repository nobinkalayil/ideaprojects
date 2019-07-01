import org.junit.Test;
import pageObject.Locator;

public class RegressionSuit extends Hooks {
    Locator locator = new Locator();
    @Test
    public void reviewByRating(){
        locator.searchProduct("nike");
       /* locator.selectreviewrate("4or more");
        locator.selectPricerate("£5 - £10");
        List<Double> priceRate = locator.getPriceRating();

        List<Double> actual = locator.getAllRating();

        System.out.println(actual);

        assertThat(actual, everyItem(greaterThan(4.0)));
        assertThat(priceRate, everyItem(greaterThanOrEqualTo(11.0)));
        assertThat(priceRate,everyItem(lessThanOrEqualTo(21.0)));
        assertThat(priceRate, everyItem(greaterThanOrEqualTo(5.0)));
        */

    }
}
