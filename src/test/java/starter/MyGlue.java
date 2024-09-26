package starter;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class MyGlue {

  @Steps
  MySteps mysteps;

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
  public void do_something_wronger(DataTable dataTable) {
    SerenityRest.given().when().get("https://orf.at/diegibtsned").then().statusCode(200);
  }

  @When("do something wrong ensure")
  public void do_something_wrong_ensure(DataTable dataTable) {
    Actor actor = Actor.named("Alice").whoCan(CallAnApi.at("http://www.example.com"));
    sendRequest(actor);
    actor.should(seeThatResponse("message", response -> response.statusCode(500)));
  }

  private <T extends Actor> void sendRequest(T actor) {
    actor.attemptsTo(Get.resource("/"));
  }

  @When("do something wrong step")
  public void doSomethingWrongStep(DataTable dataTable) {
    mysteps.doit();
    mysteps.fail();
  }
}
