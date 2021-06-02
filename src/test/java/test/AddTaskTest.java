package test;

import functions.HelperFunctions;
import org.testng.annotations.Test;
import variables.Variables;

public class AddTaskTest extends BaseTest{
    @Test
    public void addTask() throws InterruptedException {
        login();

        HelperFunctions.waitAndClick(wait, Variables.addTask, "Add task");

        HelperFunctions.waitAndClick(wait, Variables.taskName, "Task name");
        HelperFunctions.enterKeys(driver, Variables.taskName, "Test task");

        HelperFunctions.waitAndClick(wait, Variables.addTaskBtn, "Add task button");
    }
}
