package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.Base;
import util.Upload;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.List;

public class Project extends Base {
    WebDriver driver;


    public Project() {
        super();
        PageFactory.initElements(driver(), this);
        this.driver = driver();

    }
//    @FindBy(xpath="//img[@alt='edit'])[1]")
//    public WebElement Editprojectbtn;
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[4]/button[1]")
    public WebElement Editprojectbtn;
    @FindBy(xpath = "//input[@placeholder='Enter Project Name']")
    public WebElement Editprojectname;
    @FindBy(xpath = "//input[@placeholder='Add Project’s Planview ID']")
    public WebElement Planviewid;
    @FindBy(xpath = "(//input[@placeholder='Enter Budget'])[1]")
    public WebElement Budget;
    @FindBy(css = "button[type='submit']")
    public WebElement save;
    @FindBy(css="button[type='button'] span")
    public WebElement cancel;
    @FindBy(css="div[class=' css-1xjjmxq']")
    public WebElement projectdropdown;
    @FindBy(xpath="//div[@class=' css-v272hl-option']")
    public WebElement option1;

    @FindBy(xpath="(//div[text()='BHP']/parent::div/preceding-sibling::div/img[contains(@alt,'chevron-down-icon')])[2]")
   // @FindBy(xpath="(//div[text()='Video']/parent::div/preceding-sibling::div/img[contains(@alt,'chevron-down-icon')])[2]")
    public WebElement accordation;
    //@FindBy(xpath="//div[contains(@class,'accordionContent')]//img[@alt='edit-button']/parent::button")
    @FindBy(xpath ="//div[@data-name='scroller']//img[@alt='edit-button']/parent::button")
    public WebElement editphase;
    @FindBy(xpath ="//div[@class=' css-1xjjmxq']")
    public WebElement projectphaseoption;
   // @FindBy(xpath ="//div[@class=' css-v272hl-option']")
    @FindBy(xpath ="//div[@class=' css-shkbjf-option'][2]")
    public WebElement editphaseoption;
    @FindBy(name ="stretch")
    public WebElement Strech;
    @FindBy(name ="target")
    public WebElement Target;
    @FindBy(name ="thresholds")
    public WebElement Threshold;
    @FindBy(xpath ="//button[contains(.,'Save')]")
    public WebElement editphasesave;
    @FindBy(xpath ="//p[contains(text(),\"This should not be greater than or equal to 'Target'\")]")
    public WebElement invalideditphaseerrormsg;
    @FindBy(xpath ="(//p[contains(@class,'_error_jfjqt_11')])[2]")
    public WebElement invalideditphaseerrormsg2;
    @FindBy(xpath="//div[contains(@class,'accordionContent')]//img[@alt='view-button']/parent::button")
    public WebElement viewphase;
    @FindBy(xpath="//ul/li[3]")
    public WebElement viewactuals;
    @FindBy(xpath="//button[contains(.,'Upload')]")
    public WebElement upload;
    @FindBy(css="img[alt='upload-icon']")
    public WebElement icon;
//    @FindBy(xpath = "(//*[name()='svg' and @class='InovuaReactDataGrid__column-header__filter-settings-icon'])[4]")
    @FindBy(xpath = "(//div[@class='InovuaReactDataGrid__column-header__filter-settings'])[6]//*[local-name()='svg']")
    public WebElement filterclick;
    @FindBy(xpath = "//tr[contains(.,'Equals')]")
    public WebElement filtereuals;
    @FindBy(xpath = "//tr[@class='inovua-react-toolkit-menu__row']//td[2]")
    public WebElement elementList ;
    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement Filtertext;
    @FindBy(xpath = "//img[@alt='upload-icon']")
    public WebElement uploadfile;
    @FindBy(xpath = "(//button[contains(@class,'undefined')])[3]")
    public WebElement Done;
    @FindBy(css = ".Toastify__toast-body")
    public WebElement tostermsg;

    public void Projecttabedit() {
        Clickonjs(Editprojectbtn);
    }
    public void Projecttabedit(String projectName) {
        String editBtnLocater = "//div[text()='%s']/ancestor::div[@class='_accordionRoot_7qiz9_1 _accordion_xrrvt_58']//button";
        editBtnLocater = editBtnLocater.replace("%s",projectName);
        WebElement Editprojectbtn = driver.findElement(By.xpath(editBtnLocater));
        Clickonjs(Editprojectbtn);
    }

    public void Phasetabedit(String phaseName) {
        String editBtnLocater = "//div[text()='%s']/ancestor::div[@class='_accordionRoot_7qiz9_1 _accordion_xrrvt_58']//button";
        editBtnLocater = editBtnLocater.replace("%s",phaseName);
        WebElement Editphasebtn = driver.findElement(By.xpath(editBtnLocater));
        Clickonjs(Editprojectbtn);
    }
//    public void radiobutton(String buttonname)
//    {
//        String listelement = "//tr[@class='inovua-react-toolkit-menu__row']//td[2]";
//        editBtnLocater = editBtnLocater.replace("%s",buttonname);
//        WebElement radiobutton = driver.findElement(By.xpath(editBtnLocater));
//        Clickonjs(radiobutton);
//
//
//    }

