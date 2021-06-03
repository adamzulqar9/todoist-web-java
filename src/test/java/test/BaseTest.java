package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import variables.Variables;
import variables.Credentials;
import functions.HelperFunctions;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException{
        System.out.println("Setting up test");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        driver.get(Variables.url);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() {
        System.out.println("Tearing down test");
        driver.quit();
    }

    public void login() throws InterruptedException{
        HelperFunctions.waitAndClick(wait, Variables.login, "Login tab");

        HelperFunctions.enterKeys(driver, Variables.email, Credentials.email_id);

        HelperFunctions.enterKeys(driver, Variables.password, Credentials.password);

        HelperFunctions.waitAndClick(wait, Variables.loginBtn, "Login button");
    }
}
