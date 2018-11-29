package pl.b2b.net.automationPractice.pages.womenPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.automationPractice.SingletonWebDriver;
import pl.b2b.net.automationPractice.pages.topsPage.ObjectTopPage;

public class TestWomenPage {


    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private ObjectWomenPage objectWomenPage;
    private ObjectTopPage objectTopPage;


    @BeforeClass
    public void setUp() {
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWebDriverWait();
        objectWomenPage = new ObjectWomenPage(webDriver, wait);
        objectTopPage = new ObjectTopPage(webDriver, wait);
    }

    @Test
    public void goToTops(){
        objectWomenPage.clikTopsImage();
        Assert.assertEquals(objectTopPage.getTopsAssert().getAttribute("innerHTML").trim(),"Tops");

    }
}
