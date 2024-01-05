package Day10;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ActionsHomework extends DriverClass {

//    http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//    Put all cities in the correct countries. (Hint: Use findElements and a loop for both cities and countries)

    @Test
    public void question1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> countries = driver.findElements(By.cssSelector("div[class=\"destinationBox\"]"));
        List<WebElement> cities = driver.findElements(By.xpath("//div[@id=\"answerDiv\"]//div"));

        Actions actions = new Actions(driver);

        for (WebElement city : cities) {
            for (WebElement country : countries) {
                actions.clickAndHold(city).build().perform();
                MyMethods.myWait(1);
                actions.moveToElement(country).build().perform();
                MyMethods.myWait(1);
                actions.release().build().perform();
//                if (city.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) {
//                    break;
//                }

                if (city.getAttribute("class").equals("correctAnswer")) {
                    break;
                }
            }
        }

        waitAndQuit();
    }
}
