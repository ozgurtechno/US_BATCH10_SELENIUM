package Day07;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionsDragAndDrop extends DriverClass {

    @Test
    public void dragAndDropActionTest(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        MyMethods.myWait(2);

        WebElement washington = driver.findElement(By.id("box3"));
        WebElement usa = driver.findElement(By.id("box103"));

        Actions actions = new Actions(driver);

        Action action = actions.dragAndDrop(washington,usa).build();
        action.perform();

        MyMethods.myWait(2);

        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement denmark = driver.findElement(By.id("box104"));

        Action action1 = actions.moveToElement(copenhagen).clickAndHold().moveToElement(denmark).release().build();
        // Does the same action but follows the same steps as a human
        action1.perform();

        MyMethods.myWait(2);

        String backgroundColorOfCopenhagen = copenhagen.getCssValue("background-color"); // Gives any styling property of an element
        System.out.println("backgroundColorOfCopenhagen = " + backgroundColorOfCopenhagen);

        Assert.assertTrue(backgroundColorOfCopenhagen.equals("rgba(0, 255, 0, 1)"));

        waitAndQuit();
    }
}
