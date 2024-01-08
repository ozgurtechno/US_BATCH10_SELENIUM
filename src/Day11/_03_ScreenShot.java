package Day11;

import Utilities.DriverClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _03_ScreenShot extends DriverClass {

    @Test
    public void takeScreenShot() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin1234");

        WebElement loginButton = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        loginButton.click();

        try {
            WebElement dashBoard = driver.findElement(By.xpath("//h6[text()=\"Dashboard\"]"));
            Assert.assertTrue(dashBoard.isDisplayed());
        } catch (NoSuchElementException exception) {
            LocalDateTime timeOfError = LocalDateTime.now(); // Getting the date and time of the bug

            DateTimeFormatter format = DateTimeFormatter.ofPattern("MM_dd_yyyy_hh_mm_ss_SSS");

            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            // We use it to take the screenshot

            File screenShotInTemporaryFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            // Takes the screenshot and saves it as a temporary file

            FileUtils.copyFile(screenShotInTemporaryFile, new File("src/screenshots/screenShot_"+timeOfError.format(format)+".png"));
            // Creates a png file in screenshots package, names it as screenshot.png and saves it
        }

        waitAndQuit();
    }
}
