@All1
Feature: US007_Scenario_Outline

  Scenario Outline: TC01_ConfigReader_ile_Scenario_Outline_kullanimi
    Given Kullanici "<arananUrl>" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'nin "<arananKelime>" icerdigini test edin
    And sayfayi kapatir
    Examples:
      | arananUrl | arananKelime |
      | amzUrl    | amazon       |
      | faceUrl   | face         |
      | brcUrl    | blue         |
      | google    | google       |
