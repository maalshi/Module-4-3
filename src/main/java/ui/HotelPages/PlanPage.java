package ui.HotelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Maryia_Shynkarenka on 6/14/2017.
 */
public class PlanPage {

    WebDriver driver;
    WebDriverWait wait;

    By textBookFlights = By.xpath("//div[contains(@class,'page-header')]//h2");//By.className("h2-lrg centered ng-binding");

    public PlanPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void assertTextBookFlights(){
        wait.until(ExpectedConditions.elementToBeClickable(textBookFlights));
        Assert.assertEquals("Book Flights", driver.findElement(textBookFlights).getText());

    }

}
