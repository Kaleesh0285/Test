package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ReadExamples;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AmazonSearchPage {
    WebDriver driver;

    public AmazonSearchPage(WebDriver driver){
        this.driver = driver;

    }

    public void getProductDetailsFromExcel() throws IOException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ReadExamples.getProductDetails("ListDetails",1,0));


    }
}
