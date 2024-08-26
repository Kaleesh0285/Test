package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.BrowseBaseSample;
import utility.TestContext;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

public class AmazonSample {


        WebElement element;
        BrowseBaseSample BrowserBase;
        WebDriver driver;

        TestContext context;
        public AmazonSample(TestContext context) throws FileNotFoundException {
            this.context = context;

            BrowserBase = new BrowseBaseSample();



    }

    @When("extract the dropdown value")
    public void extractTheDropdownValue() throws IOException {
           driver= BrowserBase.getDriver();
            element = driver.findElement(By.id("searchDropdownBox"));
         int dropdownsize = element.findElements(By.tagName("option")).size();

            for (int i=0;i<dropdownsize;i++){
               String value = element.findElements(By.tagName("option")).get(i).getText();
                System.out.println(value);

            }

    }

    @And("user clicks the dropdown values")
    public void userClicksTheDropdownValues() {
      driver.findElement(By.id("searchDropdownBox")).click();
       Select Dropdown = new Select(element);
        Dropdown.selectByIndex(5);


    }



    @And("the user clicks the BabyWishList option")
    public void theUserClicksTheBabyWishListOption() {
        driver.findElement(By.id(""));
        Actions action = new Actions(driver);
        action.clickAndHold(element).build().perform();



    }

    @Given("user enters the product name from excel")
    public void userEntersTheProductNameFromExcel() throws IOException {
            context.pageObjectManager.getProductDetails().getProductDetailsFromExcel();
    }
}

