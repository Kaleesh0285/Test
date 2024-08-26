package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utility.TestContext;

public class DynamicDropdownSteps {

    TestContext context;

    public DynamicDropdownSteps(TestContext context){
        this.context = context;
    }


    @Given("user selects the option in from dropdown")
    public void SelectsOptionInFromDropDown(){
        context.pageObjectManager.getValuesFromDropDown().getValuesFromDropDown("LKO");

    }

    @When("user selects the option from to dropdown")
    public void userSelectsTheOptionFromToDropdown() {
        context.pageObjectManager.getValuesFromDropDown().getValuesFromToDropDown("CCU");
    }
}
