package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookCartScenarioOutlinePage {

    WebDriver driver;

    public BookCartScenarioOutlinePage(WebDriver driver) {
        this.driver = driver;

    }


    public void userEntersUserNameAndPassword(){
        driver.findElement(By.id("mat-input-5")).sendKeys();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys();



    }

    public void userClicksTheLoginButton(){
        driver.findElement(By.xpath("//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']")).click();



    }


}
