package selenium_main;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Controller_Page {

    @FindBy(xpath = "//*[@id=\"resource_owner-rest-controller\"]/div/h2/a")
    WebElement ownerRestControllerButton;

    @FindBy(xpath = "//*[@id=\"owner-rest-controller_getOwnersUsingGET\"]/div[1]/h3/span[2]/a")
    WebElement getRequestButton;

    @FindBy(xpath = "//*[@id=\"owner-rest-controller_getOwnersUsingGET_content\"]/form/div[3]/input")
    WebElement submitButton;

    public void clickOwnerRestControllerButton(){
        ownerRestControllerButton.click();
    }

    public void clickGetRequestButton(){
        getRequestButton.click();
    }

    public void clickSubmitButton(){
        submitButton.click();
    }
}
