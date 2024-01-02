package Day06;

import Utilities.DriverClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_StatusOfElement extends DriverClass {

    // isDisplayed
    // isSelected
    // isEnabled

    @Test
    public void test1() {
        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        List<WebElement> daysCheckBoxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

        for (WebElement day : daysCheckBoxes) {
            System.out.println("day.isDisplayed() = " + day.isDisplayed());
            System.out.println("day.isEnabled() = " + day.isEnabled());
            System.out.println("day.isSelected() = " + day.isSelected());
        }
        System.out.println("================================================================");
        daysCheckBoxes.get(1).click();
        daysCheckBoxes.get(4).click();
        daysCheckBoxes.get(6).click();

        for (WebElement day : daysCheckBoxes) {
            System.out.println("day.isDisplayed() = " + day.isDisplayed());
            System.out.println("day.isEnabled() = " + day.isEnabled());
            System.out.println("day.isSelected() = " + day.isSelected());
        }

        waitAndQuit();
    }
}
