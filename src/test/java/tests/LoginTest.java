package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void positiveLoginTest(){
        loginPage.setUsername(BASE_USERNAME);
        loginPage.setPassword(BASE_PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());
        homePage.openAccountsTab();


    }
}
