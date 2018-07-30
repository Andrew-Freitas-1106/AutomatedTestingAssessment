package selenium_test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium_main.Constant;
import selenium_main.Home_Page;
import selenium_main.Owner_Page;

import static org.junit.Assert.assertEquals;

public class FrontEnd_Test {
    static WebDriver driver;
    static ExtentReports report;
    ExtentTest test;

    @BeforeClass
    public static void startReport(){
        report = new ExtentReports(Constant.FILE_PATH1,true);
    }

    @Before
    public void setup(){
        System.setProperty(Constant.STRING_DRIVER,Constant.DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//        report = new ExtentReports(Constant.FILE_PATH1,true);
        test = report.startTest("Commence Test");
    }

    @After
    public void endTest(){
        report.endTest(test);
//        report.flush();
//        driver.quit();
    }

    @AfterClass
    public static void teardown(){
        report.flush();
        driver.quit();
    }

    @Test
    public void navigate_to_owner_page()throws Exception{
        driver.navigate().to(Constant.HOME_PAGE);

        //test.log(LogStatus.INFO,"WebPage opened");

        Home_Page home = PageFactory.initElements(driver,Home_Page.class);
        home.seeAllOwners();

        Thread.sleep(5000);

        //assertEquals(Constant.HOME_PAGE)
        test.log(LogStatus.PASS,"navigates to owner_page");
        assertEquals(Constant.OWNER_PAGE,driver.getCurrentUrl());

    }

    @Test
    public void add_new_owner()throws Exception{
        driver.navigate().to(Constant.OWNER_PAGE);
        Thread.sleep(3000);

        Owner_Page owner = PageFactory.initElements(driver,Owner_Page.class);

        owner.addNewOwner();

        test.log(LogStatus.PASS,"successfully added new owner");

    }

    @Test
    public void edit_existing_owner()throws Exception{
        driver.navigate().to(Constant.OWNER_PAGE);
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-owner-list/div/div/h2")));

        Owner_Page owner = PageFactory.initElements(driver,Owner_Page.class);

        owner.viewOwnerInformation();
        owner.editOwnerInformation();

        test.log(LogStatus.PASS,"successfully edited owner information");

    }
}
