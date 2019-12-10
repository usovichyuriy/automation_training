package by.bsu.rent.test;



import by.bsu.rent.model.PageError;
import by.bsu.rent.page.*;
import by.bsu.rent.service.CarRentOptionsCreator;
import by.bsu.rent.service.PageErrorCreator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class HomePageTest extends CommonConditions {


    @Test(testName = "1: rent cars for the same pick-up and drop-off time")
    public void rentCarsForZeroPeriodTest() {
        HomePage page = new HomePage(driver);
        page.openPage().fillFromParameters(CarRentOptionsCreator.withTheSameTimeOfPickUpAndDropOff());
        PageError testError = PageErrorCreator.forZeroPeriod();
        Assert.assertTrue(page.checkTimeErrorMessage(testError));
    }

    @Test(testName = "2: rent cars for drop-off time before pick-up time")
    public void rentCarsForReturnTimeBeforeRentalTime() {
        HomePage page = new HomePage(driver);
        page.openPage().fillFromParameters(CarRentOptionsCreator.withTheReturnTimeBeforeTheRentalTime());
        PageError testError = PageErrorCreator.forReturnTimeBeforeRentalTime();
        Assert.assertTrue(page.checkTimeErrorMessage(testError));
    }

    @Test(testName = "3: rent cars for big distance between pick-up and drop-off locations")
    public void rentCarsForBigDistanceBetweenRentalAndReturnPlaces() {
        HomePage page = new HomePage(driver);
        page.openPage().fillFromParameters(CarRentOptionsCreator.withBigDistanceBetweenPickUpAndDropOffPlaces());
        PageError testError = PageErrorCreator.forBigDistanceBetweenPickAndDropPlaces();
        Assert.assertTrue(page.checkLocationErrorMessage(testError));
    }

    @Test(testName = "4: rent cars for the incorrect pick-up location")
    public void rentCarsForIncorrectPickUpLocation() {
        HomePage page = new HomePage(driver);
        page.openPage().fillFromParameters(CarRentOptionsCreator.withIncorrectPickUpLocation());
        PageError testError = PageErrorCreator.forIncorrectPickUpLocation();
        Assert.assertTrue(page.checkLocationErrorMessage(testError));
    }

    @Test(testName = "5: rent cars for with all correct criterias")
    public void rentCarsForAllCorrectCriterias() {
        HomePage page = new HomePage(driver);
        page.openPage().fillFromParameters(CarRentOptionsCreator.withAllCorrectCriterias());
        Assert.assertFalse(driver.findElement(By.xpath("//a[text()=‘Transmission’]")).isDisplayed());
    }

    @Test(testName = "6: rent cars for pick-up time before current time")
    public void rentCarsForInvalidTime() {
        HomePage page = new HomePage(driver);
        page.openPage().fillFromParameters(CarRentOptionsCreator.withInvalidTime());
        PageError testError = PageErrorCreator.forInvalidTime();
        Assert.assertTrue(page.checkTimeErrorMessage(testError));
    }

    @Test(testName = "7: rent cars for the different pick-up and drop-off countries")
    public void rentCarsForDifferentPickUpAndDropOffCountries() {
        HomePage page = new HomePage(driver);
        page.openPage().fillFromParameters(CarRentOptionsCreator.withDifferentCountriesInPickUpAndDropOffLocations());
        Assert.assertFalse(driver.findElement(By.xpath("//a[text()=‘Transmission’]")).isDisplayed());
    }

    @Test(testName = "8: rent cars for the same pick-up and drop-off time")
    public void rentCarsForLongTime() {
        HomePage page = new HomePage(driver);
        page.openPage().fillFromParameters(CarRentOptionsCreator.withLongTime());
        PageError testError = PageErrorCreator.forLongTime();
        Assert.assertTrue(page.checkTimeErrorMessage(testError));
    }


}