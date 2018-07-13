package com.qa.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard {
    @FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a")
    WebElement pimButton;

    @FindBy(id = "menu_pim_addEmployee")
    WebElement addEmployeeButton;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "middleName")
    WebElement middleName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"location_inputfileddiv\"]/div/input")
    WebElement location;

    @FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
    WebElement addLoginDetails;

    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"adminRoleId_inputfileddiv\"]/div/input")
    WebElement adminRole;

    @FindBy(id = "systemUserSaveBtn")
    WebElement saveButton;

    @FindBy(id = "menu_pim_viewEmployeeList")
    WebElement employeeListButton;

    @FindBy(id = "employee_name_quick_filter_employee_list_value")
    WebElement employeeSearchBar;

    @FindBy(xpath = "//*[@id=\"employeeListTable\"]/tbody/tr/td[3]")
    WebElement selectEmployee;

    public void clickPimButton(){
        pimButton.click();
    }

    public void clickAddEmployeeButton(){
        addEmployeeButton.click();
    }

    public void addEmployee(String inputFirstName, String inputMiddleName, String inputLastName){
        firstName.sendKeys(inputFirstName);
        middleName.sendKeys(inputMiddleName);
        lastName.sendKeys(inputLastName);
        location.click();
        location.sendKeys("l");
        location.click();
    }

    public void clickCreateLoginDetailsButton(){
        addLoginDetails.click();
    }

    public void fillLoginDetails(String inputUserName, String inputPassword){
        userName.sendKeys(inputUserName);
        password.sendKeys(inputPassword);
        confirmPassword.sendKeys(inputPassword);
        adminRole.click();
        adminRole.sendKeys("g");
        adminRole.click();
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public void viewNewEmployee(String search){
        employeeListButton.click();
        employeeSearchBar.click();
        employeeSearchBar.sendKeys(search);
    }

    public void inspectNewEmployee(){
        selectEmployee.click();
    }
}
