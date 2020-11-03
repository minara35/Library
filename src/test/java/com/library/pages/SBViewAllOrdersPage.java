package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SBViewAllOrdersPage {
    public SBViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrderLink;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[2]") // "//tr[2]/td[2]" will work also
    public WebElement newOrderCell;
}
