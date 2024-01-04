package Day08;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_AlertsSendKeys extends DriverClass {

    @Test
    public void alertsSendKeysTest(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyMethods.myWait(2);

        WebElement clickForPromptBoxButton = driver.findElement(By.xpath("(//button[@class=\"btn btn-default btn-lg\"])[2]"));
        clickForPromptBoxButton.click();

        MyMethods.myWait(2);

        driver.switchTo().alert().sendKeys("Hello Batch 10!");

        MyMethods.myWait(2);

        driver.switchTo().alert().accept();

        waitAndQuit();
    }
}
