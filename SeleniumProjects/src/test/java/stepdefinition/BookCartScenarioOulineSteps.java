package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.TestContext;

public class BookCartScenarioOulineSteps {

    TestContext context;

    public BookCartScenarioOulineSteps(TestContext context){
        this.context = context;

    }

    @Given("user enters the {string} and {string}")
    public void userEntersTheAnd(String arg0, String arg1, String arg2, String arg3) {
        context.pageObjectManager.getBookCartSceabrioOutlinePage().userEntersUserNameAndPassword();

    }

    @When("user clicks the login button")
    public void userClicksTheLoginButton() {
        context.pageObjectManager.getBookCartSceabrioOutlinePage().userClicksTheLoginButton();
    }

}
