package starter;

import net.serenitybdd.annotations.Step;

public class MySteps {
    @Step("do it")
    public void doit() {
        System.out.println("doing it");
    }
    @Step("provoke a failure")
    public void fail() {
        throw new AssertionError("error in fail step");
    }
}
