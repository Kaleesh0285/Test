package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class MyProject {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
        driver.findElement(By.name("username")).sendKeys("Kaleeshwari");
        driver.findElement(By.id("password")).sendKeys("Qwerty123");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();



        }




}
