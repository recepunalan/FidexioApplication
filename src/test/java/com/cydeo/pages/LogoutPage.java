package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement loginUsername;

    @FindBy(id = "password")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//span[.='SalesManager15']")
    public WebElement userSign;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logoutSign;

    @FindBy(xpath = "//div[@class= 'o_dialog_warning modal-body']")
    public WebElement warningMessage;



}
