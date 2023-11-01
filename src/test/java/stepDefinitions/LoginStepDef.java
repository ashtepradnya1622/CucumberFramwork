package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.Login;

public class LoginStepDef {
    Login login;

    public LoginStepDef(Login login)
    {
        this.login = login;
    }

    @When("User opens the url put the field blank & click on login button")
    public void userOpensTheUrlPutTheFieldBlankClickOnLoginButton()
    {
        login.Blanklogin();
    }

    @When("User opens the url enter the valid details & click on login button")
    public void user_opens_the_url_enter_the_valid_details_click_on_login_button()
    {
        login.login();
    }

    @Given("user opens the url")
    public void user_opens_the_url()
    {
        //login.openUrl();
    }

    @When("user Enters invalid user id password")
    public void user_enters_invalid_user_id_password()
    {
        login.Invalidlogin();
    }

//    @When("user Enters invalid user id password")
//    public void user_enters_invalid_user_id_password1()
//    {
//        login.Invalidlogin1();
//    }

    @Then("User is not navigated to the next page")
    public void User_is_not_navigated_to_the_next_page()
    {

    }

    @Given("user is on the login page")
    public void the_user_is_on_the_login_page() {

    }

    @When("user clicks the {string} link")
    public void the_user_clicks_the_link(String string) {
        login.Forgotpassword();
    }

    @Then("User should be redirected to the password reset page")
    public void they_should_be_redirected_to_the_password_reset_page() {
        login.LINK();
    }

    @Then("user enters their email address and click on reset link")
    public void user_enters_their_email_address_and_click_on_reset_link() {
        login.click1();
    }


    @When("User opens the url")
    public void userOpensTheUrl() throws InterruptedException {
        login.login();
    }

    @When("user Enters user id and password")
    public void userEntersUserIdPassword()
    {
        login.Invalidlogin();
    }

    @When("^user Enter (.+) and (.+)$")
    public void userEnterUserIdAndPassword(String userId, String password)
    {
        login.Invalidlogin(userId,password);
    }
}
