package Day02;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/232258017946157");

        MyMethods.myWait(3);

        List<WebElement> labelList = driver.findElements(By.className("form-sub-label")); // gives a list of web elements with the same locator
        // If there is no element with that locator it returns an empty list
        System.out.println("labelList.size() = " + labelList.size());
        for (WebElement label: labelList){
            System.out.println("label = " + label.getText()); // getText() gives the visible text of a web element
        }

        MyMethods.myWait(3);

        driver.quit();
    }
}
