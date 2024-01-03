package Day08;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_AlertsDismiss extends DriverClass {

    @Test
    public void alertDismissTest(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyMethods.myWait(2);

        WebElement clickMeButton2 = driver.findElement(By.xpath("(//button[@class=\"btn btn-default btn-lg\"])[1]"));
        clickMeButton2.click();

        MyMethods.myWait(2);

        driver.switchTo().alert().dismiss();

        waitAndQuit();
    }
}
