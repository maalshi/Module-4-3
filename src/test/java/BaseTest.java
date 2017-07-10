import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Maryia_Shynkarenka on 6/6/2017.
 */
public class BaseTest {

    protected WebDriver driver;


    @BeforeClass
    public WebDriver init() {
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        try {
            if(System.getProperty("browser").equals("firefox")) {
                driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.firefox());
            } else if(System.getProperty("browser").equals("chrome")){
                driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.chrome());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        return driver;
    }


    @AfterClass
    public void closeDriver(){
        driver.quit();
    }

}
