package Day06;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_SelectClass extends DriverClass {

    /**
     * What is Select Class?
     * It is a Selenium class that lets us to handle select tags
     * We create a Select object and then we use this object to handle select elements
     **/

    @Test
    public void selectTest(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyMethods.myWait(2);

        WebElement discoverXYZ = driver.findElement(By.id("u_ydD_4588"));

        Select select = new Select(discoverXYZ);
        //select.selectByValue("Online Advertising");
        //select.selectByIndex(3);
        //select.selectByVisibleText("Referred by Existing Customer");

        int randomSelectIndex = (int)(Math.random()*6); // Math.random() -> 0 - 0.9999999...
        // Math.random()*6 --> 0 - 5.999999999...
        // (int)(Math.random()*6) 0 - 5

        select.selectByIndex(randomSelectIndex);

        List<WebElement> options = select.getOptions();
        
        for (WebElement option: options){
            System.out.println("option.getText() = " + option.getText());
            System.out.println("option.getAttribute(\"value\") = " + option.getAttribute("value"));
        }

        waitAndQuit();
    }
}
