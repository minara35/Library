package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryUsersPage {
    public LibraryUsersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@id='user_groups']")
    public WebElement dropDownGroup;

    @FindBy(xpath = "//select[@id='user_status']")
    public WebElement dropDownActive;

    @FindBy(xpath = "//tr[1]/td[6]")
    public WebElement allViewStatus;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//tr[1]/td[3]")
    public WebElement fullName;


}
