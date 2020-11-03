package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLandingPage {
    public LibraryLandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //I click the "Users" module
    @FindBy(linkText = "Users")
    public WebElement userModule;

    //I click the "Books" module
    @FindBy(linkText = "Books")
    public WebElement booksModule;



}
