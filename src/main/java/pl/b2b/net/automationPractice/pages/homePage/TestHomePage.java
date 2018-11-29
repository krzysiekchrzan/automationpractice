package pl.b2b.net.automationPractice.pages.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pl.b2b.net.automationPractice.SingletonWebDriver;

public class TestHomePage {
    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private ObjectHomePage objectHomePage;


    @BeforeClass
    public void setUp(){
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWebDriverWait();
        objectHomePage = new ObjectHomePage(webDriver,wait);
    }


    @Test (priority = 1)
    public void openStore() {
        webDriver.get(DataHomePage.URL);
    }

    @Test (priority = 2)
    public void goToWomenPage() {
        objectHomePage.clickWomenPage();
        Assert.assertEquals(webDriver.getTitle(), "Women - My Store");
    }

    @Test (priority = 3)
    @Parameters({"name"})
    public void goToCategoriesDresses(@Optional("Women") String name) {
        objectHomePage.clickCategories(name);
        Assert.assertEquals(webDriver.getTitle(),"Dresses");
    }

//    @AfterClass
//    public void tearUp() {
//        webDriver.quit();
//    }



}
