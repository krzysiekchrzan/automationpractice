package pl.b2b.net.automationPractice.pages.womanPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectWomanPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public ObjectWomanPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
        PageFactory.initElements(webDriver, this);
    }




}
