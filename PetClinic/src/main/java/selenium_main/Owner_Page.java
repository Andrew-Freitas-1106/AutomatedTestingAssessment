package selenium_main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Owner_Page {

    @FindBy(xpath = "/html/body/app-root/app-owner-list/div/div/div/table/tbody/tr[1]/td[1]/a")
    WebElement viewOwnerInformationClickable;

    @FindBy(xpath = "/html/body/app-root/app-owner-list/div/div/div/div/button")
    WebElement addNewOwnerButton;

    @FindBy(xpath = "/html/body/app-root/app-owner-detail/div/div/button[2]")
    WebElement editOwnerButton;

    @FindBy(id = "firstName")
    WebElement editFirstName;

    @FindBy(id = "lastName")
    WebElement editLastName;

    @FindBy(id = "address")
    WebElement editAddress;

    @FindBy(id = "city")
    WebElement editCity;

    @FindBy(id = "telephone")
    WebElement editTelephone;

    @FindBy(xpath = "/html/body/app-root/app-owner-edit/div/div/form/div[7]/div/button[2]")
    WebElement updateOwnerButton;

    @FindBy(xpath = "/html/body/app-root/app-owner-add/div/div/form/div[7]/div/button[2]")
    WebElement addOwnerButton;

    public void viewOwnerInformation(){
        viewOwnerInformationClickable.click();
    }

    public void editOwnerInformation(){
        editOwnerButton.click();
        editFirstName.sendKeys("Edward");
        editLastName.sendKeys("Rody");
        editAddress.sendKeys("123abc");
        editCity.sendKeys("Washington");
        editTelephone.sendKeys("6085558763");
        updateOwnerButton.click();
    }

    public void addNewOwner(){
        addNewOwnerButton.click();
        editFirstName.sendKeys("New");
        editLastName.sendKeys("Owner");
        editAddress.sendKeys("789uio");
        editCity.sendKeys("London");
        editTelephone.sendKeys("6085558763");
        addOwnerButton.click();
    }
}
