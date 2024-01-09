package Day11;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

public class _02_WindowDimension extends DriverClass {

    @Test
    public void changeWindowSize(){
        driver.get("https://opensource-demo.orangehrmlive.com/");

        MyMethods.myWait(2);

        Dimension dimension = new Dimension(412,915);

        driver.manage().window().setSize(dimension);

        MyMethods.myWait(2);

        dimension = new Dimension(4000,5000);

        driver.manage().window().setSize(dimension);

        waitAndQuit();
    }
}
