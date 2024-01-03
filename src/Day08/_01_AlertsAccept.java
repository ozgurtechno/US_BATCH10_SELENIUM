package Day08;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_AlertsAccept extends DriverClass {

    @Test
    public void alertAcceptTest(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyMethods.myWait(2);

        WebElement clickMeButton1 = driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]"));
        clickMeButton1.click();

        MyMethods.myWait(2);

        driver.switchTo().alert().accept();

        waitAndQuit();
    }
}
