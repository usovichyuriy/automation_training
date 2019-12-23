package by.bsu.rent.page;

import by.bsu.rent.model.CarRentOptions;
import by.bsu.rent.model.PageError;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends AbstractPage {
    private static final Logger LOGGER = LogManager.getRootLogger();
    private final String HOMEPAGE_URL = "https://www.lufthansa.com/by/en";
    private final WebDriverWait wait;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
    }

    @Override
    public HomePage openPage() {
        driver.navigate().to(HOMEPAGE_URL);
        LOGGER.info("Home page opened");
        return this;
    }

    @FindBy(xpath = "//*[@id=\"rentalStationCode\"]")
    private WebElement pickUpLocationInput;

    @FindBy(xpath = "//*[@id=\"returnStationCode\"]")
    private WebElement dropOffLocationInput;

    @FindBy(xpath = "//*[@id=\"rentalDateCode\"]")
    private WebElement pickupDateInput;

    @FindBy(xpath = "//*[@id=\"returnDateCode\"]")
    private WebElement dropOffDateInput;

    @FindBy(xpath = "//*[@id=\"rentalTimeCode\"]")
    private WebElement pickUpTimeInput;

    @FindBy(xpath = "//*[@id=\"returnTimeCode\"]")
    private WebElement dropOffTimeInput;

    @FindBy(className = "locationError")
    private WebElement locationError;

    @FindBy(className = "rentalTimeError")
    private WebElement timeError;

    @FindBy(id = "loginButton")
    private WebElement searchButton;



    public HomePage fillFromParameters(CarRentOptions params) {
        params.getPickUpLocation().ifPresent(this::inputPickUpLocation);
        params.getDropOffLocation().ifPresent(this::inputDropOffLocation);
        params.getPickUpDate().ifPresent(this::inputPickUpDate);
        params.getDropOffDate().ifPresent(this::inputDropOffDate);
        params.getPickUpTime().ifPresent(this::inputPickUpTime);
        params.getDropOffTime().ifPresent(this::inputDropOffTime);
        LOGGER.info("Parameters are entered");
        return this;
    }


    public void search() {
        searchButton.click();
    }

    public void inputPickUpLocation(String country) {
        Select dropdown = new Select(pickUpLocationInput);
        dropdown.selectByVisibleText(country);
        LOGGER.info(country+ " selected");
    }

    public void inputDropOffLocation(String country) {
        Select dropdown = new Select(dropOffLocationInput);
        dropdown.selectByVisibleText(country);
        LOGGER.info(country+ " selected");
    }

    public void inputPickUpDate(String pickUpDate) {
        Select dropdown = new Select(pickupDateInput);
        dropdown.selectByVisibleText(pickUpDate);
        LOGGER.info(pickUpDate+ " selected");
    }

    public void inputDropOffDate(String dropOffDate) {
        Select dropdown = new Select(dropOffDateInput);
        dropdown.selectByVisibleText(dropOffDate);
        LOGGER.info(dropOffDate+ " selected");
    }

    public void inputPickUpTime(String pickUpTime) {
        Select dropdown = new Select(pickUpTimeInput);
        dropdown.selectByVisibleText(pickUpTime);
        LOGGER.info(pickUpTime+ " selected");
    }

    public void inputDropOffTime(String dropOffTime) {
        Select dropdown = new Select(dropOffTimeInput);
        dropdown.selectByVisibleText(dropOffTime);
        LOGGER.info(dropOffTime+ " selected");
    }

    public boolean checkLocationErrorMessage(PageError errorMessage) {
        return locationError.isDisplayed() && locationError.getText().contains((CharSequence) errorMessage);
    }

    public boolean checkTimeErrorMessage(PageError errorMessage) {
        return timeError.isDisplayed() && timeError.getText().contains((CharSequence) errorMessage);
    }








}
