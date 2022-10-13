Feature: Parametre Kullanimi
  Scenario: TC01 Parametre kullaniminda ve Config Reader kullanimi
    Given Kullanici "faceUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'nin "facebook" icerdigini test edin
    And sayfayi kapatir

  Scenario: TC02 Parametre kullaniminda ve Config Reader kullanimi
    Given Kullanici "google" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'nin "google" icerdigini test edin
    And sayfayi kapatir

  Scenario: TC03 Parametre kullaniminda ve Config Reader kullanimi
    Given Kullanici "brcUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'nin "blue" icerdigini test edin
    And sayfayi kapatir

  Scenario: TC03 Parametre kullaniminda ve Config Reader kullanimi
    Given Kullanici "amzUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'nin "amazon" icerdigini test edin
    And sayfayi kapatir

