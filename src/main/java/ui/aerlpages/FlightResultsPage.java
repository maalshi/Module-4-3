package ui.aerlpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Maryia_Shynkarenka on 6/9/2017.
 */
public class FlightResultsPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//button[@data-test-id='test_continue_btn']")
    WebElement continueButton;

    @FindBy(xpath = "//div[contains(@data-test-id,'first')]//div[contains(@class,'flight-results')]//span")
    WebElement outboundFlight;

    @FindBy(xpath = "//div[contains(@data-test-id,'second')]//div[contains(@class,'flight-results')]//span")
    WebElement inboundFlight;


    public FlightResultsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }
    public void clickContinue(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    public void assertOutboundFlight(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        Assert.assertEquals("Dublin to Paris", outboundFlight.getText());
    }

    public void assertInboundFlight(){
        Assert.assertEquals("Paris to Dublin", inboundFlight.getText());
    }

}
