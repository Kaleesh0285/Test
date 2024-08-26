package utility;

import org.openqa.selenium.WebDriver;
import pageobject.*;

public class PageObjectManager {

WebDriver driver ;



    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LearnMoreAlertPage getAlertPage(){

        LearnMoreAlertPage Alert = new LearnMoreAlertPage(driver);
        return Alert;

    }
    public JqueryPage JqueryPage(){
        JqueryPage jqueryPage = new JqueryPage(driver);
        return jqueryPage;
    }

    public TableExamplesPage getTableExamplesPage(){
        TableExamplesPage tableExamplesPage = new TableExamplesPage(driver);
        return tableExamplesPage;
    }
    public AmazonSearchPage getProductDetails(){
        AmazonSearchPage searchPage = new AmazonSearchPage(driver);
        return searchPage;
    }
    public DynamicDropdownPage getValuesFromDropDown(){
        DynamicDropdownPage dropdownPage = new DynamicDropdownPage(driver);
        return dropdownPage;

    }
    public ExplicitWaitsPage getExpicitWaitsPage(){
        ExplicitWaitsPage waits = new ExplicitWaitsPage(driver);
        return waits;
    }
    public BookCartScenarioOutlinePage getBookCartSceabrioOutlinePage(){
        BookCartScenarioOutlinePage scenarioOulinePage = new BookCartScenarioOutlinePage(driver);
        return scenarioOulinePage;
    }
}
