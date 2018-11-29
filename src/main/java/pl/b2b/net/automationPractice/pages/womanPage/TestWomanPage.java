package pl.b2b.net.automationPractice.pages.womanPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.automationPractice.SingletonWebDriver;
import pl.b2b.net.automationPractice.pages.homePage.ObjectHomePage;
import pl.b2b.net.automationPractice.pages.topsPage.ObjectTopsPage;


public class TestWomanPage {
    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private ObjectHomePage objectHomePage;
    private ObjectTopsPage objectTopsPage;

    @BeforeClass
    public void setUp(){
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWebDriverWait();
        objectHomePage = new ObjectHomePage(webDriver,wait);
    }

    @Test
    public void goToTops(){
        objectHomePage.clickWomenPage();
    }


    }
