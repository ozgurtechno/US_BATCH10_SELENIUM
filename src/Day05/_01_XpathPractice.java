package Day05;

import Utilities.DriverClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_XpathPractice extends DriverClass {

    /**
     * Go to "https://www.saucedemo.com/"
     * Login
     * Click on Sauce Labs Backpack and add it to cart
     * Go back
     * Click on Sauce Labs Bolt T-Shirt and add it to cart
     * Go back
     * Click on Cart
     * Click on Check Out
     * Verify that total amount is equal to the sum of the products in the cart
     * Use XPATH
     **/

    @Test
    public void test1(){
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value=\"Login\"]"));
        loginButton.click();

        WebElement product1 = driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]"));
        product1.click();

        WebElement addToCart1 = driver.findElement(By.xpath("//button[starts-with(@name,\"add-to-cart\")]"));
        addToCart1.click();

        driver.navigate().back();

        WebElement product2 = driver.findElement(By.xpath("//div[text()=\"Sauce Labs Bolt T-Shirt\"]"));
        product2.click();

        WebElement addToCart2 = driver.findElement(By.xpath("//button[starts-with(@name,\"add-to-cart\")]"));
        addToCart2.click();

        driver.navigate().back();

        WebElement cart = driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]"));
        cart.click();

        WebElement checkOutButton = driver.findElement(By.xpath("//button[@data-test=\"checkout\"]"));
        checkOutButton.click();

        WebElement firstname = driver.findElement(By.xpath("//div[@class=\"form_group\"]//input[@id=\"first-name\"]"));
        firstname.sendKeys("Batch 10");

        WebElement lastname = driver.findElement(By.xpath("//div[@class=\"form_group\"]//input[@id=\"last-name\"]"));
        lastname.sendKeys("The Best");

        WebElement zipCode = driver.findElement(By.xpath("//div[@class=\"form_group\"]//input[@id=\"postal-code\"]"));
        zipCode.sendKeys("54865");

        WebElement continueButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        continueButton.click();

        List<WebElement> productList = driver.findElements(By.xpath("//div[@class=\"inventory_item_price\"]"));

//        String stringPrice1 = productList.get(0).getText().substring(1); // $29.99 -> 29.99
//        String stringPrice2 = productList.get(1).getText().substring(1); // $15.99 -> 15.99
//
//        Double doublePrice1 = Double.parseDouble(stringPrice1);
//        Double doublePrice2 = Double.parseDouble(stringPrice2);

        double subTotal = 0.0;
        for (WebElement element: productList){
            String stringPrice = element.getText().substring(1);
            double doublePrice = Double.parseDouble(stringPrice);
            subTotal+=doublePrice;
        }

        WebElement itemTotal = driver.findElement(By.xpath("//div[@class=\"summary_subtotal_label\"]"));
        String stringItemTotal = itemTotal.getText().replaceAll("[^0-9,.]","");
        double doubleItemTotal = Double.parseDouble(stringItemTotal);

        Assert.assertTrue(subTotal==doubleItemTotal);

        waitAndQuit();

    }
}
