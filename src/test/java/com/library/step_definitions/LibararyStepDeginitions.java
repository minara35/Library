package com.library.step_definitions;

import com.library.pages.LibraryLandingPage;
import com.library.pages.LibraryLoginPage;
import com.library.pages.LibraryUsersPage;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class LibararyStepDeginitions {

    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
    LibraryLandingPage libraryLandingPage = new LibraryLandingPage();
    LibraryUsersPage libraryUsersPage = new LibraryUsersPage();



    @Given("User is logged into  Library account and on User page")
    public void user_is_logged_into_library_account_and_on_user_page() throws InterruptedException {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        libraryLoginPage.userName.sendKeys("librarian47@library");
        libraryLoginPage.password.sendKeys("rJEIrUIt");
        libraryLoginPage.submitButton.click();
        Thread.sleep(4000);

        libraryLandingPage.userModule.click();
    }

    @Given("User selects {string} from User Group dropdown")
    public void user_selects_from_user_group_dropdown(String dropdownValue) {
        Select groupDropDown = new Select(libraryUsersPage.dropDownGroup);
        groupDropDown.selectByVisibleText(dropdownValue);



    }
    @Given("User selects {string} from Status dropdown")
    public void user_selects_from_status_dropdown(String dropdownValue) {
        Select activeDropDown = new Select(libraryUsersPage.dropDownActive);
        activeDropDown.selectByVisibleText(dropdownValue);

    }
    @Then("User verifies {string} is on the table")
    public void user_verifies_is_on_the_table(String string) throws InterruptedException {
        String actualName = libraryUsersPage.allViewStatus.getText();
        Thread.sleep(6000);
        Assert.assertTrue("Names are not matching!!!", actualName.equalsIgnoreCase(string));

    }


    @And("User enters {string} to search input box")
    public void userEntersToSearchInputBox(String enterName) {
            libraryUsersPage.searchBox.sendKeys(enterName);




    }

    @Then("User verifies {string} in the table")
    public void userVerifiesInTheTable(String givenName) {
        String actualName = libraryUsersPage.fullName.getText();
        Assert.assertTrue("Names are not matching!!!", actualName.equalsIgnoreCase(givenName));



    }
}
