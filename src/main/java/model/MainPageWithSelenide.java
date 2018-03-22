package model;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by qtr-ptc-6 on 3/20/2018.
 */
public class MainPageWithSelenide {
    private WebDriver driver;




    public MainPageWithSelenide open(){
        Selenide.open("http://www.thetimezoneconverter.com/");
        return  this;
    }

    public  MainPageWithSelenide setInitialLocation (String location){
        $("#select2-c1-container").click();
        $(".select2-search__field").setValue(location).pressEnter();
        return  this;
    }
    public MainPageWithSelenide setTargetLocation(String location) {
        $("#select2-c2-container").click();
        $(".select2-search__field").setValue(location).pressEnter();
        return  this;
    }

    public MainPageWithSelenide setInitialTime(String timeFrom){
        $("#time1").setValue(timeFrom);
        return this;
    }

    public String getTargetTime(){
        return $("#time2").getAttribute("value");
    }

    public SelenideElement assertionSelenide(){
       return $("#time2").shouldHave(Condition.value("4:00 AM"));
    }

}
