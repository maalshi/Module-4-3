package ui.aerlpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.AbstractPage;


/**
 * Created by Maryia_Shynkarenka on 6/7/2017.
 */
public class Homepage extends AbstractPage {

    WebDriverWait wait;

    By origin = By.xpath("//*[@id='origin']/div");
    By suggestion = By.xpath("//li[contains(@id,'typeahead')]");
    By destination = By.xpath("//*[@id='dest']/div");
    By findFlightButton = By.xpath("//button[@data-test-id='test_booker_search']");


    By tabHotel = By.xpath("//*[contains(@id,'partner-tab') and contains(.,'HOTELS')]");
    By buttonViewHotels = By.id("hotel-link-1");

    By tabCarHire = By.xpath("//*[contains(@id,'partner-tab') and contains(.,'CAR')]");
    By buttonMoreInfo = By.id("car-rental-link-1");



    public Homepage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void clickOrigin(){
        super.waitElement((WebElement) origin);
        driver.findElement(origin).click();
    }

    public void clearOrigin(){
        driver.findElement(origin).clear();
    }

    public void sendKeysOrigin(String originCity){
        driver.findElement(origin).sendKeys(originCity);
    }

    public void clickOriginSuggestion(){
        driver.findElement(suggestion).click();
    }

    public void clickDestination(){
        driver.findElement(destination).click();
    }

    public void sendKeysDestination(String destinationCity){
        driver.findElement(destination).sendKeys(destinationCity);
    }

    public void clickDestinationSuggestion(){
        driver.findElement(suggestion).click();
    }

    public void clickFindFlightButton(){
        wait.until(ExpectedConditions.elementToBeClickable(findFlightButton));
        super.waitHighlightAndClickElement(findFlightButton);
        driver.findElement(findFlightButton).click();

    }


    public void clickTabHotel(){
        wait.until(ExpectedConditions.elementToBeClickable(tabHotel));
        driver.findElement(tabHotel).click();

    }

    public void clickButtonViewHotels(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonViewHotels));
        driver.findElement(buttonViewHotels).click();

    }


    public void clickTabCarHire(){
        wait.until(ExpectedConditions.elementToBeClickable(tabCarHire));
        driver.findElement(tabCarHire).click();

    }

    public void clickButtonMoreInfo(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonMoreInfo));
        driver.findElement(buttonMoreInfo).click();

    }

}
