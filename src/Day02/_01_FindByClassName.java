package Day02;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/232258017946157");

        MyMethods.myWait(3);

        WebElement firstName = driver.findElement(By.className("form-textbox")); // You can use this again later in your code
        firstName.sendKeys("George");

//        driver.findElement(By.className("form-textbox")).sendKeys("George"); // You cannot use this again. You have to locate it again

        MyMethods.myWait(3);
        firstName.clear();// deletes the previous text from the text box

        MyMethods.myWait(3);
        firstName.sendKeys("Susan");

        MyMethods.myWait(3);

        driver.quit();

    }
}
