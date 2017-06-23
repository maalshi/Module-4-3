package ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AssertUtil {

    public static void assertListContainsElementWithSrc(String src, List<WebElement> webElements){
        for(WebElement picture: webElements){
            if(picture.getAttribute("src").equals(src))
                return;
        }
        Assert.fail("Element with src [" + src + "]\nis not present in the list");
    }

    public static void assertListNotContainElementWithSrc(String src, List<WebElement> webElements){
        for(WebElement picture: webElements){
            if(picture.getAttribute("src").equals(src))
                Assert.fail("Element with src [" + src + "]\nis present in the list");
        }
    }
}
