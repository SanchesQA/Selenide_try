package data;

import domainObjects.TimeConverterData;
import org.testng.annotations.DataProvider;

/**
 * Created by qtr-ptc-6 on 3/20/2018.
 */
public class TimeConvertDataProvider {
    @DataProvider (name = "timeConvertDataProvider")
    public static Object[][] timeConvertDataProvider(){
        TimeConverterData timeConverterData = new TimeConverterData();
        timeConverterData.setInitialLocation("Paris");
        timeConverterData.setInitialTime("8:00 PM");
        timeConverterData.setDestLocation("Tokyo");
        timeConverterData.setExpectedTime("4:00 AM");
        return new Object[][]{{timeConverterData}};
    }
}
