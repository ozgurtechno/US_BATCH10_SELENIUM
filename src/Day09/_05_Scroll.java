package Day09;

import Utilities.DriverClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

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



    }
}
