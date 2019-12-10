package by.bsu.rent.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public abstract class AbstractPage {


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
