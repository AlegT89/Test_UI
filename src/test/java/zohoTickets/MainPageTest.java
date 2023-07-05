package zohoTickets;

import baseTest.BaseTest;
import helper.TestValues;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest extends BaseTest {



    @Test
    public void checkTicket(){

        TicketPage ticketPage = new LoginPage()
                .authorization(TestValues.ADMIN_MAIL, TestValues.ADMIN_PASSWORD)
                .createTicket(TestValues.TEST_NAME, TestValues.TEST_ACCOUNT, TestValues.TEST_EMAIL,
                              TestValues.TEST_PHONE, TestValues.TEST_SUBJECT);

        Assert.assertTrue(ticketPage.getTitle().contains(TestValues.TEST_SUBJECT));
        Assert.assertEquals(ticketPage.getEmail(), TestValues.TEST_EMAIL);

    }

}