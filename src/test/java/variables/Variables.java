package variables;

import org.openqa.selenium.By;

public class Variables {
    public static String url       = "https://todoist.com/";
    public static By login         = By.xpath("//ul[@class='_3XsmI']//a[@href='/users/showlogin']");
    public static By features      = By.xpath("//ul[@class='_3w5OK']//a[@href='/features']");
    public static By templates     = By.xpath("//ul[@class='_3w5OK']//a[@href='/templates']");
    public static By for_teams     = By.xpath("//ul[@class='_3w5OK']//a[@href='/business']");
    public static By resources     = By.xpath("//span[@class='_2q_cf']");
    public static By pricing       = By.xpath("//ul[@class='_3w5OK']//a[@href='/pricing']");
    public static By email         = By.xpath("//input[@id='email']");
    public static By password      = By.xpath("//input[@id='password']");
    public static By login_btn     = By.xpath("//button[text()='Log in']");
}
