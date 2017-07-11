package ui.CarHirePages;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.AbstractPage;

/**
 * Created by Maryia_Shynkarenka on 6/19/2017.
 */
public class CarHireSearch extends AbstractPage {

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
        waitElement(pickUpField);
        pickUpField.sendKeys(city);
    }

    public void clickSuggestion(){
        waitElement(suggestion);
        suggestion.click();
    }

    public void clickStartDate(){
        waitElement(startDate);
        startDate.click();
    }

    public void clickOutboiundDate(){
        waitElement(outboundDate);
        outboundDate.click();
    }

    public void clickEndDate(){
        waitElement(endDate);
        endDate.click();
    }

    public void clickInboundDate(){
        waitElement(inboundDate);
        inboundDate.click();
    }

    public void clickSearchButton(){
        waitElement(searchButton);
        searchButton.click();
    }
}
