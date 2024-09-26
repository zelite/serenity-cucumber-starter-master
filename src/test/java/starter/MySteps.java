package starter;

import net.serenitybdd.annotations.Step;

public class MySteps {
    @Step
    public void fail() {
        throw new AssertionError("error in fail step");
    }
}
