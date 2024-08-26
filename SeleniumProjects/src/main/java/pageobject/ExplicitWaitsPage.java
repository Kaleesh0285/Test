package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitsPage {

   WebDriver driver;
    public ExplicitWaitsPage(WebDriver driver) {
        this.driver = driver;

    }

    public void ClicksHereToChangeText(){

        driver.findElement(By.id("quote")).click();

    }
    public String ValidateTheText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       return driver.findElement(By.xpath("//h3[text() = 'Hello, Learn More Aspirants']")).getText();


    }
}


