package model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by qtr-ptc-6 on 3/20/2018.
 */
public class MainPage {

    private WebDriver driver;
    private String BASE_URL ="http://www.thetimezoneconverter.com/";

    @FindBy (id = "time1")
    private WebElement timeInputFrom;

    @FindBy (id = "time2")
    private WebElement timeInputTo;

    @FindBy (className = "select2-search__field")
    private  WebElement locationField;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }



    public void setFromTime(String fromTime) {
        timeInputFrom.sendKeys(fromTime);
    }

    public void getToTime(){
        timeInputTo.getText();
    }


    public MainPage open() {
        driver.get(BASE_URL);
        return this;
    }

    public MainPage setInitialLocation(String location) {
        driver.findElement(By.id("select2-c1-container")).click();
        locationField.sendKeys(location);
        locationField.sendKeys(Keys.ENTER);
        return this;
    }

    public MainPage setTargetLocation(String location) {
        driver.findElement(By.id("select2-c2-container")).click();
        locationField.sendKeys(location);
        locationField.sendKeys(Keys.ENTER);
        return this;
    }

    public MainPage setInitialTime(String timeFrom) {
        timeInputFrom.clear();
        timeInputFrom.sendKeys(timeFrom);
        return this;
    }

    public String getTargetTime() {
      return  timeInputTo.getAttribute("value");

    }
}
