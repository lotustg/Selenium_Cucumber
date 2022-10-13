Feature: US006 Kullanici_amazonda_istedigi_kelimeleri_aratir

  Scenario Outline: TC01_kullanici_istedigi_kelimeleri_aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | selenium      | selenium             |
      | sql           | sql                  |
   # TestNG deki dataProvider kullanimindaki gibi Cucumberda da Scenario Outline kullaniriz.
# Bu şekilde birden fazla kelimeyi tek seferde aratabiliriz.
  #Feature dosyasinde yazdigimiz komutta eger " " kullanirsak stepDefinition da parametreli bir method
  # olusturur ve artik stepDefinitionu kullanmadan Feature dosyasinda " " icindeki stringi degistirerek
  #istedigimiz kelimeyi aratabiliriz. Scenario Outline da ise yine " " icinde birden fazla kelime aratacaksam
  #   "<>" seklindeki kullanim ile "<>" icine yazdigim herhangi bir kelimeyi   Scenario Outline nin asagida
  #olusturdugu Examples: altindea aratmak istedigim kelimeleri yazar ve sairasiyla aratabiliriz
