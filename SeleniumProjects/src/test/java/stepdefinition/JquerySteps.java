package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utility.TestContext;

public class JquerySteps {

    TestContext context;

    public  JquerySteps(TestContext context){
        this.context = context;
     context.pageObjectManager.JqueryPage();
    }


    @Then("validate the text has been changed as dropped")
    public void validateTheDroppedText() {
       String text = context.pageObjectManager.JqueryPage().ValidateDroppedText();
        Assert.assertEquals("Dropped!",text);
    }

    @Given("user drag the box")
    public void userDragTheBox() {
        context.pageObjectManager.JqueryPage().DragAndDrop();
    }
}
