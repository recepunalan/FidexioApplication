package com.cydeo.step_definitions;


import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User opens a browser and go to login page")
    public void user_opens_a_browser_and_go_to_login_page() {
        Driver.getDriver().get("https://qa.fidexio.com/");
    }

    @When("User enters a valid SalesManager {string} into username box")
    public void user_enters_a_valid_sales_manager_into_username_box(String string) {
        loginPage.loginUsername.sendKeys(string);
    }

    @When("User enters a valid SalesManager {string} into password box")
    public void user_enters_a_valid_sales_manager_into_password_box(String string) {
        loginPage.loginPassword.sendKeys(string);
    }

    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("User lands on the home page ans sees {string} on the title.")
    public void userLandsOnTheHomePageAnsSeesOnTheTitle(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @When("User enters a valid PosManager {string} into username box")
    public void userEntersAValidPosManagerIntoUsernameBox(String string) {
        loginPage.loginUsername.sendKeys(string);
    }

    @And("User enters a valid PosManager {string} into password box")
    public void userEntersAValidPosManagerIntoPasswordBox(String string) {
        loginPage.loginPassword.sendKeys(string);
    }

    @When("User enters a invalid  {string} into username box")
    public void userEntersAInvalidIntoUsernameBox(String string) {
        loginPage.loginUsername.sendKeys(string);
    }

    @And("User enters a invalid  {string} into password box")
    public void userEntersAInvalidIntoPasswordBox(String string) {
        loginPage.loginPassword.sendKeys(string);
    }

    @Then("User can see {string} message on the page")
    public void userCanSeeMessageOnThePage(String string) {
        String actualTitle = loginPage.wrongMessage.getText();
        Assert.assertEquals(string,actualTitle);
    }



    @When("User doesn't enter {string} into username box")
    public void userDoesnTEnterIntoUsernameBox(String string) {
        loginPage.loginUsername.sendKeys(string);
    }

    @And("User doesn't enter {string} into password box")
    public void userDoesnTEnterIntoPasswordBox(String string) {
        loginPage.loginPassword.sendKeys(string);
    }

    @Then("User can see {string} message.")
    public void userCanSeeOrMessage(String alertMessage) {
        String expectedMessage = Driver.getDriver().findElement(By.name("login")).getAttribute("validationMessage");
        System.out.println("expectedMessage = " + expectedMessage);
        Assert.assertEquals(expectedMessage, alertMessage);
    }

    @And("User hit ‘Enter’ key of the keyboard is working correctly on the login page.")
    public void userHitEnterKeyOfTheKeyboardIsWorkingCorrectlyOnTheLoginPage() {
        loginPage.loginButton.sendKeys(Keys.ENTER);
    }


    @When("User writes {string} into password box")
    public void userWritesIntoPasswordBox(String string) {
        loginPage.loginPassword.sendKeys(string);
    }

    @Then("user should see the password in bullet signs")
    public void userShouldSeeThePasswordInBulletSigns() {
        Assert.assertTrue(loginPage.bulletPass.getAttribute("type").equals("password"));
        System.out.println(loginPage.bulletPass.getAttribute("type").equals("password"));
    }
}
