import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestServices {

    public Response postService(JsonObject jsonObject, String uri){

       return given().contentType(ContentType.JSON).body(jsonObject).post(uri);
    }


    public Response getService(String uri){return given().contentType("application/json").when().get(uri);}

    public Response getByIdService(String uri, int id){return given().contentType("application/json").when().get(uri+id);}

    public Response deleteByIdServices(String uri, int id){return given().contentType("application/json").when().delete(uri+id);}
}
