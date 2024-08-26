package utility;

import org.openqa.selenium.devtools.v85.page.Page;
import pageobject.LearnMoreAlertPage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestContext {

  public BrowseBaseSample browseBaseSample;
  public PageObjectManager pageObjectManager;

    public TestContext() throws IOException {

        browseBaseSample = new BrowseBaseSample();
        pageObjectManager = new PageObjectManager(browseBaseSample.getDriver());

    }




}
