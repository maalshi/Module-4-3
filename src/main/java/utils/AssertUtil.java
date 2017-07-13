package utils;

import org.testng.Assert;

import java.util.List;

public class AssertUtil {

    public static void assertListContainsElementWithSrc(String src, List<String> list){
        for(String item: list){
            if(item.equals(src))
                return;
        }
        Assert.fail("String [" + src + "]\nis not present in the list");
    }

    public static void assertListNotContainElementWithSrc(String src, List<String> list){
        for(String item: list){
            if(item.equals(src))
                Assert.fail("String [" + src + "]\nis present in the list");
        }
    }

    //Decorator
    public static void assertEquals(String actual, String expected){
        System.out.println("Assert that actual [" + actual + "] equals expected [" + expected + "]");
        Assert.assertEquals(actual, expected);
    }

}
