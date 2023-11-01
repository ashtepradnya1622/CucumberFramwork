package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.Login;
import object.Reportees;
import org.testng.Assert;
import util.Base;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Reporteestepdefination {
    Login login;
    Reportees reportees;


    public Reporteestepdefination(Reportees reportees, Login login) {
        this.login = login;
        this.reportees = reportees;

    }

    @Then("user clicks on Reportees tab")
    public void user_clicks_on_reportees_tab()
    {
        reportees.clickreportees();
    }

    //    @Then("user clicks on fname edit reportees")
//    public void user_clicks_on_fname_edit_reportees()
//    {
//        reportees.editfname();
//    }
    @Then("user clicks on  fname edit reportees")
    public void user_clicks_on_fname_edit_reportees()
    {
        reportees.editfname();
    }

    @Then("user edits laname")
    public void user_edits_laname() {
        reportees.editlname();
    }

    @Then("user clicks on update button")
    public void user_clicks_on_update_button()
    {
        reportees.submit();
    }

    @Then("enter the valid details & click on login button")
    public void enter_the_valid_details_and_click_on_login_button()
    {
        login.login();
    }

    @Then("user clicks on Reportees tab1")
    public void user_clicks_on_reportees_tab1()
    {
        reportees.clickreportees();
    }

    @Then("user clicks on edit reportees user edit fname and enter invalid deatils")
    public void user_clicks_on_edit_reportees_user_edit_fname_and_enter_invalid_deatils()
    {
        reportees.invalidfname();
    }

    @Then("user edits lname and enter invalid details")
    public void user_edits_lname_and_enter_invalid_details()
    {
        reportees.invalidlname();
    }

    @Then("user clicks on cancel button")
    public void user_clicks_on_cancel_button()
    {
        reportees.Cancel();
    }

    @When("user opens the url enter valid details and click on login button")
    public void user_opens_the_url_enter_valid_details_and_click_on_login_button()
    {
        login.login();
    }

    @Then("user clicks on Reportees tab2")
    public void user_clicks_on_Reportees_tab2() {
        reportees.clickreportees();
    }

    @Then("user clicks on  fname edit reportees1")
    public void user_clicks_on_fname_edit_reportees1() {
        reportees.editfname();
    }

    @Then("user edits laname1")
    public void user_edits_laname1() {
        reportees.editlname();
    }

    @Then("user clicks on drodown")
    public void user_clicks_on_drodown() {

    }

    @When("select Option 2 from the dropdown")
    public void select_Option2_from_the_dropdown()
    {
        reportees.dropdown();
    }

    @Then("The selected option should be Option 2")
    public void theSelectedOptionShouldBeOption2()
    {

    }

    @And("user clicks on edit button")
    public void userClicksOnEditButton() {
        reportees.clickEditButton();
    }

    @And("User clicks on dropdownedit button")
    public void userClicksOnDropdowneditButton()
    {
        reportees.clickEditButton();
    }

    @When("select required option")
    public void selectRequiredOption()
    {
        reportees.clickEditButton();
    }

    @And("user clicks on view button")
    public void userClicksOnViewButton()
    {
        reportees.viewButton();
    }

    @And("User clicks on edit button of email {string}")
    public void userClicksOnEditButtonOfEmail(String email)
    {
        reportees.clickEdit(email);
    }

    @And("User clicks on view button of email {string}")
    public void userClicksOnViewButtonOfEmail(String email) {
        reportees.clickview(email);
    }

    @Then("verify the text on view window")
    public void verifyTheTextOnViewWindow() {
        reportees.verifytextPE();
    }

    @Then("user edits email id")
    public void userEditsEmailId()
    {
        reportees.Expiryemail();
    }

    @Then("verify the text on view window of Pricipal")
    public void verifyTheTextOnViewWindowOfPricipal()
    {
        reportees.principalverification();
    }

    @Then("user clicks on Email arrow")
    public void userClicksOnEmailArrow()
    {
        reportees.Arrow();
        Base.sleep(2000);
        List<String> emailList = reportees.getEmailList();
        List<String> emailList2 = emailList.stream().map(email->
                {
            String mail = null;
            email=email.toLowerCase();
            if(email.indexOf("+")==-1){
                mail = email;
            }else {
                mail = email.substring(0,email.indexOf("+"));
            }
            return mail;
        }
        ).collect(Collectors.toList());
        Assert.assertTrue(emailList2.stream().sorted().collect(Collectors.toList()).equals(emailList2),emailList + " not sorted");
    }
}
