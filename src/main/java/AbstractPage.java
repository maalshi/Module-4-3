import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

abstract class AbstractPage{

    WebDriver driver;

    public void dragAndDrop(WebElement toBeDragged, WebElement target){
        new Actions(driver).dragAndDrop(toBeDragged, target).build().perform();
    }
}

