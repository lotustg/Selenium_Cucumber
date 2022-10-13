package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcStepDefinition {
    BrcPage brcPage=new BrcPage();

    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String anaSayfa) {
        Driver.getDriver().get(ConfigReader.getProperty(anaSayfa));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.loginButton.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
    }


}
