package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utility.TestContext;

public class TableExamplesSteps {

    TestContext context;

    public TableExamplesSteps(TestContext context){
        this.context = context;

    }


    @Given("user extract the first name row from table")
    public void userExtractTheFirstNameRow() {
    context.pageObjectManager.getTableExamplesPage().getFirstNameRow();
    }

    @When("user extract the age of the user from the table")
    public void userExtractTheAge() {
        context.pageObjectManager.getTableExamplesPage().getAgeValuesFromTable();

    }


    @Given("get the list of names from the excel")
    public void getTheListOfNamesFromTheExcel() {
    }
}
