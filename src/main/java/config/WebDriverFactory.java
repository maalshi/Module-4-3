package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//Factory
public class WebDriverFactory {
    private WebDriver driver;
    public WebDriver getDriver(){

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        if(System.getProperty("browser").equals("firefox")) {
            driver = new FirefoxDriver(DesiredCapabilities.firefox());
        } else if(System.getProperty("browser").equals("chrome")){
            driver = new ChromeDriver(DesiredCapabilities.chrome());
        }
        return new FirefoxDriver();
    }
}
