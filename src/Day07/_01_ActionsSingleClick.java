package Day07;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionsSingleClick extends DriverClass {

    @Test
    public void singleClickActionTest(){

        driver.get("https://demoqa.com/buttons");

        MyMethods.myWait(2);

        WebElement singleClickButton = driver.findElement(By.xpath("//button[text()=\"Click Me\"]"));

        Actions actions = new Actions(driver);

        Action action = actions.click(singleClickButton).build(); // Selenium prepares the action for us and waits for performing it
        action.perform(); // Performs the action

//        actions.click(singleClickButton).build().perform(); Sometimes this doesn't work.

        waitAndQuit();
    }

}
