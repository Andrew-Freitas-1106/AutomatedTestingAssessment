package selenium_main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page {

    @FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/a")
    WebElement ownersTab;

    @FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/ul/li[1]/a")
    WebElement searchAllOwners;

    public void seeAllOwners(){
        ownersTab.click();
        searchAllOwners.click();
    }
}
