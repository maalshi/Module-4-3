import config.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import static config.WebDriverSingleton.getWebDriverInstance;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public WebDriver init() {
        /*
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        try {
            if(System.getProperty("browser").equals("firefox")) {
                driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.firefox());
            } else if(System.getProperty("browser").equals("chrome")){
                driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.chrome());
            }
            else if(System.getProperty("browser").equals(null)){
                driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.firefox());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new FirefoxDriver();*/


        driver = WebDriverSingleton.getWebDriverInstance();
        driver.manage().window().maximize();
        return driver;
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }
}
