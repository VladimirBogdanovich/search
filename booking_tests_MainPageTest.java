import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MainPage;
import ResultPage;

import java.util.concurrent.TimeUnit;

public class MainPageTest{
    public static WebDriver driver;

    @BeforeMethod
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Volumes/Home/Autotests/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.booking.com/");
        System.out.println("start browser");
    }

    @Test
    public void inputDestination() {
        MainPage mainPage = new MainPage(driver);
        mainPage.inputDestination("NY");
        ResultPage resultPage = new ResultPage(driver);
        resultPage.resultDestinationCity("Нью-Йорк");
        System.out.println("input destination test ok");
    }

    @Test
    public void checkLocation() {
        MainPage mainPage = new MainPage(driver);
        mainPage.inputDestination("NY");
        ResultPage resultPage = new ResultPage(driver);
        resultPage.firstPageResultCityLocation("New York City");
        System.out.println("check location test ok");
    }

    @AfterMethod
    public static void closeBrowser() {
        driver.quit();
        System.out.println("close browser");
    }
}