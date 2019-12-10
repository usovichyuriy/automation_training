package by.bsu.rent.page;

import by.bsu.rent.model.Account;
import by.bsu.rent.model.PageError;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegisterPage extends AbstractPage {
    private static final Logger LOGGER = LogManager.getRootLogger();
    private final String REGISTER_PAGE_URL = "https://www.lufthansa.com/by/en/registration";
    private final WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
    }

    public RegisterPage openPage() {
        driver.navigate().to(REGISTER_PAGE_URL);
        LOGGER.info("Register page opened");
        return this;
    }

    @FindBy(xpath = "//input[@id=\"email-input\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id=\"password-input\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "emailError")
    private WebElement emailError;

    @FindBy(id = "registerButton")
    private WebElement registerButton;


    public RegisterPage fillFromParameters(Account params) {
        params.getEmail().ifPresent(this::inputEmail);
        params.getPassword().ifPresent(this::inputPassword);
        params.getAgainPassword().ifPresent(this::inputPasswordAgain);
        LOGGER.info("Parameters are entered");
        return this;
    }


    public void inputEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
        LOGGER.info("Entered email is: " + email);
        focusAway();
    }

    public void inputPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
        LOGGER.info("Entered password is: " + password);
        focusAway();
    }

    public void inputPasswordAgain(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
        LOGGER.info("Entered password again is: " + password);
        focusAway();
    }

    public boolean checkEmailErrorMessage(PageError errorMessage) {
        return emailError.isDisplayed() && emailError.getText().contains(errorMessage);
    }

    public void clickToRegister() {
        registerButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