    public void pnameedit() {
        Editprojectname.clear();
        Editprojectname.sendKeys("Ambry");
    }
    public void planviewid() {

        Planviewid.clear();
        Planviewid.sendKeys("1622");
    }
    public void Budget()
    {
        Budget.clear();
        Budget.sendKeys("50000");
    }
   public void  projectclick() {
        Clickonjs(save);
    }
    public void projectdropdown()
    {
        Clickonjs(projectdropdown);
        Clickonjs(option1);
    }

//public void select() throws InterruptedException
//{
//    Thread.sleep(2000);
//    waitAndJSClick(optionselect);
//}
public void Accord()
{
    Clickonjs(accordation);
}
    public void Accord(String projectName)
    {
        String accordianLocater = "//div[text()='%s']/parent::div/preceding-sibling::div/img[contains(@alt,'chevron-down-icon')]";
        accordianLocater = accordianLocater.replace("%s",projectName);
        WebElement accordian = driver.findElement(By.xpath(accordianLocater));
        Clickonjs(accordian);
    }
public void editphase()
{
  Clickonjs(editphase);
}
public void Editphasedropdown()
{

    waitAndClick(projectphaseoption);
    waitAndClick(editphaseoption);
}
//    public void Selectsoptions()
//    {
//        waitAndJSClick(optionselect);
//    }
    public void editphasestrach1() {

        Strech.clear();
        Strech .sendKeys("10");
    }
    public void phaseTarget() {

        Target.clear();
        Target .sendKeys("100");
    }

    public void editphasestresold() {

        Threshold.clear();
        Threshold .sendKeys("1000");
    }
    public void EDITPHASESAVE() {

       Clickonjs(editphasesave);
    }
    public void invaliderror()
    {
        Strech.clear();
        Strech .sendKeys("7000");
        System.out.println(invalideditphaseerrormsg.getText());
    }
    public void viewphase()
    {
        Clickonjs(viewphase);
    }
    public void viewactuals()
    {
         waitAndClick(viewactuals);
       // Assert.assertTrue(driver.getCurrentUrl().contains("viewactuals"));
    }
    public void upload()
    {
        waitAndClick(upload);
    }

    public void uploadicon()
    {
        JSClick(icon);
        Upload.file("C:\\Users\\Coditas\\Desktop\\Automation\\CSV\\act01CSV .csv");
    }
    public void uploadiconinvalid()
    {
        JSClick(icon);
        Upload.file("C:\\Users\\Coditas\\Downloads\\inv.csv");
    }
    public void done()
    {
        JSClick(Done);
    }
    public void toster()
    {
        Assert.assertTrue(isElementVisible(tostermsg),tostermsg+ "is not visible");
        String expectedText = "Unique Personnel Numbers added to ‘Employees’!";
        String actualText = tostermsg.getText();

        Assert.assertEquals(actualText,expectedText,"Expected: "+expectedText+ "\n Found: "+actualText);
        System.out.println("Expected: "+expectedText+ "\n Found: "+actualText);

    }
    public void filter()
    {
        //Base.sleep(2000);
      actionClick(filterclick);
    }
    public void filteroption()
    {
        Clickonjs(filtereuals);
    }
    public void list()
    {
        waitAndClick(elementList);
    }
    public void filtertext()
    {
        Clickonjs(Filtertext);
        sendValueToTextfield(Filtertext, "USD");
    }
    @FindAll(@FindBy(xpath = "//tr" + "[@class='inovua-react-toolkit-menu__row']//td[2]"))
    public List<WebElement> radiobuttonLocater;

    public void userClicksFilteroption(String option)
    {
        for (int i=0;i<radiobuttonLocater.size();i++)
        {
            WebElement radio = radiobuttonLocater.get(i);
            if(radio.getText().equalsIgnoreCase(option))
             {
                 waitAndClick(radio);
                break;
            }
//            public void fileupload()
//            {
//
//                Robot robot = new Robot();
//                StringSelection stringSelection = new StringSelection("");
//                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//
//
//            }
//            public void userClicksFilteroption2(String option)
//            {
//                for (int i=0;i<radiobuttonLocater.size();i++)
//                {
//                    WebElement radio = radiobuttonLocater.get(i);
//                    if(radio.getText().equalsIgnoreCase(option))
//                    {
//                        waitAndClick(radio);
//                        break;
//                    }
        }
//        WebElement rd= driver().findElement(By.xpath("//tr[@class='inovua-react-toolkit-menu__row']//td[contains(text(),'"+option+"')]"));
//        sleep(2000);
//        waitAndClick(rd);
    }
}






