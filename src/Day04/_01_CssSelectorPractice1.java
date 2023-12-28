package Day04;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelectorPractice1 extends DriverClass {

    /**
     * Go to "http://demo.seleniumeasy.com/basic-first-form-demo.html"
     * Type your message into the input box
     * Click on Show Message button
     * Check if the message shown next to Your Message and the message you sent are the same
     * Locate elements by Css Selector
     **/

    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        MyMethods.myWait(2);

        WebElement messageInputBox = driver.findElement(By.cssSelector("input[placeholder^=\"Please\"]"));

        messageInputBox.sendKeys("Hello Batch 10");

        MyMethods.myWait(2);

        WebElement showMessageButton = driver.findElement(By.cssSelector("form[id=\"get-input\"]>button"));

        showMessageButton.click();

        MyMethods.myWait(2);

        WebElement displayedMessage = driver.findElement(By.cssSelector("span[id=\"display\"]"));

        if (displayedMessage.getText().equals("Hello Batch 10")){
            System.out.println("Test is successful");
        }else {
            System.out.println("Test is failed");
        }

        waitAndQuit();
    }
}
