package Day07;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionsSendKeys1 extends DriverClass {

    @Test
    public void sendKeysActionTest(){
        driver.get("https://demoqa.com/auto-complete");

        MyMethods.myWait(2);

        WebElement singleColorName = driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions actions = new Actions(driver);

        Action action = actions.click(singleColorName).keyDown(Keys.SHIFT)
                .sendKeys("g").keyUp(Keys.SHIFT).sendKeys("reen").build();

        // sendKeys() --> press the button and release it like regular typing
        // keyDown() --> press the button and hold it until keyUp() action is performed

        action.perform();

        MyMethods.myWait(2);

        actions.sendKeys(Keys.ENTER).build().perform();

        waitAndQuit();
    }
}
