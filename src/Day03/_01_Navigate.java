package Day03;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Navigate extends DriverClass {

    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyMethods.myWait(2);

        WebElement alerts = driver.findElement(By.id("alerttest"));
        alerts.click(); // Clicks on the element if the element is clickable

        MyMethods.myWait(2);

        // Navigate keeps the history of the web sites on the browser and takes us back and forth between the pages

        driver.navigate().back(); // Takes us to the previous page like we click on <-

        MyMethods.myWait(2);

        driver.navigate().forward(); // Takes us to the next page if we have already visited like we click on ->

        waitAndQuit();
    }
}
