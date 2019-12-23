package by.bsu.rent.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public abstract class AbstractPage {
    private static final Logger LOGGER = LogManager.getRootLogger();


    protected final WebDriver driver;
    protected final int WAIT_TIMEOUT_SECONDS = 30;
    protected abstract AbstractPage openPage();

    @FindBy(xpath = "//body")
    private WebElement body;

    protected AbstractPage(WebDriver driver) {
        this.driver  = driver;
        PageFactory.initElements(this.driver, this);
    }
    protected void focusAway() {
        body.click();
        LOGGER.info("Focus away.");
    }
}
