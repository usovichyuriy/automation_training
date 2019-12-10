package by.bsu.rent.test;

import by.bsu.rent.model.PageError;
import by.bsu.rent.page.RegisterPage;
import by.bsu.rent.service.AccountCreator;
import by.bsu.rent.service.PageErrorCreator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterPageTest extends CommonConditions {
    @Test(testName = "9: register an account with valid email and password")
    public void registerAccountWithValidEmailAndPassword() {
        RegisterPage page = new RegisterPage(driver);
        page.openPage().fillFromParameters(AccountCreator.withValidEmailAndPassword());
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()=‘Orders’]")).isDisplayed());
    }

    @Test(testName = "10: register an account with invalid email")
    public void registerAccountWithInvalidAgainPassword() {
        RegisterPage page = new RegisterPage(driver);
        page.openPage().fillFromParameters(AccountCreator.withInvalidAgainPassword());
        PageError testError = PageErrorCreator.forInvalidAgainPassword();
        Assert.assertTrue(page.checkEmailErrorMessage(testError));
    }
}
