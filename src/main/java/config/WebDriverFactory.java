package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Maryia_Shynkarenka on 7/13/2017.
 */
public class WebDriverFactory {
    public WebDriver getDriver(){
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        return new FirefoxDriver(capabilities);
    }
}
