package Day06;

import Utilities.DriverClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _03_SelectClassPractice extends DriverClass {
    /**
     * Go to https://www.facebook.com/
     * Click on Create New Account
     * Enter name, lastname and email
     * Verify that an input is displayed that says enter your email again
     * Re-enter your email
     * Create a password
     * Select date of birth
     * Select Gender
     * And Verify it is selected
     **/

    @Test
    public void faceBookSignUpTest() {
        driver.get("https://www.facebook.com/");

        WebElement createAccountButton = driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
        createAccountButton.click();

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Wick");

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("wick@gmail.com");

        WebElement emailConfirm = driver.findElement(By.name("reg_email_confirmation__"));

        Assert.assertTrue(emailConfirm.isDisplayed());

        emailConfirm.sendKeys("wick@gmail.com");

        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("wick1234");

        //-------------------------Select Random Month
        WebElement month = driver.findElement(By.id("month"));
        Select select = new Select(month);
        int randomIndex = (int) (Math.random() * 12);
        select.selectByIndex(randomIndex);

        //-------------------------Select Random Day

        WebElement day = driver.findElement(By.id("day"));

        Select selectDay = new Select(day);

        List<WebElement> listOfDays = driver.findElements(By.xpath("//select[@id=\"day\"]//option"));

        randomIndex = (int) (Math.random() * listOfDays.size());

        selectDay.selectByIndex(randomIndex);

        //---------------------------Select Random Year

        WebElement year = driver.findElement(By.id("year"));

        Select selectYear = new Select(year);

        List<WebElement> listOfYears = driver.findElements(By.xpath("//select[@id=\"year\"]//option"));

        randomIndex = (int) (Math.random() * listOfYears.size());

        selectYear.selectByIndex(randomIndex);

        //-------------------------------Select Random Gender

        List<WebElement> genderList = driver.findElements(By.xpath("//label[text()=\"Female\" or text()=\"Male\"]/following-sibling::input"));

        randomIndex = (int) (Math.random() * genderList.size());

        genderList.get(randomIndex).click();

        Assert.assertTrue(genderList.get(randomIndex).isSelected());

        waitAndQuit();
    }
}
