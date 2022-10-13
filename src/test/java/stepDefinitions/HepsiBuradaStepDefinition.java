package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class HepsiBuradaStepDefinition {
    @Given("Kullanici {string} sayfasinda gider")
    public void kullaniciSayfasindaGider(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }
}
