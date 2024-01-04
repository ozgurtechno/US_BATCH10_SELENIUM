package Day09;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class _04_Window extends DriverClass {

    /**
     * Go to "https://www.selenium.dev/"
     * Click on Watch the videos
     * Print the title and url of new tab
     * Close the new tab
     **/

    @Test
    public void windowTest() {

        driver.get("https://www.selenium.dev/");

        String mainTabId = driver.getWindowHandle(); // Every tab has a unique id. This method gives the id if the first(main) method.
        System.out.println("mainTabId = " + mainTabId);

        WebElement watchVideos = driver.findElement(By.linkText("Watch the Videos"));
        watchVideos.click();

        Set<String> idsOfAllTabs = driver.getWindowHandles(); // We are not able to get ids of the tabs separately. So we get all of them together.

        for (String id: idsOfAllTabs){
            if (!id.equals(mainTabId)){
                driver.switchTo().window(id);
            }
        }
        //The driver is on the 2nd tab

        MyMethods.myWait(2);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());

        MyMethods.myWait(2);

        driver.close(); // Closes the active tab only

//        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
//        System.out.println("driver.getTitle() = " + driver.getTitle());

        // The souts above throw NoSuchWindowException. Because we already closed the window but the driver is still on that window.
        // It cannot switch back to the main window. We should do it with code

        driver.switchTo().window(mainTabId); // The driver is on the main tab

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());

        MyMethods.myWait(2);

        driver.quit();
    }
}
