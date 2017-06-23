package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage{

    protected WebDriver driver;
//    protected WebDriverWait wait = new WebDriverWait(driver, 20);

    public void dragAndDrop(WebElement toBeDragged, WebElement target){
        new Actions(driver).dragAndDrop(toBeDragged, target).build().perform();
    }

    public void jsClick(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }
    public void waitHighlightAndClickElement(By locator){
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.backgroundColor='red'", driver.findElement(locator));
    }

    public void waitHighlightAndClickElement(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.backgroundColor='red'", element);
    }
}

