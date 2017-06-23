package ui.CarHirePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 6/19/2017.
 */
public class CarHireSearch {

    WebDriver driver;
    WebDriverWait wait;


    @FindBy(id = "pickupLocation")
    WebElement pickUpField;

    @FindBy(id = "item-0-0")
    WebElement suggestion;

    @FindBy(id = "pickupDate")
    WebElement startDate;

    @FindBy(id = "day-2017622")
    WebElement outboundDate;

    @FindBy(id = "returnDate")
    WebElement endDate;

    @FindBy(id = "day-2017625")
    WebElement inboundDate;

    @FindBy(id = "searchCarsFormBtn-searchcars")
    WebElement searchButton;

    public CarHireSearch(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }



    public void sendKeysPickUpLocation(String city){
        wait.until(ExpectedConditions.elementToBeClickable(pickUpField));
        pickUpField.sendKeys(city);
    }

    public void clickSuggestion(){
        wait.until(ExpectedConditions.elementToBeClickable(suggestion));
        suggestion.click();
    }

    public void clickStartDate(){
        wait.until(ExpectedConditions.elementToBeClickable(startDate));
        startDate.click();
    }

    public void clickOutboiundDate(){
        wait.until(ExpectedConditions.elementToBeClickable(outboundDate));
        outboundDate.click();
    }

    public void clickEndDate(){
        wait.until(ExpectedConditions.elementToBeClickable(endDate));
        endDate.click();
    }

    public void clickInboundDate(){
        wait.until(ExpectedConditions.elementToBeClickable(inboundDate));
        inboundDate.click();
    }

    public void clickSearchButton(){
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }





}
