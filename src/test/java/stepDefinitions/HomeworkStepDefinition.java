package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class HomeworkStepDefinition {
    @Given("hepsiburada ya gidiniz")
    public void hepsiburadaYaGidiniz() {
        Driver.getDriver().get("https://hepsiburada.com");
    }

    @Then("elektronik altında bilgisayar tablet altındaki tüm linkleri tıklayalım")
    public void elektronikAltındaBilgisayarTabletAltındakiTümLinkleriTıklayalım() {
    }

    @And("her linkten sonra o sayfaya gittigimizi test edelim ve o sayfanın resmini alalım")
    public void herLinktenSonraOSayfayaGittigimiziTestEdelimVeOSayfanınResminiAlalım() {
    }


}
