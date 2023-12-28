package Day01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebSites {

    public static void main(String[] args) throws InterruptedException {
        // This is my note...

        WebDriver driver = new ChromeDriver(); // Creates a new chrome driver
//        WebDriver driver1 = new SafariDriver();
//        WebDriver driver2 = new EdgeDriver();
//        WebDriver driver3 = new FirefoxDriver();

        driver.get("https://www.google.com"); // goes to the web site

        Thread.sleep(5000);

        driver.quit(); // quits the browser
    }
}
