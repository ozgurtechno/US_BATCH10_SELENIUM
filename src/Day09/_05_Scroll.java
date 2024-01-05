package Day09;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _05_Scroll extends DriverClass {

    @Test
    public void scrollTest(){

        // We use scroll to load more elements or to be able to see the elements that are hidden unless you scroll down

        // We use JavascriptExecutor interface to perform scroll

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, 3000)");  // --> Scrolls down to 3000th pixel.
//                                                            // The first number represents horizontal line, the second number represents vertical line;
//        js.executeScript("window.scrollBy(0, 3000);"); // Scroll down by 3000 everytime we use it. If you use it twice one after another
//                                                            // First time you will go to 3000 and 2nd time you will go to 6000
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // --> scrolls down to the end of the page right away
//        js.executeScript("arguments[0].scrollIntoView(true);", element); // Scrolls down to the element right away

        driver.get("https://p-del.co/");

        MyMethods.myWait(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

//        js.executeScript("window.scrollTo(0, 3000)"); // Takes us to the 3000th pixel
//
//        MyMethods.myWait(2);
//
//        js.executeScript("window.scrollTo(0, 2000)"); // Takes us to 2000th pixel
        //------------------------------------------------------------------------------------
//        js.executeScript("window.scrollBy(0, 3000);"); // Takes us to 3000th pixel
//
//        MyMethods.myWait(2);
//
//        js.executeScript("window.scrollBy(0, 3000);"); // Takes us 6000th pixel
//
//        MyMethods.myWait(2);
//
//        js.executeScript("window.scrollBy(0, -2000);"); // Takes us 4000th pixel
        //-----------------------------------------------------------------------------------
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // Takes us to the end of the page
//
//        MyMethods.myWait(2);
//
//        js.executeScript("window.scrollTo(0, 0)"); // Takes us to the top of the page
        //-----------------------------------------------------------------------------------

        WebElement elementToScroll = driver.findElement(By.cssSelector("img[data-gallery-item-index=\"25\"]"));

        js.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);

        waitAndQuit();
    }
}
