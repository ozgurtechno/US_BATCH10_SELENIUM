package Day07;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionsRightClick extends DriverClass {

    @Test
    public void rightClickActionTest(){

        driver.get("https://demoqa.com/buttons");

        MyMethods.myWait(2);

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);

        Action action = actions.contextClick(rightClickButton).build();
        action.perform();

        waitAndQuit();
    }
}
