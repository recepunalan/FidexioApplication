package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement loginUsername;

    @FindBy(id = "password")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_menu_text']")
    public WebElement discussSign;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongMessage;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement warningMessage;

    @FindBy(name="password")
    public WebElement bulletPass;


}
