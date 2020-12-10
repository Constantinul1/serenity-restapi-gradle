package steps;

import io.restassured.response.Response;
import models.UserPost;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class SomeSteps {

  Response response;
  String stringValue;
  int intValue;

  @Step
  public void makeCall() {
    response = SerenityRest.given().get("https://jsonplaceholder.typicode.com/posts/1");
  }

  @Step
  public void verifyCall() {
    response.then().statusCode(200);

    // extract values from response
    stringValue = response.jsonPath().get("title");
    intValue = response.jsonPath().get("userId");

    //    System.out.println(intValue);
    //    System.out.println(stringValue);
    //    System.out.println("------");

    // map response to object
    UserPost userPost = response.jsonPath().getObject("", UserPost.class);

    //    System.out.println(userPost);
    //    System.out.println(userPost.getUserId());
    //    System.out.println(userPost.getTitle());

  }
}
