import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

/**
 * Created by qtr-ptc-6 on 3/21/2018.
 */
public class ToDoMVCTest {
    @Test
    public void testThatAppleIsComplited() throws  Exception{
        Configuration.browser="chrome";
        Selenide.open("http://todomvc.com/examples/angularjs/#/");
        $("#new-todo").setValue("Apple").pressEnter();
        $("#new-todo").setValue("Grape").pressEnter();
        $(By.xpath("//ul[@id='todo-list']/li[1]//input[@type='checkbox']")).click();
        $(By.linkText("Completed")).click();
        $(By.xpath("//ul[@id='todo-list']/li//label[@class='ng-binding']")).shouldHave(Condition.text("Apple"));

    }
}
