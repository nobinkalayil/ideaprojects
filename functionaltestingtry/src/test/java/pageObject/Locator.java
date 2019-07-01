package pageObject;

import driver.Drivermanager;
import org.openqa.selenium.By;

public class Locator extends Drivermanager {
    public void searchProduct(String item) {
        driver.findElement(By.id("searchTerm")).sendKeys(item);
        driver.findElement(By.className("argos-header__search-button")).click();
    }

    /*public void selectreviewrate(String CustomerRating) {
        List<WebElement> ratings = driver.findElements(By.cssSelector(".ac-facet__filters--rating>li>label"));
        System.out.println(ratings);
        for (WebElement rating : ratings) {
            String ratingInString = rating.getText();
            System.out.println(ratingInString);
            if (ratingInString.matches(CustomerRating)) {
                rating.click();
                break;
            }
            System.out.println(rating);
            System.out.println(ratingInString);

        }


    }

    public List<Double> getAllRating() {
        List<Double> actualRatinglist = new ArrayList<>();
        List<WebElement> ratings = driver.findElements(By.cssSelector(".ac-star-rating"));
        System.out.println(ratings);
        for (WebElement rating : ratings) {
            String ratingInstring = rating.getAttribute("data-star-rating");
            double ratingIndouble = Double.parseDouble(ratingInstring);
            actualRatinglist.add(ratingIndouble);

            System.out.println(actualRatinglist);
        }
        return actualRatinglist;


    }
    public void selectPricerate(String CustomerRating) {
        List<WebElement> values = driver.findElements(By.cssSelector(".ac-facet__filters--default>li>label"));
        System.out.println(values);
        for (WebElement price : values) {
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

    public List<Double> getPriceRating() {
        List<Double> actualPricelist = new ArrayList<>();
        List<WebElement> value = driver.findElements(By.cssSelector(".ac-product-price__amount"));
        //System.out.println(value);
        for (WebElement price : value) {
            String ratingInstring = price.getText();
            Double indivprice = Double.parseDouble(ratingInstring.substring(1));
            System.out.println(indivprice);

            actualPricelist.add(indivprice);

            System.out.println(actualPricelist);
        }
        return actualPricelist;


    }
    */



}
