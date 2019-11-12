package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class HomePageTest {
    private WebDriver driver;
    private HomePage page;

    @Before
    public void setUpChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        page = new HomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='cm-selectSpecific']")).click();
    }

    @After
    public void tearDownChromeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Test
    public void noStationsAvailableNearbyTest() {
        String pickUpLocation = "Mozyr";
        page.inputPickUpLocation(pickUpLocation);
        String dropOffLocation = "Moscow - Domodedovo";
        page.inputDropOffLocation(dropOffLocation);
        page.search();
        String errorMessage = "Please enter your pick-up location.";
        assertTrue(page.checkLocationErrorMessage(errorMessage));
    }

    @Test
    public void invalidEmailWhileRegistrationTest() {
        page.clickToRegister();
        String badEmail = "email_a";
        page.inputEmail(badEmail);
        String offerMessage = "Please enter a valid e-mail address.";
        assertTrue(page.checkEmailErrorMessage(offerMessage));
    }
} 