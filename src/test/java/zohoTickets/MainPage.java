package zohoTickets;

import baseTest.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {



    @FindBy(xpath="//input[@data-id='contactId']")
    private WebElement contactName;

    @FindBy(xpath="//input[@data-id='accountId']")
    private WebElement accountName;

    @FindBy(xpath="//input[@data-id='email']")
    private WebElement eMail;

    @FindBy(xpath="//input[@data-id='phone']")
    private WebElement phone;

    @FindBy(xpath="//input[@data-id='subject']")
    private WebElement subject;

    @FindBy(xpath="//input[@role='Menuitem'][@data-id='status_textBox']")
    private WebElement statusList;

    @FindBy(xpath="//li[@data-id='Open']")
    private WebElement statusOpen;

    @FindBy(xpath="//li[@data-id='On Hold']")
    private WebElement statusOnHold;

    @FindBy(xpath="//li[@data-id='Escalated']")
    private WebElement statusEscalated;

    @FindBy(xpath="//li[@data-id='Closed']")
    private WebElement statusClosed;

    @FindBy(xpath="//button[@data-id='saveButtonId']")
    private WebElement submitButton;

    public MainPage() {

        PageFactory.initElements(driver, this);

    }
    public TicketPage  createTicket(String contactNameValue, String accountNameValue, String eMailValue,
                                    String phoneValue, String subjectValue) {

        contactName.sendKeys(contactNameValue);
        accountName.sendKeys(accountNameValue);
        eMail.sendKeys(eMailValue);
        phone.sendKeys(phoneValue);
        subject.sendKeys(subjectValue);
        statusList.click();
        statusClosed.click();
        submitButton.click();

        return new TicketPage ();

    }

}
