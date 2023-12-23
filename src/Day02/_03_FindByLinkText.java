package Day02;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        
        String url1 = driver.getCurrentUrl(); // gives the current url of the page
        System.out.println("url1 = " + url1);

        MyMethods.myWait(2);

        WebElement careers = driver.findElement(By.linkText("Careers")); // If an element has a tag we can use its visible text to locate it.

        System.out.println("careers.getText() = " + careers.getText());

        String hrefOfCareer = careers.getAttribute("href");
        System.out.println("hrefOfCareer = " + hrefOfCareer);

        String classOfCareers = careers.getAttribute("class");
        System.out.println("classOfCareers = " + classOfCareers);

        careers.click();

        String url2 = driver.getCurrentUrl();
        System.out.println("url2 = " + url2);

        if (!url1.equals(url2)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");
        }

        MyMethods.myWait(2);

        driver.quit();
    }
}
