package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
    static {//Her metoddan once calısır
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties= new Properties();
            properties.load(fis); //fis'in okuduğu bilgileri properties'e yükledi
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static String getProperty(String key){
          /*
        test metodundan yolladığımız String key değerini alıp properties clasından getProperty()
        medgodunu kullanarak bu key'e ait value'yu bize getirir.
         */
        return properties.getProperty(key);
    }


}
