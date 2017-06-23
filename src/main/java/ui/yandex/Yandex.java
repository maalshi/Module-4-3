package ui.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 6/21/2017.
 */
public class Yandex {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//input[@name='login']")
    WebElement login;

    @FindBy(xpath = "//input[@name='passwd']")
    WebElement password;

    @FindBy(xpath = "//input[@class='checkbox__control']")
    WebElement alienComputerCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonSubmit;



    public Yandex(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);

    }


    public void sendKeysLogin(String user_login){
        wait.until(ExpectedConditions.elementToBeClickable(login));
        login.sendKeys(user_login);
    }

    public void sendKeysPassword(String user_password){
        password.sendKeys(user_password);
    }

    public void clickSubmitButton(){
        buttonSubmit.click();
    }

}
