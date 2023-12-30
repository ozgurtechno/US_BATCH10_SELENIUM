package Day07;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionsDoubleClick extends DriverClass {

    @Test
    public void doubleClickActionTest(){

        driver.get("https://demoqa.com/buttons");

        MyMethods.myWait(2);

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);

        Action action = actions.doubleClick(doubleClickButton).build();
        action.perform();

        waitAndQuit();
    }
}
