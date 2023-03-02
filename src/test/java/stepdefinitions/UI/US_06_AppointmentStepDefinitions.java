package stepdefinitions.UI;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.US_05_HomePage;
import pages.US_05_LoginPage;
import pages.US_06_AppointmentPage;
import pages.US_06_SearchPatientPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_06_AppointmentStepDefinitions {
    US_05_HomePage us_05_homePage = new US_05_HomePage();

    US_05_LoginPage us_05_loginPage=new US_05_LoginPage();
    US_06_AppointmentPage us_06_appointmentPage = new US_06_AppointmentPage();
    US_06_SearchPatientPage us_06_searchPatientPage = new US_06_SearchPatientPage();

    @When("user click on make an appointment button5")
    public void user_click_on_make_an_appointment_button() {
        ReusableMethods.waitFor(2);
        us_05_homePage.makeAppointmentButton.click();
    }
    @When("user enter firstname that contains any chars5")
    public void user_enter_firstname_that_contains_any_chars() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.firstNameInput.sendKeys(ConfigReader.getProperty("fNameWithAnyChars"));
    }
    @When("user enter  registered lastname5")
    public void user_enter_registered_lastname() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.lastNameInput.sendKeys(ConfigReader.getProperty("registeredLastname"));
    }
    @When("user enter registered SSN id5")
    public void user_enter_registered_ssn_id() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.ssnInput.sendKeys(ConfigReader.getProperty("registeredSsn"));
    }
    @When("user enter registered email address5")
    public void user_enter_registered_email_address() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.emailInput.sendKeys(ConfigReader.getProperty("registeredEmail"));
    }
    @When("user enter valid phone number5")
    public void user_enter_valid_phone_number() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.phoneInput.sendKeys(ConfigReader.getProperty("validPhoneNumber"));
    }
    @And("user click on Send and Appointment Request Button5")
    public void userClickOnSendAndAppointmentRequestButton() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.appointmentSubmitButton.click();
    }

    @Then("Verify Appointment registration saved message is displayed on the page5")
    public void verifyAppointmentRegistrationSavedMessageIsDisplayedOnThePage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_06_appointmentPage.appointmentSavedText.isDisplayed());
    }

    @When("user enter registered firstname5")
    public void userEnterRegisteredFirstname() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.firstNameInput.sendKeys(ConfigReader.getProperty("registeredFirstname"));
    }

    @And("user enter lastname that contains any chars5")
    public void userEnterLastnameThatContainsAnyChars() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.lastNameInput.sendKeys(ConfigReader.getProperty("lNameWithAnyChars"));
    }
    @Then("Verify your firstname is required message is pop up on the page5")
    public void verifyYourFirstnameIsRequiredMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_06_appointmentPage.firstNameBlankMessage.isDisplayed());
    }

    @Then("Verify your lastname is required message is pop up on the page5")
    public void verifyYourLastnameIsRequiredMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_06_appointmentPage.lastNameBlankMessage.isDisplayed());
    }

    @And("user enter different SSN id5")
    public void userEnterDifferentSSNId() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.ssnInput.sendKeys(ConfigReader.getProperty("differentSSN"));
    }

    @And("Verify Email is already in use message is displayed on the page5")
    public void verifyEmailIsAlreadyInUseMessageIsDisplayedOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_06_appointmentPage.differentSSNWarningMessage.isDisplayed());
    }

    @Then("Verify your SSN is required message is pop up on the page5")
    public void verifyYourSSNIsRequiredMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_06_appointmentPage.ssnBlankMessage.isDisplayed());
    }

    @Then("Verify your email is required message is pop up on the page5")
    public void verifyYourEmailIsRequiredMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_06_appointmentPage.emailBlankMessage.isDisplayed());
    }

    @And("user enter invalid email address5")
    public void userEnterInvalidEmailAddress() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.emailInput.sendKeys(ConfigReader.getProperty("invalidEmail"));
    }

    @And("Verify This field is invalid message is pop up on the page5")
    public void verifyThisFieldIsInvalidMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_06_appointmentPage.invalidEmailMessage.isDisplayed());
    }

    @And("user enter invalid phone number5")
    public void userEnterInvalidPhoneNumber() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.phoneInput.sendKeys(ConfigReader.getProperty("invalidPhoneNumber"));
    }

    @And("Verify Phone number is invalid message is pop up on the page5")
    public void verifyPhoneNumberIsInvalidMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_06_appointmentPage.invalidPhoneMessage.isDisplayed());
    }

    @Then("Verify Phone number is required message is pop up on the page5")
    public void verifyPhoneNumberIsRequiredMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_06_appointmentPage.phoneBlankMessage.isDisplayed());
    }
    @When("staff click on user icon optionYA")
    public void staff_click_on_user_icon_option_ya() {
        ReusableMethods.waitFor(2);
        us_05_homePage.userIcon.click();
    }
    @When("staff click on sign in optionYA")
    public void staff_click_on_sign_in_option_ya() {
        ReusableMethods.waitFor(2);
        us_05_homePage.signInOption.click();
    }
    @When("staff enter registered usernameYA")
    public void staff_enter_registered_username_ya() {
        ReusableMethods.waitFor(2);
        us_05_loginPage.userNameInput.sendKeys(ConfigReader.getProperty("staffUsername5"));
    }
    @When("staff enter registered passwordYA")
    public void staff_enter_registered_password_ya() {
        ReusableMethods.waitFor(2);
        us_05_loginPage.passwordInput.sendKeys(ConfigReader.getProperty("staffPassword5"));

    }
    @When("staff click on Sign in submit buttonYA")
    public void staff_click_on_sign_in_submit_button_ya() {
        ReusableMethods.waitFor(2);
        us_05_loginPage.signInSubmitButton.click();

    }
    @When("staff click on MY PAGES on menuYA")
    public void staff_click_on_my_pages_on_menu_ya() {
        ReusableMethods.waitFor(2);
        us_05_homePage.myPagesOption.click();

    }
    @When("staff click on Search Patient from dropdownYA")
    public void staff_click_on_search_patient_from_dropdown_ya() {
        ReusableMethods.waitFor(2);
        us_05_homePage.searchPatientOption.click();

    }
    @When("staff enter patient registered SSN in in the search boxYA")
    public void staff_enter_patient_registered_ssn_in_in_the_search_box_ya() {
        ReusableMethods.waitFor(2);
        us_06_searchPatientPage.ssnSearchBox.sendKeys(ConfigReader.getProperty("registeredSsn"));
        ReusableMethods.waitFor(3);


    }
    @Then("Verify patient information appears on the pageYA")
    public void verify_patient_information_appears_on_the_page_ya() {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(ConfigReader.getProperty("registeredSsn"),us_06_searchPatientPage.patientSsn.getText());
        Assert.assertEquals(ConfigReader.getProperty("registeredFirstname"),us_06_searchPatientPage.patientFirstName.getText());
        Assert.assertEquals(ConfigReader.getProperty("registeredLastname"),us_06_searchPatientPage.patientLastName.getText());

    }



}
