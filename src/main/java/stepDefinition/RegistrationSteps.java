package stepDefinition;

import Utility.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;

public class RegistrationSteps {

    WebDriver driver;
    @Given("User is on Mercury Tourist website")
    public void user_is_on_mercury_tourist_website() {
        driver = BrowserFactory.returnDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        // Write code here that turns the phrase above into concrete actions
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.provideContactDetails();

    }
    @Given("Provide the contact details")
    public void provide_the_contact_details() {
        // Write code here that turns the phrase above into concrete actions
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.provideContactDetails();

    }
    @Given("Provide mailing information")
    public void provide_mailing_information() {
        // Write code here that turns the phrase above into concrete actions
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.provideMailingDetails();

    }
    @Given("Provide user information")
    public void provide_user_information() {
        // Write code here that turns the phrase above into concrete actions
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.provideUserDetails();

    }
    @Then("Click on submit button")
    public void click_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickOnSubmit();

    }
}
