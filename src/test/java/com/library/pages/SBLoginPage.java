package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SBLoginPage {
    //start locating our webelement related to login
    public SBLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="ctl00_MainContent_username")
    public WebElement usernameInput;
    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordInput;
    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;
    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;

}
