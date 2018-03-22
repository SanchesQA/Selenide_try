import model.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by qtr-ptc-6 on 3/20/2018.
 */
public class TestTimeZoneConvert extends BaseTest{



    @Test
    public  void timeShouldBeConvertedIn12HourZone(){
        driver.get("http://www.thetimezoneconverter.com/");
        driver.findElement(By.id("select2-c1-container")).click();
        driver.findElement(By.className("select2-search__field")).sendKeys("Paris");
        driver.findElement(By.id("select2-c2-container")).click();
        driver.findElement(By.className("select2-search__field")).sendKeys("Tokyo");
        driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("time1")).clear();
        driver.findElement(By.id("time1")).sendKeys("8:00 PM");
        String actualResult = driver.findElement(By.id("time2")).getAttribute("value");
        String expectedResult ="4:00 AM";
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void timeShouldBeConvertedIn12HourZoneWithPO() {
        String expectedResult ="4:00 AM";
        MainPage mainPage = new MainPage(driver);
       String actualResult = mainPage
                .open()
                .setInitialLocation("Paris")
                .setTargetLocation("Tokyo")
                .setInitialTime("8:00 PM")
                .getTargetTime();
        Assert.assertEquals(actualResult, expectedResult);
    }



}
