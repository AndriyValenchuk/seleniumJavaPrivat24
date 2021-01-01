package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MobilePhoneReplenishmentPage.class);
    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By buttonSubmitToTheCard = By.xpath("//button[@data-qa-node='submit']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By paymentDetails = By.xpath("//span[@data-qa-node='details']");

    /**
     *
     * Choose a card from the wallet
     */
    public MobilePhoneReplenishmentPage selectCardFromWallet(){
        driver.findElement(buttonWallet).click();
        return this;
    }
    /**
     * Enter phone number excluding country code
     * @param number phone number
     */
    public MobilePhoneReplenishmentPage enterPhoneNumber(String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }
    /**
     *
     * Enter how many money you take
     */
    public MobilePhoneReplenishmentPage enterAmount(String amount){
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }
    /**
     *
     * Enter card number for payment
     */
    public MobilePhoneReplenishmentPage enterCardFrom(String card){
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    /**
     *
     *  Enter card validation term
     */
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate){
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }
    /**
     *
     *  Enter card CVV code
     */
    public MobilePhoneReplenishmentPage enterCardCvv(String cvv){
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }
    /**
     *
     * Click a button "To the card"
     */
    public MobilePhoneReplenishmentPage submitToTheCar() {
        driver.findElement(buttonSubmitToTheCard).click();
        return this;
    }

    /**
     *
     * @param text
     *
     */
    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentInTheCart(String text)
    {
        waitElementIsVisible(driver.findElement(paymentDetails));
        WebElement details = driver.findElement(paymentDetails);
        Assertions.assertEquals(text,details.getText());
        return this;
    }
}
