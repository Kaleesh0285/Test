package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;


public class salesforce {

    WebDriver driver;

    @Given("user navigates to salesforce login page")
    public void loginpage() {
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");

    }

    @And("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        driver.findElement(By.id("Login")).click();

    }

    @Then("user validate the error message")
    public void userValidateTheErrorMessage() {
    }

    @When("user enters username {string} and Password {string}")
    public void userEntersUsernameAndPassword(String arg0, String arg1) {
        driver.findElement(By.id("username")).sendKeys("Kaleeshwari");
        driver.findElement(By.id("password")).sendKeys("123");

    }
}
