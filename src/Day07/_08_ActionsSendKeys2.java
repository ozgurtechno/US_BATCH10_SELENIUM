package Day07;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionsSendKeys2 extends DriverClass {

    @Test
    public void sendKeysActionTest(){
        driver.get("https://demoqa.com/auto-complete");

        MyMethods.myWait(2);

        WebElement singleColorName = driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions actions = new Actions(driver);

        Action action = actions.click(singleColorName).sendKeys("i").build();
        action.perform();

        MyMethods.myWait(2);

        action = actions.sendKeys(Keys.ARROW_DOWN).build();
        action.perform();

        MyMethods.myWait(2);

        action.perform();

        MyMethods.myWait(2);

        action = actions.sendKeys(Keys.ENTER).build();
        action.perform();

        waitAndQuit();
    }
}
