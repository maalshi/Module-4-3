package ui.aerlpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Maryia_Shynkarenka on 6/13/2017.
 */
public class PassengerEssentialsPage {
    WebDriver driver;
    WebDriverWait wait;


    @FindBy(xpath = "//div[@id='test-left']//div[@class='relative ng-scope'][1]//div[contains(@class,'head-section')]//span[@class='ng-binding']")
    WebElement OutboundFlight;


    @FindBy(xpath = "//div[@id='test-left']//div[@class='relative ng-scope'][2]//div[contains(@class,'head-section')]//span[@class='ng-binding']")
    WebElement InboundFlight;



    public PassengerEssentialsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }

    public void assertOutboundFlight(String outbound){
        wait.until(ExpectedConditions.elementToBeClickable(OutboundFlight));
        Assert.assertEquals(outbound, OutboundFlight.getText());
    }

    public void assertInboundFlight(String inbound){
        wait.until(ExpectedConditions.elementToBeClickable(InboundFlight));
        Assert.assertEquals(inbound, InboundFlight.getText());
    }
}
