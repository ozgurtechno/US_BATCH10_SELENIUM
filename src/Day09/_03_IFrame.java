package Day09;

import Utilities.DriverClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrame extends DriverClass {

    /**
     * Go to "https://chercher.tech/practice/frames"
     * Type USA in the first box on the page
     * Check the checkbox
     * Select Avatar from animals
     **/

    @Test
    public void iFrameTest(){

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1"); // We are in the first frame.
                                                    // This method is the slowest way to switch

        WebElement topic = driver.findElement(By.cssSelector("input[type=\"text\"]"));
        topic.sendKeys("USA");

        driver.switchTo().frame(0); // We are in the inner frame. In every frame index starts over from 0.
                                         // This method is the fastest way to switch

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent(); // Takes us where we start. To the main page

        driver.switchTo().frame(1); // We are in the 2nd frame on the main page

        WebElement animals = driver.findElement(By.id("animals"));

        Select select = new Select(animals);
        select.selectByVisibleText("Avatar");

        waitAndQuit();
    }
}
