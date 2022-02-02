package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

public class HomePageEvents {

    public void clickOnSignInBtn(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Clicking on signin Button");
        elementFetch.getWebElement("XPATH", HomePageElements.signInBtn).click();
    }
}
