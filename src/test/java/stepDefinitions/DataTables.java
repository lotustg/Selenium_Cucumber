package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTables {
    DataTablesPage dataTablesPage=new DataTablesPage();
    Actions actions=new Actions(Driver.getDriver());

    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String home) {
        Driver.getDriver().get(ConfigReader.getProperty(home));
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablesPage.newButton.click();
    }

    @And("firstname kismina {string} girer")
    public void firstnameKisminaGirer(String firstName) {
        dataTablesPage.firstName.sendKeys(firstName);
    }

    @And("lastname kismina{string} girer")
    public void lastnameKisminaGirer(String lastName) {
        actions.sendKeys(Keys.TAB).sendKeys(lastName).perform();

    }

    @And("position kismina{string} girer")
    public void positionKisminaGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("ofisbilgisi kismina{string} girer")
    public void ofisbilgisiKisminaGirer(String ofis) {
        actions.sendKeys(Keys.TAB).sendKeys(ofis).perform();
    }

    @And("extension kismina{string} girer")
    public void extensionKisminaGirer(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("date kismina{string}  girer")
    public void dateKisminaGirer(String date) {
        actions.sendKeys(Keys.TAB).sendKeys(date).perform();
    }

    @And("salary kismina{string} girer")
    public void salaryKisminaGirer(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTablesPage.createButton.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataTablesPage.searchButton.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertTrue(dataTablesPage.nameSection.getText().contains(firstName));
    }
}
