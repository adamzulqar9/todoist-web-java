package test;

import functions.HelperFunctions;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import variables.Variables;

public class AddRemoveTaskTest extends BaseTest {
    public String testTask = "Test task";
    @Test (priority = 1)
    public void loginAccount() throws InterruptedException {
        login();
    }

    @Test (priority = 2)
    public void addTask() throws InterruptedException {
        HelperFunctions.waitAndClick(wait, Variables.addTask, "Add task");

        HelperFunctions.waitAndClick(wait, Variables.taskName, "Task name");
        HelperFunctions.enterKeys(driver, Variables.taskName, testTask);

        HelperFunctions.waitAndClick(wait, Variables.addTaskBtn, "Add task button");
    }

    @Test (priority = 3)
    public void removeTask() throws InterruptedException {
        String task = driver.findElement(Variables.createdTask).getText();
        Assert.assertEquals(task, testTask);

        HelperFunctions.waitAndClick(wait, Variables.doneCheckBox, "Done check box");

        String checkTask = null;

        try {
            checkTask = driver.findElement(Variables.createdTask).getText();
        } catch (NoSuchElementException e) {
            System.out.println("Failed to extract task");
        }

        Assert.assertNull(checkTask);
        Thread.sleep(1000);
    }
}
