import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 6/22/2017.
 */
public class YandexDisk extends AbstractPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//a[@data-id='disk']")
    WebElement disk;

    @FindBy(xpath = "//a[@class='_nb-popup-close js-dialog-close']")
    WebElement closePopup;

    @FindBy(xpath = "//div[@id='nb-21']")
    WebElement picture;

    @FindBy(xpath = "//div[@id='nb-3']")
    WebElement bin;

    public YandexDisk(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void clickDisk(){
        wait.until(ExpectedConditions.elementToBeClickable(disk));
        disk.click();
    }

    public void closePopUp(){
        wait.until(ExpectedConditions.elementToBeClickable(closePopup));
        closePopup.click();
    }

    public void dragPicture(){
        wait.until(ExpectedConditions.elementToBeClickable(closePopup));

    }

    public void movePictureIntoBin(){
        wait.until(ExpectedConditions.elementToBeClickable(picture));
        super.dragAndDrop(picture, bin);
    }
}
