package com.library.step_definitions;

import com.library.pages.SBLandingPage;
import com.library.pages.SBLoginPage;
import com.library.pages.SBOrderPage;
import com.library.pages.SBViewAllOrdersPage;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SBOrderStepDefinitions {
    SBLandingPage sbLandingPage = new SBLandingPage();
    SBLoginPage sbLoginPage = new SBLoginPage();
    SBOrderPage sbOrderPage = new SBOrderPage();
    SBViewAllOrdersPage sbViewAllOrdersPage = new SBViewAllOrdersPage();

    @Given("User is logged ito SmartBear Tester account and on Order page")
    public void user_is_logged_ito_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        sbLoginPage.usernameInput.sendKeys("Tester");
        sbLoginPage.passwordInput.sendKeys("test");
        sbLoginPage.loginButton.click();
        sbLandingPage.orderLink.click();

    }




    @Given("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String dropdownValue) {
        Select productDropDown = new Select(sbOrderPage.productDropDown);
        productDropDown.selectByVisibleText(dropdownValue);


    }
    @Given("User enters {string} to quantity input box")
    public void user_enters_to_quantity_input_box(String givenQuantity) {
        sbOrderPage.quantity.sendKeys(Keys.BACK_SPACE + givenQuantity);


    }
    @Given("User enters {string} to customer name input box")
    public void user_enters_to_customer_name_input_box(String givenCustomerName) {
        sbOrderPage.customerName.sendKeys(givenCustomerName);

    }
    @Given("User enters {string} to street input box")
    public void user_enters_to_street_input_box(String givenStreet) {
        sbOrderPage.street.sendKeys(givenStreet);

    }
    @Given("User enters {string} to city input box")
    public void user_enters_to_city_input_box(String givenCity) {
        sbOrderPage.city.sendKeys(givenCity);

    }
    @Given("User enters {string} to zip input box")
    public void user_enters_to_zip_input_box(String givenZip) {
        sbOrderPage.zip.sendKeys(givenZip);

    }
    @Given("User selects {string} as card type from radio buttons")
    public void user_selects_as_card_type_from_radio_buttons(String givenGardType) {
        if(givenGardType.equalsIgnoreCase("visa")){
            sbOrderPage.visaCard.click();
        }else if(givenGardType.equalsIgnoreCase("MasterCard")){
            sbOrderPage.masterCard.click();
        }else if(givenGardType.equalsIgnoreCase("American Express")){
            sbOrderPage.americanExpressCard.click();

        }else{
            Assert.assertTrue("INVALID CARD TYPE!", false);
        }


    }
    @Given("User enters {string} to card number input box")
    public void user_enters_to_card_number_input_box(String givenCardNum) {
        sbOrderPage.cardNumber.sendKeys(givenCardNum);

    }
    @Given("User enters {string} to expiration date input box")
    public void user_enters_to_expiration_date_input_box(String givenExpirationDate) {
        sbOrderPage.expirationDate.sendKeys(givenExpirationDate);

    }
    @Given("User clicks process button")
    public void user_clicks_process_button() {
        sbOrderPage.processButton.click();

    }
    @Then("User verifies {string} is in the table")
    public void user_verifies_is_in_the_table(String givenName) throws InterruptedException {
        sbViewAllOrdersPage.viewAllOrderLink.click();
        Thread.sleep(5000);
        String actualName = sbViewAllOrdersPage.newOrderCell.getText();
       Assert.assertTrue("Names are not matching!!!", actualName.equals(givenName));



    }

    @And("User enters {string} to state input box")
    public void userEntersToStateInputBox(String givenState) {
        sbOrderPage.state.sendKeys(givenState);

    }
}
