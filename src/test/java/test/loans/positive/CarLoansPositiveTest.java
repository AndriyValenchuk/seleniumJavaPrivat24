package test.loans.positive;

import org.junit.jupiter.api.Test;
import pages.loans.CarLoancePage;
import test.base.BaseTest;

import static constants.Constant.Urls.CAR_LOANS_PAGE;

public class CarLoansPositiveTest extends BaseTest {

    @Test
    public void selectAgreementsTabInPublicSession(){
        basePage.goToUrl(CAR_LOANS_PAGE);
        carLoancePage.selectAgreementsTab();
        basePage.isAuthWidgetPresent();
    }

}
