package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private final String HOMEPAGE_URL = "https://www.lufthansa.com/by/en/lh-rentalcar?utm_medium=paidsearch&utm_source=google&utm_campaign=lh_by_en_nonbrand&utm_term=pfx&gclsrc=aw.ds&&subID=1388393346772869888&gclid=Cj0KCQiAtf_tBRDtARIsAIbAKe2OzmwTBRtbN7s8wff7neWHcq0giWLzl0-zDsq5FYS4ngl6pOe8TmMaAmZ3EALw_wcB&gclsrc=aw.ds";
    private final int WAIT_TIMEOUT_SECONDS = 20;

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(HOMEPAGE_URL);
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
    }

    @FindBy(xpath = "//input[@id='dcep-abcd37ad8-be43-45d2-a134-49ff8047f01f-flm-car-carQuery.rentalStationCode']")
    private WebElement pickUpLocationInput;

    @FindBy(xpath = "//input[@id='dcep-abcd37ad8-be43-45d2-a134-49ff8047f01f-flm-car-carQuery.returnStationCode']")
    private WebElement dropOffLocationInput;

    @FindBy(xpath = "//*[@id='dcep-tab-control-standalone14-rentalCar-section']/div/form/div[4]/div[3]/button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id='error-id-dcep-abcd37ad8-be43-45d2-a134-49ff8047f01f-flm-car-carQuery.rentalStationCode']")
    private WebElement locationError;

    @FindBy(xpath = "//*[@id='lid_input_54']")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id='lid_input_55']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id='pageSlideWrapper']/div/div[2]/form/div[1]/p")
    private WebElement emailError;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[2]/button/span")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id='dcep-tab-control-standalone24-lufthansaID-section']/div/form/div/div[2]/div/div/div/a")
    private WebElement registerButton;

    public void inputPickUpLocation(String pickUpLocation) {
        pickUpLocationInput.click();
        pickUpLocationInput.clear();
        pickUpLocationInput.sendKeys(pickUpLocation);
    }

    public void inputDropOffLocation(String dropOffLocation) {
        dropOffLocationInput.click();
        dropOffLocationInput.clear();
        dropOffLocationInput.sendKeys(dropOffLocation);
    }

    public void search() {
        searchButton.click();
    }

    public void inputEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
        passwordInput.click();
    }

    public boolean checkLocationErrorMessage(String errorMessage) {
        return locationError.isDisplayed() && locationError.getText().contains(errorMessage);
    }

    public boolean checkEmailErrorMessage(String errorMessage) {
        return emailError.isDisplayed() && emailError.getText().contains(errorMessage);
    }

    public void clickToRegister() {
        loginButton.click();
        registerButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}