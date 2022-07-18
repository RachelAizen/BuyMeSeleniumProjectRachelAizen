import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Tests extends BasicPage{

    public static WebDriver driver;
    private static ExtentReports extent= new ExtentReports();
    private static ExtentTest test = extent.createTest("MyProject", "Sanity testing for BuyMe website.");

    @BeforeClass
    public void enterWebsite() throws Exception
    {Singleton.getDriverInstance();
    ExtentSparkReporter htmlReporter = new ExtentSparkReporter("C:\\Intel\\SELENIUM\\BuyMeSeleniumProjectRachelAizen\\src\\main\\resources\\data.xml");
    extent.attachReporter((htmlReporter));
    test.log(Status.INFO,"Open website before tests.");}

    @Test
    public void pressSignUpAndEnter() throws Exception
    {clickElement(By.className("notSigned"));}

    @Test
    public void pressSignUp() throws Exception
    {clickElement(By.className("test-link theme"));}

    @Test
    public void enterCredentials() throws Exception
    {String myName = "Rachel Aizen";
    sendKeysToElement(By.id("ember1817"),"Rachel Aizen");
    Assert.assertEquals(myName, "Rachel Aizen");

    String myGmail = "246rcl@gmail.com";
    sendKeysToElement(By.id("ember1824"),"246rcl@gmail.com");
    Assert.assertEquals(myGmail, "246rcl2gmail.com");

    String myPassword = "2246rcll";
    sendKeysToElement(By.id("valPass"), "2246rcll");
    Assert.assertEquals(myPassword, "2246rcll");

    String myPasswordValidation = "2246rcll";
    sendKeysToElement(By.id("ember1839"), "2246rcll");
    Assert.assertEquals(myPasswordValidation, "2246rcll");

    clickElement(By.className("check"));}

    @Test
    public void pressSigningUp() throws Exception
    {clickElement(By.id("ember2252"));}

    @Test
    public void pickPrice() throws Exception
    {Select myPriceSelection = new Select(driver.findElement(By.id("ember1067")));
    myPriceSelection.selectByVisibleText("100-199");}

    @Test
    public void pickRegion() throws Exception
    {Select myRegionSelection = new Select(driver.findElement(By.id("ember1101")));
    myRegionSelection.selectByVisibleText("ללא הסביבה");}

    @Test
    public void pickCategory() throws Exception
    {Select myCategorySelection = new Select(driver.findElement(By.id("ember1207")));
    myCategorySelection.selectByVisibleText("מתנות סוף שנה למורה ולגננת");}

    @Test
    public void pressFindMeAPresent() throws Exception
    {clickElement(By.id("ember2240"));}

    @Test
    public void assertURL() throws Exception
    {String URL = "https://buyme.co.il/search?budget=2&category=409@region=13";
    Assert.assertEquals(URL, "https://buyme.co.il/search?budget=2&category=409@region=13");}

    @Test
    public void pickBusiness() throws Exception
    {Select myPickedBusiness = new Select(driver.findElement(By.className("name bm-subtitles-1")));
    myPickedBusiness.selectByVisibleText("מסעדת בני הדייג");}

    @Test
    public void enterOrChooseAPrice() throws Exception
    {sendKeysToElement(By.id("ember3169"),"150");}

    @Test
    public void pressChoose() throws Exception
    {clickElement(By.id("ember3175"));}

    @Test
    public void pressForSomeoneElse() throws Exception
    {clickElement(By.id("ember5730"));}

    @Test
    public void enterReceiverName() throws Exception
    {sendKeysToElement(By.id("ember5734"), "Daniel Gotlib");}

    @Test
    public void pickAnEvent() throws Exception
    {Select myPickedEvent = new Select(driver.findElement(By.id("ember3397")));
    myPickedEvent.selectByVisibleText("יום הולדת");}

    @Test
    public void enterABlessing() throws Exception
    {sendKeysToElement(By.id("ember5745"), "יום הולדת שמח, דניאל!");}

    @Test
    public void pressContinue() throws Exception
    {clickElement(By.id("ember5755"));}

    @Test
    public void pressNow() throws Exception
    {clickElement(By.id("ember5864"));}

    @Test
    public void pickEmailOrSMS() throws Exception
    {clickElement(By.className("circle"));}

    @Test
    public void enterPhoneNumber() throws Exception
    {String myPhoneNumber = "0587966750";
    sendKeysToElement(By.id("ember5893"), "0587966750");
    Assert.assertEquals(myPhoneNumber, "0587966750");}

    @Test
    public void enterSenderName() throws Exception
    {String mySenderName = "Rachel Aizen";
    sendKeysToElement(By.id("ember5893"), "Rachel Aizen");
    Assert.assertEquals(mySenderName, "Rachel Aizen");}

    @Test
    public void pressGoToPay() throws Exception
    {clickElement(By.id("ember5898"));}



    @AfterClass
    public void endItAll()
    {driver.quit();
    extent.flush();}

}
