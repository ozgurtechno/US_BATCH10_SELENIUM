package Day08;

import Utilities.DriverClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _06_WaitPractice2 extends DriverClass {

    /**
     * Go to http://demo.seleniumeasy.com/ajax-form-submit-demo.html
     * Type Name and a Comment
     * Click on Submit Button
     * Verify you see "Success" keyword.
     **/

    @Test
    public void waitPractice(){

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement nameInput = driver.findElement(By.id("title"));
        nameInput.sendKeys("Batch 10 is coming!");

        WebElement comment = driver.findElement(By.id("description"));
        comment.sendKeys("We will be the bests");

        WebElement submitButton = driver.findElement(By.id("btn-submit"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        WebElement successMessage = driver.findElement(By.id("submit-control"));

        Assert.assertTrue(successMessage.getText().contains("Success"));

        waitAndQuit();
    }
}
