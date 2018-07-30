package com.qa.test;

import com.qa.main.Constant;
import com.qa.main.DashBoard;
import com.qa.main.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestingOrangeHRM {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest tests;
    WebElement element;

    @Before
    public void setUp(){
        System.setProperty(Constant.STRING_DRIVER,Constant.DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        reports = new ExtentReports(Constant.FILE_PATH,true);
        tests = reports.startTest("Commence Test");
    }

    @After
    public void tearDown()throws InterruptedException{
        reports.endTest(tests);
        reports.flush();
        Thread.sleep(5000);
        driver.quit();
    }

    @Given("^the login page$")
    public void the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        //driver.get(Constant.HOMEPAGE);
        driver.navigate().to(Constant.HOMEPAGE);
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.logIn("Admin","AdminAdmin");

        assertEquals(Constant.HOMEPAGE,driver.getCurrentUrl());

    }

    @When("^I login$")
    public void i_login() {
        // Write code here that turns the phrase above into concrete actions
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickLogIn();
    }

    @When("^I click the PIM tab$")
    public void i_click_the_PIM_tab() {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().to(Constant.DASHBOARD);
        DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
        dash.clickPimButton();
    }

    @When("^then the Add Employee Tab$")
    public void then_the_Add_Employee_Tab() {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().to(Constant.ADDEMPLOYEE);
        DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
        dash.clickAddEmployeeButton();
    }

    @When("^I fill out the Employee Details correctly$")
    public void i_fill_out_the_Employee_Details_correctly() {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get(Constant.ADDEMPLOYEE);
        WebElement myDynamicElement = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        driver.navigate().to(Constant.ADDEMPLOYEE);
        DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
        dash.addEmployee("Jonathanxaxaxaxa","Edgar","Churchill");
    }

    @When("^I choose to create Login Details by clicking the appropriate button$")
    public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() {
        // Write code here that turns the phrase above into concrete actions
        DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
        dash.clickCreateLoginDetailsButton();

    }

    @When("^I fill out the Login Details correctly$")public void i_fill_out_the_Login_Details_correctly() {
        // Write code here that turns the phrase above into concrete actions
        DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
        Random rand = new Random();
        int  n = rand.nextInt(50000) + 100;
        dash.fillLoginDetails("JEChurchill15"+n,"!123qweASD");

    }

    @When("^I click the Save button$")
    public void i_click_the_Save_button() {//throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   driver.get(Constant.DASHBOARD);
        WebElement myDynamicElement = driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']/span[2]"));
      //  driver.navigate().to(Constant.DASHBOARD);
        DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
       // Thread.sleep(1000);
        dash.clickSaveButton();

    }
    @Then("^I can search for the Employee I have just created$")
    public void i_can_search_for_the_Employee_I_have_just_created() {
//        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//        driver.get(Constant.DASHBOARD);
//        WebElement myDynamicElement = driver.findElement(By.id("menu_pim_viewEmployeeList"));
//        driver.navigate().to(Constant.DASHBOARD);

        //WebElement myDynamicElement = (new WebDriverWait(driver, 1000)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='menu_pim_viewEmployeeList']/span[2]")));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
        dash.viewNewEmployee();
    }

    @Then("^select them for inspection$")public void select_them_for_inspection() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
        Thread.sleep(5000);
        dash.inspectNewEmployee();
    }
}
