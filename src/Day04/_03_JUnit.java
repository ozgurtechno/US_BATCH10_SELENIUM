package Day04;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_JUnit extends DriverClass {

    @Test
    public void test1(){

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyMethods.myWait(2);

        WebElement business = driver.findElement(By.cssSelector("input[value=\"Business\"]"));
        business.click();

        MyMethods.myWait(2);

        WebElement discoverXYZ = driver.findElement(By.cssSelector("div[id=\"section_1\"]>select[aria-required=\"true\"]"));
        discoverXYZ.click();

        MyMethods.myWait(2);

        WebElement onlineAdvertising = driver.findElement(By.cssSelector("div[id=\"section_1\"]>select[aria-required=\"true\"]>:nth-child(4)"));
        onlineAdvertising.click();

        MyMethods.myWait(2);

        WebElement howOften = driver.findElement(By.cssSelector("input[value=\"Every Day\"]"));
        howOften.click();

        MyMethods.myWait(2);

        WebElement yourExperience = driver.findElement(By.cssSelector("input[value=\"Good\"]"));
        yourExperience.click();

        MyMethods.myWait(2);

        WebElement howLong = driver.findElement(By.cssSelector("div[id=\"section_1\"]>select:nth-child(9)"));
        howLong.click();

        MyMethods.myWait(2);

        WebElement howLongOption = driver.findElement(By.cssSelector("div[id=\"section_1\"]>select:nth-child(9)>option:nth-child(3)"));
        howLongOption.click();

//        if (business.isSelected()){
//            System.out.println("Business option is selected");
//        }else {
//            System.out.println("Test is failed");
//        }

        Assert.assertTrue(business.isSelected()); // if isSelected method returns true test is successful otherwise it is failed

//        if (howOften.isSelected()){
//            System.out.println("Everyday option is selected");
//        }else {
//            System.out.println("Test is failed");
//        }

        Assert.assertTrue(howOften.isSelected());

//        if (yourExperience.isSelected()){
//            System.out.println("Good option is selected");
//        }else {
//            System.out.println("Test is failed");
//        }

        Assert.assertTrue(yourExperience.isSelected());

        waitAndQuit();
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running");
    }
}
