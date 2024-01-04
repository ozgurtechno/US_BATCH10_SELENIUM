package Day09;

import Utilities.DriverClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_WaitPractice3 extends DriverClass {

    /**
     * Go to "https://www.demoblaze.com/index.html"
     * Click on Samsung Galaxy s6
     * Click on "Add to Cart"
     * Close the alert
     * Click on Product Store to go back to the main page
     * Verify that you are on the main page
     **/

    @Test
    public void waitPractice(){
        driver.get("https://www.demoblaze.com/index.html");

        WebElement galaxyS6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        galaxyS6.click();

        WebElement addToCartButton = driver.findElement(By.linkText("Add to cart"));
        addToCartButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement productStore = driver.findElement(By.id("nava"));
        productStore.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("index"));

        waitAndQuit();
    }
}
