import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Maryia_Shynkarenka on 6/22/2017.
 */
public class YandexDisk extends AbstractPage {


    WebDriverWait wait;

    @FindBy(xpath = "//a[@data-id='disk']")
    WebElement disk;

    @FindBy(xpath = "//a[@class='_nb-popup-close js-dialog-close']")
    WebElement closePopup;

    @FindBy(xpath = "//a[contains(@href,'https://disk.yandex.by')]")
    WebElement openDisk;

    @FindBy(xpath = "//div[@class='ns-view-container-desc']//img[contains(@class,'resource')]")
    WebElement picture;

    @FindBy(xpath = "//div[@id='nb-3']")
    WebElement bin;

    @FindBy(xpath = "//button[contains(@data-click-action,'openFolder')]")
    WebElement buttonOpenBin;

    @FindBy(xpath = "//button[contains(@data-click-action,'resource.restore')]")
    WebElement buttonRestore;

    @FindBy(xpath = "//div[@class='item-details']//span[@class='item-details__content']")
    WebElement binSize;

    @FindBy(xpath = "//div[@class ='crumbs__path']//div[@class ='crumbs__item'][2]")
    WebElement diskReturn;

    public YandexDisk(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void clickDisk(){
        wait.until(ExpectedConditions.elementToBeClickable(disk));
        disk.click();
    }

    public void closePopUpWindow(){
        wait.until(ExpectedConditions.elementToBeClickable(closePopup));
        closePopup.click();
    }

    public void openTheDisk(){
        wait.until(ExpectedConditions.elementToBeClickable(openDisk));
        openDisk.click();
    }


    public void movePictureIntoBin(){
        super.dragAndDrop(picture, bin);
    }

    public void assertPictureDisappeared(){
        wait.until(ExpectedConditions.elementToBeClickable(picture));
        Assert.assertFalse(picture.isDisplayed());
    }

    public void clickBin(){
        wait.until(ExpectedConditions.elementToBeClickable(bin));
        bin.click();
    }

    public void clickOpenBinButton(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonOpenBin));
        buttonOpenBin.click();
    }

    public void assertPictureAppeared(){
        wait.until(ExpectedConditions.elementToBeClickable(picture));
        Assert.assertTrue(picture.isDisplayed());
    }

    public void clickPicture(){
        picture.click();
    }

    public void clickRestoreButton(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonRestore));
        buttonRestore.click();
    }

    public void assertBinIsEmpty(){
        Assert.assertEquals("0 байт", binSize);
    }

    public void returnToDisk(){
        wait.until(ExpectedConditions.elementToBeClickable(diskReturn));
        diskReturn.click();
    }
}
