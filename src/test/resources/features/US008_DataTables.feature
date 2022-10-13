Feature:Class Calismasi

  Scenario Outline:
    When kullanici "dataHomePage" adresine gider
    Then  new butonuna basar
    And kullanici 1 saniye bekler
    And firstname kismina "<firstname>" girer
    And kullanici 1 saniye bekler
    And lastname kismina"<lastname>" girer
    And position kismina"<positiongirer>" girer
    And ofisbilgisi kismina"<ofisbilgisi>" girer
    And extension kismina"<extension>" girer
    And date kismina"<Startdate>"  girer
    And salary kismina"<Salary>" girer
    And Create tusuna basar
    And kullanici 1 saniye bekler
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular
    Examples:
      | firstname | lastname | positiongirer | ofisbilgisi | extension | Startdate  | Salary | firstname |
      | Ali       | Cay      | qa            | nnnn        | ads       | 2022-10-12 | 1000   | Ali       |
      | Veli      | Bal      | qa            | nnnn        | asd       | 2022-10-12 | 2000   | Veli      |
      | Jhon      | Lash     | qa            | nmf         | acd       | 2022-10-12 | 2500   | Jhon      |
      | Marry     | Me       | boss          | gfhfgh      | cda       | 2022-10-12 | 5000   | Marry     |
      | Clark     | Las      | worker        | fghfgh      | wwe       | 2022-10-12 | 2300   | Clark     |

    #5 farkli kullanici bilgisi girer