package Day02;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindByPartialLinkText {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        WebElement startPackageDeliveryBusiness = driver.findElement(By.partialLinkText("Delivery Business"));

        System.out.println("startPackageDeliveryBusiness.getText() = " + startPackageDeliveryBusiness.getText());

        String href = startPackageDeliveryBusiness.getAttribute("href");
        System.out.println("href = " + href);

        String classAttribute = startPackageDeliveryBusiness.getAttribute("class");
        System.out.println("classAttribute = " + classAttribute);

        MyMethods.myWait(2);

        driver.quit();
    }
}
