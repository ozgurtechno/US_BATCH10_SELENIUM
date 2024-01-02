package Day07;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionsDragAndDropBy extends DriverClass {

    @Test
    public void dragAndDropByActionTest() {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        MyMethods.myWait(2);

        WebElement leftSlideButton = driver.findElement(By.xpath("(//div[@id=\"slider-range\"]//span)[1]"));

        Actions actions = new Actions(driver);

        Action action = actions.dragAndDropBy(leftSlideButton, 150, 0).build();// moves the element horizontally and vertically
        // x offset means distance on horizontal line, y offset means distance on vertical line. Negative values means left or down,
        // positive values mean right or up
        action.perform();

        MyMethods.myWait(2);

        Action action1 = actions.dragAndDropBy(leftSlideButton,-300,0).build();
        action1.perform();

        waitAndQuit();

    }
}
