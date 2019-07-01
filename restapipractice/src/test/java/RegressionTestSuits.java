import io.restassured.response.Response;

import java.util.List;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;
import static io.restassured.RestAssured.given;

public class RegressionTestSuits {



@Test
    public void getUserTest() {


        Response response = given().when().get("http://ec2-52-14-141-208.us-east-2.compute.amazonaws.com:9089/register");
      //  List<Integer>  ids = response.then().extract().path("id");
        List<String> name= response.then().extract().path("username");
    System.out.println(name);
    response.then().body("useername", contains("nobin"));




    }
}
