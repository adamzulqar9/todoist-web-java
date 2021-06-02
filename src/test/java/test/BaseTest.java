package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import variables.Variables;
import variables.Credentials;
import functions.HelperFunctions;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setup() throws MalformedURLException{
        System.out.println("Setting up test");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        driver.get(Variables.url);
    }

    @AfterMethod
    public void teardown(ITestResult res) {
        System.out.println("Tearing down test");
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException{
        HelperFunctions.waitAndClick(wait, Variables.login, "Login tab");

        WebElement input_email = driver.findElement(Variables.email);
        input_email.sendKeys(Credentials.email_id);

        WebElement input_passwd = driver.findElement(Variables.password);
        input_passwd.sendKeys(Credentials.password);

        HelperFunctions.waitAndClick(wait, Variables.login_btn, "Login button");
    }
}
