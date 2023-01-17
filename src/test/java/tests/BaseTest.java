package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import modals.BaseModal;
import modals.NewLeadModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LeadDetailsPage;
import pages.LeadsPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected final static String BASE_URL ="https://login.salesforce.com/";
    protected final static String BASE_USERNAME ="vereshako10-lveb@force.com";
    protected final static String BASE_PASSWORD ="DCJhLqGXhabr7sb";
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected LeadsPage leadsPage;
    protected LeadDetailsPage leadsDetailsPage;
    protected NewLeadModal newLeadModal;
    protected BaseModal baseModals;



    //@Parameters ({"browser"})
    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        leadsPage = new LeadsPage(driver);
        leadsDetailsPage = new LeadDetailsPage(driver);
        newLeadModal = new NewLeadModal(driver);
        baseModals = new BaseModal(driver);
    }

    @BeforeMethod(alwaysRun = true)
    public void  navigate() {
        driver.get(BASE_URL);
    }

    @AfterClass(alwaysRun = true)
    public void  tearDown() {
        driver.quit();
    }
}

