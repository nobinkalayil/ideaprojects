package pageObject;

import driver.Drivermanager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ResultPage extends Drivermanager {

    //   public void linktext(String gotit){
    //    driver.findElement(By.linkText(gotit)).click();
    //    sleep(4000);
    // }
    // @FindBy(css =".ac-facet__filters--default>li>label" )
    //  private List<WebElement>SelectPriceRate;

    // @FindBy( css = ".ac-product-price__amount")
    // private List<WebElement>reviewPriceRate;
    @FindBy(css = ".ac-facet__filters--rating>li>label" )
    private List<WebElement> reviewStarFilterItem;

    @FindBy(css = ".ac-star-rating")
    private List<WebElement> reviewRateStarImg;




   /* public void selectPricerate(String CustomerRating) {
     //   List<WebElement> values = driver.findElements(By.cssSelector(".ac-facet__filters--default>li>label"));
        System.out.println(SelectPriceRate);
        for (WebElement price : SelectPriceRate) {
            String priceInString = price.getText();
            System.out.println(priceInString);
            if (priceInString.matches(CustomerRating)) {
                price.click();
                break;
            }
            System.out.println(price);
            System.out.println(priceInString);

        }
    }


    public List<Double> ReviewpriceList() {
        List<Double> actualPricelist = new ArrayList<>();
     //   List<WebElement> value = driver.findElements(By.cssSelector(".ac-product-price__amount"));
        //System.out.println(value);
        for (WebElement price : reviewPriceRate) {
            String ratingInstring = price.getText();
            Double indivprice = Double.parseDouble(ratingInstring.substring(1));
            System.out.println(indivprice);

            actualPricelist.add(indivprice);

            System.out.println(actualPricelist);
        }
        return actualPricelist;


    }
    */

    public void selectRevieRating (String custemerRating){
        //  driver.findElement(By.linkText("GOT IT"));

        //   List<WebElement> ratings = driver.findElements(By.cssSelector(".ac-facet__filters--rating>li>label"));

        // sleep(4000);
        // System.out.println(reviewStarFilterItem);
        for (WebElement rating : reviewStarFilterItem) {
            String ratingInString = rating.getText();
            if (ratingInString.matches(custemerRating)) {
                waitUntilClickable(rating).click();


                break;

            }
        }
    }

    public List<Double> getAllRating() {
        // sleep(4000);
        List<Double> actualRatinglist = new ArrayList<>();
        sleep(4000);
        waitForInviOfElement("");
        // List<WebElement> ratings = driver.findElements(By.cssSelector(".ac-star-rating"));
        //    System.out.println(reviewStarFilterItem);
        for (WebElement rating : reviewStarFilterItem) {
            String ratingInstring = rating.getAttribute("data-star-rating");
            double ratingIndouble = Double.parseDouble(ratingInstring);
            actualRatinglist.add(ratingIndouble);
            System.out.println(ratingIndouble);

            System.out.println(actualRatinglist);
        }
        return actualRatinglist;


    }
}
