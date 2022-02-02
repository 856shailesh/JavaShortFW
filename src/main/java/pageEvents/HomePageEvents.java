package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;

public class HomePageEvents {

    public void clickOnSignInBtn(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPath", HomePageElements.signInBtn).click();
    }
}
