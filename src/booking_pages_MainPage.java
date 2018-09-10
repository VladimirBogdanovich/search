package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;

    /* Class constructor */
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /* Search block */
    @FindBy(id = "logo_no_globe_new_logo")
    private WebElement logo;

    @FindBy(xpath = "//*[@id=\"ss\"]")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div/div[2]/div/div/div/div[1]/div/button")
    private WebElement checkInButton;

    @FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div/div[3]/div/div/div/div[1]/div/button/i")
    private WebElement checkOutButton;

    @FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div/div/div[2]/table/tbody/tr[2]/td[7]/span")
    private WebElement checkInDate;

    @FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div[3]/div/div/div[2]/table/tbody/tr[3]/td[6]/span")
    private WebElement checkOutDate;

    @FindBy(className = "sb-searchbox__button   ")
    private WebElement searchButton;

    /* Methods */
    public void inputDestination(String city) {
        searchField.sendKeys(city);
        checkInButton.click();
        checkInDate.click();
        checkOutDate.click();
        searchButton.click();
    }
}