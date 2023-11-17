package stepDefinitions;

import io.cucumber.java.en.Then;
import object.Login;
import object.Logout;
import object.Project;
import object.Reportees;
public class Logoutstep
{
    Login login;
    Logout logout;
    public Logoutstep(Logout logout, Login login)
    {
        this.login = login;
        this.logout = logout;
    }
    @Then("user clicks on profile icon")
    public void userClicksOnProfileIcon()
    {
        logout.logout();
    }

    @Then("user clicks on Logout arrow")
    public void userClicksOnLogoutArrow()
    {
        logout.logoutarrow();
    }
}
