package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07steps {
    AutomationExercisePage automationExercisePage= new AutomationExercisePage();

    @Given("Tarayıcıyı başlatarak {string} url'sine gidin")
    public void tarayıcıyı_başlatarak_url_sine_gidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }
    @Then("Ana sayfanın başarıyla görünür olduğunu doğrulayın")
    public void ana_sayfanın_başarıyla_görünür_olduğunu_doğrulayın() {
        String homeUrl="https://automationexercise.com/";
        Assert.assertEquals("home url esit degil", Driver.getDriver().getCurrentUrl(),homeUrl);

    }
    @Then("Test Case buttonu na tıklayın")
    public void test_case_buttonu_na_tıklayın() {
automationExercisePage.testCaseLink.click();
    }
    @Then("Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın")
    public void kullanıcının_test_case_sayfasına_başarıyla_yönlendirildiğini_doğrulayın() {
        Assert.assertTrue(automationExercisePage.testCaseTitle.isDisplayed());

    }
    @Then("İlgili sayfanın ekran görüntüsünü alın")
    public void ilgili_sayfanın_ekran_görüntüsünü_alın() {
        try {
            ReusableMethods.getScreenshot("TestCasePage");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
