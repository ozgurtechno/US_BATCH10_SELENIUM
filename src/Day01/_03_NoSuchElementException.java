package Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_NoSuchElementException {

    public static void main(String[] args) {
        // https://form.jotform.com/232258017946157

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/232258017946157");

        WebElement element = driver.findElement(By.id("first")); // If the locator is wrong or the element with that locator
        // doesn't exist selenium throws NoSuchElement Exception

        driver.quit();
    }
}
