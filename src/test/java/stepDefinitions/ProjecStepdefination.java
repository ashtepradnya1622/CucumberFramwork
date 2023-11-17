package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import object.Login;
import object.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Base;

public class ProjecStepdefination {
    Login login;
    Project Project;

    public ProjecStepdefination(Project Project, Login login) {
        this.login = login;
        this.Project = Project;

    }

    @Then("User clicks on edit button of project tab")
    public void user_clicks_on_edit_button_of_project_tab() {
        Project.Projecttabedit();
    }
    @Then("user clicks edits button of {string} project")
    public void userClicksEditsButtonOfProject(String projectName) {
        Project.Projecttabedit(projectName);

    }

    @Then("user edits project name")
    public void user_edits_project_name() {
        Project.pnameedit();
    }

    @Then("user edits planviewid")
    public void userEditsPlanviewid() {
        Project.planviewid();
    }

    @Then("user edits Project Budget")
    public void userEditsProjectBudget() {
        Project.Budget();
    }

    @Then("user clicks on save button")
    public void userClicksOnSaveButton() {
        Project.projectclick();
    }

//    @Then("user clicks on drop down and select the option 1 from drop down")
//    public void userClicksOnDropDownAndSelectTheOptionFromDropDown() throws InterruptedException {
//        Thread.sleep(2000);
//        Project.projectdropdown();
//        Project.select();
//    }

//    @Then("User clicks on edit button of project phase")
//    public void userClicksOnEditButtonOfProjectPhase()
//    {
//        Project.editphase();
//    }

    @Then("user clicks on accrodation")
    public void userClicksOnAccrodation() {
        Project.Accord();
    }
    @Then("user clicks on {string} project accrodation")
    public void userClicksOnProjectAccrodation(String projectName)
    {
        Project.Accord(projectName);
    }

    @Then("User clicks on edit button of project phase")
    public void userClicksOnEditButtonOfProjectPhase()
    {
        Project.editphase();

    }

    @Then("User clicks on project phase")
    public void userClicksOnProjectPhase() {
        Project.Editphasedropdown();
    }

    @Then("user edit the Strech field")
    public void userEditTheStrechField() {
        Project.editphasestrach1();

    }

    @Then("user edits target field")
    public void userEditsTargetField() {
        Project.phaseTarget();

    }

    @Then("user edits Threshold field")
    public void userEditsThresholdField() {
        Project.editphasestresold();
    }

    @Then("user clicks on save button of edit project phase")
    public void userClicksOnSaveButtonOfEditProjectPhase() {
        Project.EDITPHASESAVE();
    }

//    @Then("user slectes option 2 from drop down of edit project phase")
//    public void userSlectesOptionFromDropDownOfEditProjectPhase() {
//        Project.Selectsoptions();
//    }


//    @Then("user clicks on drop down and select option 2 from drop down of edit project phase")
//    public void userclicksondropdown and select option 2 from drop down of edit project phase()
//    {
//        Project.Editphasedropdown();
//    }

    @Then("user clicks on view button of project phase")
    public void userClicksOnViewButtonOfProjectPhase() {
        Project.viewphase();
    }

    @Then("user clicks on Actuals tab")
    public void userClicksOnActualsTab() {
        Project.viewactuals();
    }

//    @Then("user clicks on drop down and select option {int} from drop down of edit project phase")
//    public void userClicksOnDropDownAndSelectOptionFromDropDownOfEditProjectPhase()
//    {
//Project.
//    }

    @And("clicks on upload button")
    public void clicksOnUploadButton() {
        Project.upload();
    }

    @And("clicks on upload icon")
    public void clicksOnUploadIcon()
    {
        Project.uploadicon();
    }

    @Then("user clicks on drop down and select option 2 from drop down of edit project phase")
    public void userClicksOnDropDownAndSelectOption2FromDropDownOfEditProjectPhase()
    {
        Project.Editphasedropdown();
    }

    @Then("user clicks on drop down and select the option 2 from drop down")
    public void user_clicks_on_drop_down_and_select_the_option_2_from_drop_down()
    {
        Project.Editphasedropdown();
    }

    @Then("user edit the Strech field and enter the invalid deatils")
    public void userEditTheStrechFieldAndEnterTheInvalidDeatils()
    {
       Project.invaliderror();
    }

    @And("user clicks on filter section")
    public void userClicksOnFilterSection()
    {
        Base.sleep(3000);
        Project.filter();
    }

//    @And("user clicks on euals filter option")
//    public void userClicksOnEualsFilterOption()
//    {
//        Project.filteroption();
//    }

    @And("user clicks {string} filteroption")
    public void userClicksFilteroption(String option)
    {
        Project.userClicksFilteroption(option);
    }

    @Then("clicks in Done button")
    public void clicksInDoneButton()
    {
        Project.done();
    }

    @Then("User is able to see the toster message on top")
    public void userIsAbleToSeeTheTosterMessageOnTop() {
        Project.toster();
    }

    @And("clicks on uploadinvalid  icon")
    public void clicksOnUploadinvalidIcon()
    {
        Project.uploadiconinvalid();
    }




//    @And("user enters the text into text filed")
//    public void userEntersTheTextIntoTextFiled() {
//        Project.filtertext();
//    }
}

//    @And("user clicks on {string} filter option")
//    public void userClicksOnFilterOption(String radiobutton)
//    {
//        Project.radiobutton();
//    }
//}

