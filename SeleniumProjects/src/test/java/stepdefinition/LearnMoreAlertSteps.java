package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utility.TestContext;

public class LearnMoreAlertSteps {

    TestContext context;

    public LearnMoreAlertSteps(TestContext context){
        this.context = context;


    }


    @Given("user clicks the confirm box button")
    public void clicksConfirmBoxButton(){
        context.pageObjectManager.getAlertPage().clickConfirmButtonBox();

    }

    @When("user extract the confirm box text")
    public void userExtractTheConfirmBoxText() {
context.pageObjectManager.getAlertPage().getConfirmBoxText();

    }

    @And("user clicks on the Cancel button")
    public void userClicksOnTheCancelButton() {
context.pageObjectManager.getAlertPage().clickCancelButton();
    }

    @Then("user validtae the UI error message")
    public void userValidtaeTheUIErrorMessage() {
      String message =  context.pageObjectManager.getAlertPage().validteUiText();
        Assert.assertEquals("You Pressed Cancel",message);
    }


    @Given("user clickHearToChangeTextButton")
    public void userClickHearToChangeTextButton() {
        context.pageObjectManager.getExpicitWaitsPage().ClicksHereToChangeText();
    }

    @Then("Validate the text in learnMorePage")
    public void validateTheTextInLearnMorePage() {
      String val =   context.pageObjectManager.getExpicitWaitsPage().ValidateTheText();
    }
}
