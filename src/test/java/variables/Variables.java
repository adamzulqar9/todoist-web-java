package variables;

import org.openqa.selenium.By;

public class Variables {
    public static String url        = "https://todoist.com/";
    public static By login          = By.xpath("//ul[@class='_3XsmI']//a[@href='/users/showlogin']");
    public static By features       = By.xpath("//ul[@class='_3w5OK']//a[@href='/features']");
    public static By templates      = By.xpath("//ul[@class='_3w5OK']//a[@href='/templates']");
    public static By forTeams       = By.xpath("//ul[@class='_3w5OK']//a[@href='/business']");
    public static By resources      = By.xpath("//span[@class='_2q_cf']");
    public static By pricing        = By.xpath("//ul[@class='_3w5OK']//a[@href='/pricing']");
    public static By email          = By.xpath("//input[@id='email']");
    public static By password       = By.xpath("//input[@id='password']");
    public static By loginBtn       = By.xpath("//button[text()='Log in']");

    public static By addTask        = By.xpath("//button[@class='plus_add_button']");
    public static By taskName       = By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']");
    public static By addTaskBtn     = By.xpath("//button[@class='ist_button ist_button_red']");
    public static By createdTask    = By.xpath("//ul[@data-day-list-id='2021-06-03']//div[@class='task_list_item__content__content_wrapper']");
    public static By doneCheckBox   = By.xpath("//section[contains(.,'Today')]//div[@class='task_checkbox__circle']");
}
