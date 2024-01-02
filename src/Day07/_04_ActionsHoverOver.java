package Day07;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsHoverOver extends DriverClass {

    /**
     * Go to "https://www.ebay.com/"
     * Hover over Electronics menu
     * Click on Headphones
     * Assert that the url contains Headphones keyword
     **/

    @Test
    public void hoverOverActionTest(){

        driver.get("https://www.ebay.com/");

        MyMethods.myWait(2);

        WebElement electronics = driver.findElement(By.linkText("Electronics"));

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(electronics).build();
        action.perform();

        WebElement headphones = driver.findElement(By.linkText("Headphones"));
        headphones.click();

        String url = driver.getCurrentUrl();

        Assert.assertTrue(url.contains("Headphones"));

        waitAndQuit();
    }
}
