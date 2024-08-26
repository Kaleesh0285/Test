package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSample {

    public static void main(String[] args) {

        WebDriver sample  = new ChromeDriver() ;
        sample.get("https://www.google.com/");
        sample.findElement(By.name("q")).sendKeys("Selenium");
        sample.findElement(By.xpath("//input [@type = 'submit']")).                                                                                                                                                                                                                                                                                 click();
        //sample.findElement(By.name("btnK")).click();


    }
}
