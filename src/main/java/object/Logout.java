package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Base;

public class Logout extends Base
{
    public Logout()
    {
        PageFactory.initElements(driver(), this);
    }
    @FindBy(css = "img[alt='default-profile']")
    public WebElement logout;
    @FindBy(css = "img[alt='icon']")
    public WebElement logouticon;
    public void logout()
    {
        JSClick(logout);
    }
    public void logoutarrow()
    {
        JSClick(logouticon);
    }
}
