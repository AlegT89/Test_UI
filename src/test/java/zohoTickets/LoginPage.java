package zohoTickets;

import baseTest.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath="//*[@id='header']/div[3]/div[3]/a[1]")
    private WebElement signIN;

    @FindBy(xpath="//*[@id='login_id']")
    private WebElement emailField;

    @FindBy(xpath="//*[@id='nextbtn']")
    private WebElement nextButton;

    @FindBy(xpath="//*[@id='password']")
    private WebElement passField;

    @FindBy(xpath="//*[@id='nextbtn']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@class='blue_btn continue_button']")
    private WebElement continueButton;

    @FindBy(xpath="//a[@aria-label='Add New Ticket']")
    private WebElement addTicketButton;

        public LoginPage() {

        driver.get("https://www.zoho.com/desk/lp/logout.html");
        PageFactory.initElements(driver, this);
    }

    public MainPage authorization(String mail, String password) {
        signIN.click();
        emailField.sendKeys(mail);
        nextButton.click();
        passField.sendKeys(password);
        signInButton.click();
        continueButton.click();
        addTicketButton.click();
        return new MainPage();

    }


}
