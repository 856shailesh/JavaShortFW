package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.java.BaseTest;

public class ElementFetch
{
    public WebElement getWebElement(String identifierType,String identifierValue){
        switch (identifierType){
            case "ID":
                return BaseTest.driver.findElement(By.id(identifierValue));

        }
    }
}
