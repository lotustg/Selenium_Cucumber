Feature: US004 Parametre Kullanimi
  Scenario: TC01 parametre kullanimi
    Given Kullanici "https://www.trendyol.com" sayfasinda gider
    Then kullanici 3 saniye bekler
    When Url'nin "trend" icerdigini test edin
    And sayfayi kapatir
