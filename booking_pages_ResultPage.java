package com.booking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class ResultPage {

    private WebDriver driver;

    /* Class constructor */
    public ResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /* Result Text Title */
    @FindBy(xpath = "//*[@id=\"searchresultsTmpl\"]/header/div/div/div[1]/h1")
    private WebElement cityTextTitle;

    /* Result Hotel Location */
    @FindBy(className = "sr_item_main_block")
    private WebElement resultLocation;

    /* Methods */
    public void resultDestinationCity(String text) {
        assertTrue(cityTextTitle.isDisplayed(), text);
    }

    public void firstPageResultCityLocation(String text) {
        assertTrue(resultLocation.getText().contains(text), text);
    }
}
