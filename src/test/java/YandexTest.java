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
        disk.openTheDisk();
        disk.assertPictureAppeared();
        disk.movePictureIntoBin();
//        disk.assertPictureDisappeared();
        disk.clickBin();
        disk.clickOpenBinButton();
        disk.assertPictureAppeared();
        disk.clickRestoreButton();
        disk.assertBinIsEmpty();
        disk.returnToDisk();
        disk.assertPictureAppeared();
    }

   // @Test(dependsOnMethods = { "search" }, alwaysRun = true)


}