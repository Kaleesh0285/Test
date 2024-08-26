package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        driver.findElement(By.id("username")).sendKeys("Kaleeshwari");
        driver.findElement(By.id("password")).sendKeys("Qwerty123");
       driver.findElement(By.xpath("//button [text()='Login']")).click();




    }
}
