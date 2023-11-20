package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import util.Base;

import java.util.ArrayList;
import java.util.List;

public class Reportees extends Base {
    WebDriver driver;

    public Reportees() {
        super();
        PageFactory.initElements(driver(), this);
        this.driver = driver();

    }
    @FindBy(linkText = "Reportees")
    public WebElement clicking;
    @FindBy(xpath = "//div[text()='pradnya.ashte+pm2@coditas.com']/parent::div/parent::div//img[@alt='edit-details-button']/parent::button")
    public WebElement reporteesEditButton;
    @FindBy(xpath = "//div[text()='pradnya.ashte+pm2@coditas.com']/parent::div/parent::div//img[@alt='view-details-button']/parent::button")
    public WebElement Viewbutton;
//    @FindBy(xpath = "//div[text()='priyanka.patil+PM2@coditas.com']/parent::div/parent::div//img[@alt='edit-details-button']/parent::button")
//    public WebElement pmreporteeseditbutton;
    @FindBy(css = "img[alt*='edit-details-button']")
    public WebElement clicking2;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement fname;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lname;
    // @FindBy(id="react-select-12-input")
    //public WebElement dropdown;
    @FindBy(xpath = "//input[@placeholder='Enter Email']")
    public WebElement ExpiryEmail;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement editsubmit;
    @FindBy(xpath = "//button[contains(@class,'_button_16zlx_1 _white_16zlx_38 _small_16zlx_84  undefined')]")
    public WebElement Cancel;
    @FindBy(xpath = "//div[contains(@class,\"_container\")]/span[text()='Project Engineer']")
    public WebElement projectManager;
    @FindBy(xpath = "//div[contains(@class,\"_container\")]/span[text()='Principal']")
    public WebElement principal;
    @FindBy(xpath = "//img[@alt='indicator-arrow']/parent::div")
    public WebElement dropdownArrow;
    @FindBy(xpath = "//div[contains(text(),'Email')]")
    public WebElement Email;
    @FindBy(xpath = "//div[@class='_title_1uj6z_16']")
    public WebElement verify;
    @FindBy(xpath = "//div[text()='Last Name']")
    public WebElement lnamesorting;
    @FindBy(xpath = "//div[contains(text(),'Email')]")
    public WebElement Emailsorting;

    @FindAll(@FindBy(xpath = "//div[@data-props-id=\"email\"]/div"))
    public List<WebElement> emailLocater;
//    @FindBy(xpath = "//div[@class='InovuaReactDataGrid__column-header__content InovuaReactDataGrid__box--ellipsis'][starts-with(text(),'Email')]")
//    public WebElement sorting;

//    @FindBy(xpath = "//div[@class='_title_1uj6z_16']")
//    public WebElement Principalverifytext;


    //    @FindBy(xpath="//input[@name='firstName']")
//    public WebElement invalidfname;
//    @FindBy(xpath = "//input[@name='lastName']")
//    public WebElement invalidlname;
//    @FindBy(xpath = "//button[@type='submit']")
//    public WebElement grayedoutsubmit;
    public void clickreportees() {
        Clickonjs(clicking);
//        waitAndJSClick(clicking2);
    }

    public void editfname() {
        fname.clear();
        fname.sendKeys("Vishal");

    }

    public void editlname() {
        lname.clear();
        lname.sendKeys("reddy");

    }

    public void Expiryemail() {
        ExpiryEmail.clear();
        ExpiryEmail.sendKeys("pradnya.ashte+expiryemail04@coditas.com");
    }


    public void clickEditButton() {
        Clickonjs(reporteesEditButton);
        //waitAndJSClick(pmreporteeseditbutton);

    }

    public void submit() {
        Clickonjs(editsubmit);
        //driver.navigate().refresh();
    }

    public void invalidfname() {
        fname.clear();
        waitForElement(fname);
        //fname.sendKeys("1234");
        sendValueToTextfield(fname, "4556@");

    }

    public void invalidlname() {
        lname.clear();
        waitForElement(lname);
        //lname.sendKeys("0909");
        sendValueToTextfield(lname, "@@@@");

    }

    public void Cancel() {
        waitForElement(Cancel);
        Cancel.click();
    }

    public void editfname1() {
        fname.clear();
        fname.sendKeys("Piyush");

    }
    public void editlname2() {
        lname.clear();
        lname.sendKeys("Deshpande");
    }
    public void dropdown() {
        waitAndClick(dropdownArrow);
        Clickonjs(projectManager);
    }
    public void viewButton() {
        Clickonjs(Viewbutton);
    }
    public void Arrow()
    {
        Clickonjs(Emailsorting);
        //Emailsorting.click();
    }
    @FindAll(@FindBy(xpath = "//div[@data-state-props-id=\"email\"]"))
    public List<WebElement> emailList;

    public void clickEdit(String email) {
        for (WebElement element : emailList) {
            // Check the text of each link and click on a specific link
            String linkText = element.getText();
            if (linkText.equals(email)) {
                System.out.println(linkText + " : matched");
                String editBtnLocater = "//div[text()='%email']/parent::div/parent::div//img[@alt='edit-details-button']/parent::button";
                editBtnLocater = editBtnLocater.replace("%email", email);
                WebElement editBtn = driver.findElement(By.xpath(editBtnLocater));
                Clickonjs(editBtn);
            } else {
                System.out.println(linkText + " : not matched");
            }
        }
    }
    public List<String> getEmailList(){
        List<String> emailList = new ArrayList<>();
        for (WebElement email:this.emailLocater) {
            emailList.add(email.getText());
        }
        return emailList;
    }

    public boolean isEmailListSorted(List<String> emailList){
        return isListSorted(emailList);
    }
    public void clickview(String email) {
        for (WebElement element : emailList) {
            // Check the text of each link and click on a specific link
            String linkText = element.getText();
            if (linkText.equals(email)) {
                System.out.println(linkText + " : matched");
                String viewBtnLocater = "//div[text()='%email']/parent::div/parent::div//img[@alt='view-details-button']/parent::button";
                viewBtnLocater = viewBtnLocater.replace("%email", email);
                WebElement editBtn = driver.findElement(By.xpath(viewBtnLocater));
                Clickonjs(editBtn);
            } else {
                System.out.println(linkText + " : not matched");
            }
        }
    }
    public void verifytextPE()
    {
        String actualText = verify.getText();
        String expectedText = "No PO Assigned";
        Assert.assertEquals(expectedText, actualText);
        if (actualText.equals(expectedText))
        {
            System.out.println("Text verification Passed.");
        } else
        {
            System.out.println("Text verification failed.");
        }
    }
    public void principalverification()
        {
            String actualText1 = verify.getText();
            String expectedText1 = "No Projects Added";
            Assert.assertEquals(expectedText1, actualText1);
            if (actualText1.equals(expectedText1))
            {
                System.out.println("Text verification Passed.");
            } else
            {
                System.out.println("Text verification failed.");
            }
        }
    }




