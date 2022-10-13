package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {
    public DataTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='New']")
    public WebElement newButton;

    @FindBy(xpath = "//input[@id=\"DTE_Field_first_name\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@class=\"btn\"]")
    public WebElement createButton;

    @FindBy(xpath = "//*[@type=\"search\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@class=\"sorting_1\"]")
    public  WebElement nameSection;
}
