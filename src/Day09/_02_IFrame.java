package Day09;

import Utilities.DriverClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFrame extends DriverClass {

    /**
     * Go to "https://chercher.tech/practice/frames"
     * Type USA in the first box on the page
     * Select Avatar from animals
     **/

    @Test
    public void iFrameTest(){
        driver.get("https://chercher.tech/practice/frames");

        WebElement iFrame1 = driver.findElement(By.id("frame1"));

        driver.switchTo().frame(iFrame1); // switches to an iframe by locating that i frame

        WebElement topic = driver.findElement(By.cssSelector("input[type=\"text\"]"));
        topic.sendKeys("USA");

        driver.switchTo().parentFrame(); // Takes us one step back

        driver.switchTo().frame(1); // switches into the iframe by using its index(order in the html code)
                                         // index starts from 0

        WebElement animals = driver.findElement(By.id("animals"));

        Select select = new Select(animals);
        select.selectByVisibleText("Avatar");

        waitAndQuit();
    }
}
