import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Maryia_Shynkarenka on 6/6/2017.
 */
public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void initDriver(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maryia_Shynkarenka\\geckodriver-v0.16.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }

}
