import com.codeborne.selenide.Configuration;

import org.testng.annotations.BeforeClass;

/**
 * Created by qtr-ptc-6 on 3/20/2018.
 */
public class BaseTestSelenide {
    @BeforeClass(alwaysRun = true)
    public void setUp(){
        Configuration.browser="chrome";

     }


}
