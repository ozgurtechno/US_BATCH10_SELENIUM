package Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindByName {

    public static void main(String[] args) {

        //Locators in Selenium
        // By.id --> 1st option. Because it is unique for each element %99.9 of the time
        // By.name
        // By.className
        // By.linkText --> works only with a tags
        // By.partialLinkText --> works only with a tags
        // By.tagName
        // By.cssSelector
        // By.xpath --> Last option. Because it works slower than the others but it is the most efficient one

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/232258017946157");

        WebElement firstName = driver.findElement(By.name("q3_fullName3[first]"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.name("q3_fullName3[last]"));
        lastName.sendKeys("Wick");

        driver.quit();



    }
}
