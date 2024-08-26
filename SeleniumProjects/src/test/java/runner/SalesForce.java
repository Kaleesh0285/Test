package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.awt.*;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/featurefile"},
        glue = {"stepdefinition"},
        plugin = {"pretty",
                "html:target/test.reference/report.html",
                "json:target/test.reference/report.json",
                "junit:target/test.reference/report.xml"},
        tags = "@BookCart"

)
public class SalesForce {

}