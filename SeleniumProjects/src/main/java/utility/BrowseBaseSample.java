package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowseBaseSample {

   public WebDriver driver;

    public WebDriver getDriver() throws IOException {

    Properties properties = new Properties();
    File file = new File("src/main/resources/configuration/FrameworkConfiguration.properties");
    FileInputStream inputStream = new FileInputStream(file);
    properties.load(inputStream);

    if (properties.getProperty("browser").equals("chrome")) {
         driver = new ChromeDriver();
    }
    else if (properties.getProperty("browser").equals("edge")){
        driver = new EdgeDriver();
    } else if (properties.getProperty("browser").equals("Safari")){
        driver = new SafariDriver();
    }
    else{
        System.out.println("enter a correct browser name ");
    }



        driver.get(properties.getProperty("testenvironment"));
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // driver.close();
        return driver;
    }



}

