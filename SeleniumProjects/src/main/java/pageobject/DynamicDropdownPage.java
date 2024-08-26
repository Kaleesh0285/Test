package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicDropdownPage {

    WebDriver driver;
    public DynamicDropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getValuesFromDropDown(String FromCity){
        driver.findElement(By.xpath("//input[@id='stationFrom']")).click();
        driver.findElement(By.xpath("//div[@id ='"+FromCity+"']")).click();


    }
    public void getValuesFromToDropDown(String ToCity){
        driver.findElement(By.name("To")).click();
        driver.findElement(By.xpath("//div[@class ='"+ToCity+"']")).click();


    }
}
