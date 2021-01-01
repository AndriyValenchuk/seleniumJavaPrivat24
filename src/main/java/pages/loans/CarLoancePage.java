package pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarLoancePage {

    WebDriver driver;

    public CarLoancePage(WebDriver driver) {
        this.driver = driver;
    }

    public final By tabAgreemenrs = By.xpath("//div[contains(text(), 'Agreements')]");

    public CarLoancePage selectAgreementsTab(){
        driver.findElement(tabAgreemenrs).click();
        return this;
    }

}
