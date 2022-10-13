package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//h1)[1]")
    public WebElement automationExercise;

    @FindBy(xpath = "//*[@href=\"/login\"]")
    public WebElement signInLogInButton;

    @FindBy(xpath = "(//*[@class=\"btn btn-success\"])[1]")
    public WebElement testCaseLink;

    @FindBy (xpath = "//*[text()='Test Cases']")
    public WebElement testCaseTitle;

}
