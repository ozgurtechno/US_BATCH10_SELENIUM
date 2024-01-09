package Day10;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_JavascriptExecutorClick extends DriverClass {

    /**
     * Go to "https://www.selenium.dev/"
     * Click on all of the links that opens up a new tab(target=_blank) except the ones that has "mailto" word in their href attribute
     * Print out titles and urls of them
     * Then close them one by one except the main
     * Print the title and url of the main tab
     * Then close it.
     **/

    @Test
    public void javascriptClick() {
        driver.get("https://www.selenium.dev/");

        String idMain = driver.getWindowHandle();

        List<WebElement> urls = driver.findElements(By.cssSelector("a[target=\"_blank\"]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (WebElement url: urls){
            if (!url.getAttribute("href").contains("mailto")){
                js.executeScript("arguments[0].click();", url); // Javascript click.
                // We use it when selenium regular click is not able to click on the element
            }
        }

        Set<String> ids = driver.getWindowHandles();

        for (String id: ids){
            if (!id.equals(idMain)){
                driver.switchTo().window(id);
                System.out.println("driver.getTitle() = " + driver.getTitle());
                System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
                MyMethods.myWait(1);
            }
        }

        for (String id: ids){
            if (!id.equals(idMain)){
                driver.switchTo().window(id);
                driver.close();
                MyMethods.myWait(1);
            }
        }

        driver.switchTo().window(idMain);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.quit();
    }
}
