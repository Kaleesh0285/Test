package pageobject;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExamplesPage {

    WebDriver driver;

    public TableExamplesPage(WebDriver driver) {
        this.driver = driver;

    }
    public void getFirstNameRow() {
       int FirstName = driver.findElements(By.xpath("//table[@id = 'footable_17874']/child::tbody/child::tr/child::td[1]")).size();
        for (int k = 0; k < FirstName; k++) {
          String name = driver.findElements(By.xpath("//table[@id = 'footable_17874']/child::tbody/child::tr/child::td[1]")).get(k).getText();
          System.out.println(name);
        }
    }

        public void getAgeValuesFromTable(){
            int AgeColumnSize = driver.findElements(By.xpath("//table[@id = 'footable_17874']/child::tbody/child::tr/child::td[5]")).size();
            for (int i = 0; i < AgeColumnSize; i++) {

                String Age = driver.findElements(By.xpath("//table[@id = 'footable_17874']/child::tbody/child::tr/child::td[5]")).get(i).getText();
                System.out.println(Age);
            }
        }

        public void getProductDetailsFromExcel(){

        }



    }
