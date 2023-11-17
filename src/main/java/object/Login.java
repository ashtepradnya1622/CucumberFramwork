package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Base;
import util.Env;
//import util.Env;

public class Login extends Base {
    public Login() {
        super();
        PageFactory.initElements(driver(), this);

    }

//    @FindBy(id = "form-control")
//    WebElement userid;
//
//            @FindBy(xpath = "//input[@placeholder='Enter your password']")
//            WebElement password;
//            @FindBy(xpath="//button[contains(@class,'_button_16zlx_1 _purple_16zlx_20 _medium_16zlx_81 _submitBtn_hbifk_1 false')]")
//            WebElement click;

    @FindBy(id = "form-control")
    public WebElement userid;
    @FindBy(xpath = "//input[@placeholder='Enter your password']")
    public WebElement pass;
    @FindBy(xpath = "//button[contains(.,'Log In')]")
    public WebElement click;
    @FindBy(xpath = "//p[@class='_error_jfjqt_11']")
    public WebElement errorMessage;
    @FindBy(css = "._error_1fvwz_10")
    public WebElement errorMessage2;
    //    @FindBy(css = "._error_jfjqt_11")
//    public WebElement errorMessage3;
//    @FindBy(xpath = "//p[@class='_error_1fvwz_10']")
//    public WebElement errorMessage4;
    @FindBy(xpath = "//button[contains(.,'Forgot password?')]")
    public WebElement forgot;
    @FindBy(id = "form-control")
    public WebElement LINK;
    @FindBy(xpath = "//button[@class='_button_16zlx_1 _purple_16zlx_20 _small_16zlx_84 _submitBtn_1vio7_1 false']")
    public WebElement click1;
    @FindBy(id = "form-control")
    public WebElement id1;
    @FindBy(id = "input[placeholder='Enter your password']")
    public WebElement pass2;
    @FindBy(xpath = "//button[contains(.,'Log In')]")
    public WebElement click2;
    @FindBy(xpath = "//a[text()='Projects']")
    public WebElement projecttab;
//    @FindBy(css = "._error_jfjqt_11")
//    public WebElement error1;

    public void openUrl() {
        driver().get(Env.config.url());
    }

    public void login() {
        openUrl();
        sendValueToTextfield(userid, Env.config.username());
        sendValueToTextfield(pass, Env.config.passowrd());
        Clickonjs(click);
        waitForElement(projecttab);
    }
    public void Blanklogin() {
        openUrl();
        Clickonjs(click);
        System.out.println(errorMessage.getText());
        System.out.println(errorMessage2.getText());
    }

    public void Invalidlogin()
    {
        openUrl();
        sendValueToTextfield(userid, Env.config.vname());
        sendValueToTextfield(pass, Env.config.ipass());
        Clickonjs(click);
        System.out.println(errorMessage.getText());
        driver().get(Env.config.url());
        sendValueToTextfield(userid, Env.config.name());
        sendValueToTextfield(pass, Env.config.pass1());
        Clickonjs(click);
        System.out.println(errorMessage2.getText());
    }

    public void Invalidlogin(String userId, String password)
    {
        openUrl();
        sendValueToTextfield(userid, userId);
        sendValueToTextfield(pass, password);
        Clickonjs(click);
        System.out.println(errorMessage.getText());
    }

//    public void Invalidlogin1()
//    {
//        openUrl();
//        sendValueToTextfield(userid, pass);
//        sendValueToTextfield(pass, Env.config.ipass());
//        waitAndJSClick(click);
//
//    }
    public void Forgotpassword()
    {
        openUrl();
        Clickonjs(forgot);
    }

    public void LINK()
    {
        sendValueToTextfield(userid, Env.config.emailid1());
    }

    public void click1()
    {
        Clickonjs(click1);
    }

}
