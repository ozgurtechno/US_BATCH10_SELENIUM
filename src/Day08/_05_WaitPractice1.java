package Day08;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _05_WaitPractice1 extends DriverClass {

    /**
     * Go to  "http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html"
     * Click on Timer Button
     * Verify that you see QTP text
     **/

    @Test
    public void waitPractice(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement timerButton = driver.findElement(By.cssSelector("button[onclick=\"timedText()\"]"));
        timerButton.click();

//        MyMethods.myWait(20);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.id("demo"),"QTP"));

        WebElement textElement = driver.findElement(By.id("demo"));
        System.out.println("textElement.getText() = " + textElement.getText());

        Assert.assertTrue(textElement.getText().equals("QTP"));

        waitAndQuit();
    }
}
