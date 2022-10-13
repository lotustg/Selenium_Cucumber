package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.Driver;


public class AutoExerStepDeniniton05 {

    AutomationExercisePage automatinonExercisePage = new AutomationExercisePage();

    @Given("Navigate to url http:automationexercise.com")
    public void navigateToUrlHttpAutomationexerciseCom() {
        Driver.getDriver().get("http://automationexercise.com");
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(automatinonExercisePage.automationExercise.isDisplayed());

    }

    @And("Click on {string} button")
    public void clickOnSignupLoginButton() {
        automatinonExercisePage.signInLogInButton.click();
    }

    @And("Verify {string} is visible")
    public void verifyNewUserSignupIsVisible() {
    }

    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
    }

    @And("Click {string} button")
    public void clickSignupButton() {
    }

    @And("Verify error {string} is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
    }


}
