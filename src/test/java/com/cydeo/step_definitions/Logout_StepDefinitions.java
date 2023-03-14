package com.cydeo.step_definitions;



import com.cydeo.pages.LogoutPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout_StepDefinitions {

    LogoutPage logoutPage = new LogoutPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

    @Given("User is on the login page.")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get("https://qa.fidexio.com/");
    }

    @And("The user enters the salesmanager username {string} and password {string}")
    public void theUserEntersTheSalesmanagerUsernameAndPassword(String string1, String string2) {
        logoutPage.loginUsername.sendKeys(string1);
        logoutPage.loginPassword.sendKeys(string2);
        logoutPage.loginButton.click();

    }

    @When("User sees his-her username button {string} on the top right-hand corner.")
    public void userSeesHisHerUsernameButtonOnTheTopRightHandCorner(String string) {
        wait.until(ExpectedConditions.visibilityOf(logoutPage.userSign));
        Assert.assertTrue(logoutPage.userSign.getText().contains(string));

    }

    @When("User clicks his-her username button.")
    public void user_clicks_his_her_username_button() {
        logoutPage.userSign.click();
    }

    @When("User clicks logout button.")
    public void user_clicks_logout_button() {
        logoutPage.logoutSign.click();
    }

    @Then("user is on the login page {string}.")
    public void userIsOnTheLoginPage(String string) {
        Assert.assertTrue( Driver.getDriver().getTitle().contains(string));
    }

    @When("user click the  step back button on the top left-hand corner.")
    public void user_click_the_step_back_button_on_the_top_left_hand_corner() {
        Driver.getDriver().navigate().back();
    }

    @Then("User sees {string} message on the page.")
    public void user_sees_message_on_the_page(String string) {
        wait.until(ExpectedConditions.visibilityOf(logoutPage.warningMessage));
        Assert.assertTrue(logoutPage.warningMessage.getText().contains(string));
    }

}
