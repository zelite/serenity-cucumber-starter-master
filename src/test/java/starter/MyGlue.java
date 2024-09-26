package starter;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;

public class MyGlue {

  @Given("prepare something")
  public void prepare_something() {
    System.out.println("preparing something");
  }

  @When("do something")
  public void do_something() {
    System.out.println("do something");
  }

  @When("do something wrong")
  public void do_something_wrong() {
    throw new AssertionError("something went wrong");
  }
  @When("do something wronger")
  public void do_something_wrong(DataTable dataTable) {
    SerenityRest.given().when().get("https://orf.at/diegibtsned").then().statusCode(200);
  }
}
