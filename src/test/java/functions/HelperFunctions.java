package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import variables.Credentials;
import variables.Variables;

public class HelperFunctions {
    public static void waitAndClick(WebDriverWait wait, By element, String e) {
        System.out.print("\tPressing element: " + e);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
            System.out.println(" - OK");
        } catch (TimeoutException error) {
            System.out.println(" - NOK");
        }
    }

    public static void enterKeys(WebDriver driver, By element, String e){
        WebElement input_email = driver.findElement(element);
        input_email.sendKeys(e);
    }
}
