package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnMoreAlertPage {

    WebDriver driver;

    public LearnMoreAlertPage(WebDriver driver){
        this.driver= driver;

    }

    public void clickConfirmButtonBox(){
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

    }
    public String getConfirmBoxText(){
        String confirm = driver.switchTo().alert().getText();
        return confirm;

    }
    public void clickCancelButton(){
        driver.switchTo().alert().dismiss();

    }
    public String validteUiText(){
     String Uitext =  driver.findElement(By.xpath("//p[text()='You Pressed Cancel']")).getText();
     return Uitext;

    }
}
