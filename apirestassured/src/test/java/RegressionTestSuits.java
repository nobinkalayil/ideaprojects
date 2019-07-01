import com.google.gson.JsonObject;
import com.sun.org.apache.regexp.internal.RE;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

public class RegressionTestSuits extends RestServices {
    Response response = null;

    @Test
    public void getUserTest() {
        Response response = given()
                .when()
                .get("http://ec2-52-14-141-208.us-east-2.compute.amazonaws.com:9089/register");
        List<Integer> ids = response.then().extract().path("id");
        System.out.println(ids);
        //Hamcreset style
        assertThat(ids, hasItem(8));
        //restassured
        response.then().body("id", hasItem(8));
    }


    @Test

    public void userRegisterTest() {


        JsonObject payload = new JsonObject();
        System.out.println(payload);
        payload.addProperty("username", "nobin4235");
        payload.addProperty("passwordConfirmation", "nobin41");
        payload.addProperty("password", "nobin41");

        response = postService(payload, "http://ec2-52-14-141-208.us-east-2.compute.amazonaws.com:9089/register");
        response.prettyPrint();

        int id = response.then().extract().path("id");
         response.then().body("message", is(equalToIgnoringCase("successful"))).statusCode(200);
//delete user
        response = deleteByIdServices("http://ec2-52-14-141-208.us-east-2.compute.amazonaws.com:9089/register/", id);
        response.then().body("message", is(equalToIgnoringCase("User has been removed "))).statusCode(200);
    }

@BeforeClass
       public static void setBaseURI(){ RestAssured.baseURI ="http://ec2-52-14-141-208.us-east-2.compute.amazonaws.com:9089";}




   public String  getAccessToken(String username, String password) {
        Response response = given().auth().basic("my-trusted-client", "secret")
                .queryParam("grant_type", "password")
                .queryParam("username", username)
                .queryParam("password", password)
                .when().post("/oauth/token");
      response.then().statusCode(200);
       response.prettyPrint();

   return response.then().extract().path("access_token").toString();

}
    //  http://ec2-52-14-141-208.us-east-2.compute.amazonaws.com:9089/oauth/token?grant_type=password&username=admin&password=admin
  /*  public String blotT(){
        String token = getTok("");
        JsonObject payload = new JsonObject();
        payload.addProperty("BODY", "welcome");
        payload.addProperty("title", "blog");
        Response response = given().contentType(ContentType.JSON).auth().

    }*/

    @Test
    public void blogTest(){

        String token = getAccessToken("admin", "admin");
        JsonObject payload = new JsonObject();
        payload.addProperty("body", "welcome to api world-NOBIN");
        payload.addProperty("title", "NOBIN API automation");

        Response response = given().contentType(ContentType.JSON).log().all()
                .auth().basic("my-trusted-client", "secret")
              .queryParam("access_token", token)
                .when().body(payload)
                .post("post");

        response.prettyPrint();
        response.then().body("message", is(equalToIgnoringCase
                ("Post was published"))).statusCode(200);


    }

@Test

public void postblogregister(){
        JsonObject payload = new JsonObject();
    payload.addProperty("username", "nobink12345");
    payload.addProperty("passwordConfirmation", "nobin41");
    payload.addProperty("password", "nobin41");
        response = given().contentType(ContentType.JSON).body(payload).
                        when().
                post("http://ec2-52-14-141-208.us-east-2.compute.amazonaws.com:9089/register");
        response.prettyPrint();
        response= given().contentType(ContentType.JSON).delete("http://ec2-52-14-141-208.us-east-2.compute.amazonaws.com:9089/register/90");
        response.prettyPrint();

}
@Test
public void getusrtok(){
        response=given().contentType(ContentType.JSON).
auth().basic("my-trusted-client", "secret").
                queryParam("grant_type", "password")
                .queryParam("username","admin")
                .queryParam("password","admin")
                        .post("http://ec2-52-14-141-208.us-east-2.compute.amazonaws.com:9089/oauth/token");
response.prettyPrint();

}










}























