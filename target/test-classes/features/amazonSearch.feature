@All
Feature: Amazon Search

  Scenario: TC01 Kullanici amazon'da nutella aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella icin arama yapar
    And sonuclarin nutella icerdigini test eder


  Scenario: TC02 Kullanici amazon'da Selenium aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium icin arama yapar
    And sonuclarin Selenium icerdigini test eder

  @gp1
  Scenario: TC03 Kullanici amazon'da Selenium aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir

