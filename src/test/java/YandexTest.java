import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/21/2017.
 */
public class YandexTest extends BaseTest {


    @Test
    public void search() {
        driver.get("https://yandex.by");
        Yandex yandex = new Yandex(driver);
        yandex.sendKeysLogin("maria1.tester");
        yandex.sendKeysPassword("Password1");
        yandex.clickSubmitButton();

        YandexDisk disk = new YandexDisk(driver);
        disk.clickDisk();
        disk.movePictureIntoBin();
    }

   // @Test(dependsOnMethods = { "search" }, alwaysRun = true)


}