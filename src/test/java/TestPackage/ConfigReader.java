package TestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private Properties config = null;
    public ConfigReader(String filename) {
        try (InputStream input = new FileInputStream(filename)){
            Properties prop = new Properties();
            prop.load(input);
            this.config = prop;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected String getValue(String key) {
        if (this.config != null){
            String value = this.config.getProperty(key);
            if (value != null){
                return value;
            }
        }
        return System.getenv(key);
    }
}
