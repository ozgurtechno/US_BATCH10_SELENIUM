package Day01;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindById {

    public static void main(String[] args) {
        // https://form.jotform.com/232258017946157

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/232258017946157");

        MyMethods.myWait(3);

        WebElement firstName = driver.findElement(By.id("first_3")); // Locates the element by using its id attribute

        firstName.sendKeys("John");

        MyMethods.myWait(3);

        WebElement lastName = driver.findElement(By.id("last_3"));

        lastName.sendKeys("Snow");

        MyMethods.myWait(3);

        driver.quit();
    }
}
