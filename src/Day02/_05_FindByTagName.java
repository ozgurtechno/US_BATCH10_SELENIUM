package Day02;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindByTagName extends DriverClass{
    public static void main(String[] args) {

        driver.get("https://www.amazon.com/");

        MyMethods.myWait(3);

        List<WebElement> linksOnAmazon = driver.findElements(By.tagName("a"));

        System.out.println("linksOnAmazon.size() = " + linksOnAmazon.size());

        for (WebElement link : linksOnAmazon) {
            System.out.println("link.getText() = " + link.getText());
            System.out.println("link.getAttribute(\"href\") = " + link.getAttribute("href"));
        }

//        driver.get("https://form.jotform.com/232258017946157");
//
//        List<WebElement> labelsOnJotForm = driver.findElements(By.tagName("label"));
//        System.out.println("labelsOnJotForm.size() = " + labelsOnJotForm.size());
//
//        for (WebElement label: labelsOnJotForm){
//            System.out.println("label.getText() = " + label.getText());
//            System.out.println("label.getAttribute(\"class\") = " + label.getAttribute("class"));
//            System.out.println("label.getAttribute(\"id\") = " + label.getAttribute("id"));
//        }

        DriverClass.waitAndQuit();
    }
}
