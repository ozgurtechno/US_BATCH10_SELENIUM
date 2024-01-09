package Day11;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _01_RobotClass extends DriverClass {

    // What is Robot Class?
    // It is a class that lets us control the operating system(Windows, Mac)
    //
    // When do you use it?
    // We use it when we need to upload or download files.

    // How do you use it?
    // We create a Robot object and by using this object we can control our keyboard to control the os.

    @Test
    public void robotTest() throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");

        MyMethods.myWait(2);

        WebElement chooseFileButton = driver.findElement(By.id("uploadfile_0"));

        Actions actions = new Actions(driver);
        actions.click(chooseFileButton).build().perform();

        StringSelection filePath = new StringSelection("\"C:\\Users\\ragip\\Desktop\\UploadFile\\Filetoupload.txt\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        // Stores the path in the memory

        MyMethods.myWait(2);

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL); // Press and hold CTRL button
        robot.keyPress(KeyEvent.VK_V); // Press and hold V button to paste path of the document
        // pressed control+V

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        // released V first and control second

        MyMethods.myWait(2);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        // Press and release Enter

        WebElement acceptTerms = driver.findElement(By.id("terms"));
        acceptTerms.click();

        WebElement submitButton = driver.findElement(By.id("submitbutton"));
        submitButton.click();

        WebElement message = driver.findElement(By.id("res"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(message));

        Assert.assertTrue(message.getText().contains("successfully uploaded"));

        waitAndQuit();
    }
}
