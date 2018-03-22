import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import data.TimeConvertDataProvider;
import domainObjects.TimeConverterData;
import model.MainPageWithSelenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by qtr-ptc-6 on 3/20/2018.
 */
public class TestTimeZoneSelenide extends BaseTestSelenide{
    @Test (dataProvider = "timeConvertDataProvider", dataProviderClass = TimeConvertDataProvider.class)

    public void timeShouldBeConvertedIn12HourZoneWithSelenide(TimeConverterData testData) {
        Selenide.open("http://www.thetimezoneconverter.com/");
        $("#select2-c1-container").click();
        $(".select2-search__field").setValue(testData.getInitialLocation()).pressEnter();
        $("#select2-c2-container").click();
        $(".select2-search__field").setValue(testData.getDestLocation()).pressEnter();
        $("#time1").setValue(testData.getInitialTime());
        $("#time2").shouldHave(Condition.value(testData.getExpectedTime()));
    }
    @Test(dataProvider = "timeConvertDataProvider", dataProviderClass = TimeConvertDataProvider.class)
    public void timeShouldBeConvertedIn12HourZoneWithSelenidePO(TimeConverterData testData) {

        MainPageWithSelenide mainPageWithSelenide = new MainPageWithSelenide();
        String actualResult = mainPageWithSelenide
                .open()
                .setInitialLocation(testData.getInitialLocation())
                .setTargetLocation(testData.getDestLocation())
                .setInitialTime(testData.getInitialTime())
                .getTargetTime();

        Assert.assertEquals(actualResult, testData.getExpectedTime());


    }
}
