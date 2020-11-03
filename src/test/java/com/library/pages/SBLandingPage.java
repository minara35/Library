package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SBLandingPage {
    public SBLandingPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(linkText = "Order")
    public WebElement orderLink;
}
