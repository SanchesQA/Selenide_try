import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by qtr-ptc-6 on 3/20/2018.
 */
public class BaseTest {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
         }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
         driver.quit();
    }
}
