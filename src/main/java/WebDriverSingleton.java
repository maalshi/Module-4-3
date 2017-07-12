import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverSingleton {
    public static Webdriver driver;

    private WebDriverSingleton(){
    }

    public static WebDriver getWebDriverInstance(){
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver","D:\\webdrivers\\browsers\\chromedriver.exe" );
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            driver = new RemoteWebDriver(capabilities);
        }
        return driver;
    }

}