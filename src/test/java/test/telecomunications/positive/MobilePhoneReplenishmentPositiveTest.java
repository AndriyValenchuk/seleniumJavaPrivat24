package test.telecomunications.positive;

import org.junit.jupiter.api.Test;
import test.base.BaseTest;


import static constants.Constant.MobileReplenishmentTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {


    @Test
    public void checkIsRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumReplenishmentAmount(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.
                enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("100")
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCardCvv(MOBILE_PAYMENT_CARD_CVV)
                .submitToTheCar()
                .checkPaymentDetailsIsPresentInTheCart("Mobile payment. Phone number +380502050515");

    }


}
