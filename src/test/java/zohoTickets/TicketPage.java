package zohoTickets;

import baseTest.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage extends BasePage {

    @FindBy(xpath = "//a[@href='mailto:goodplan@mail.com']")
    private WebElement email;

    @FindBy(xpath = "//h1[@data-title='money debt']")
    private WebElement title;

    public TicketPage() {
        PageFactory.initElements(driver, this);
    }

    public String getEmail() {
       return email.getText();
    }

    public String getTitle() {
        return title.getText();
    }
}
