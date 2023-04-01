package Google1.feature;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class MyStepdefs_Google1 {
    WebDriver driverObj;
    @Given("I launch Firefox browser for Google")
    public void iLaunchFirefoxBrowserForGoogle() {
        System.setProperty("WebDriver.gecko.driver", "C:\\Users\\Admin" + "\\Downloads\\geckodriver-v0.32.2\\geckodriver-v0.32.2");
        driverObj = new FirefoxDriver();
    }

    @When("I open Google sign up webpage")
    public void iOpenGoogleSignUpWebpage() {
        driverObj.get("https://accounts.google.com/SignUp");
    }

    @Then("I enter user data and press next button")
    public void iEnterUserDataAndPressNextButton() {
        driverObj.manage().deleteAllCookies();
        driverObj.findElement(By.id("firstName")).sendKeys("Piret");
        driverObj.findElement(By.id("lastName")).sendKeys("Mihkelson");
        driverObj.findElement(By.id("username")).sendKeys("Piret2023");
        driverObj.findElement(By.name("Passwd")).sendKeys("mnbvcxz123€@");
        driverObj.findElement(By.name("ConfirmPasswd")).sendKeys("mnbvcxz123€@");
        driverObj.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
    }

    @And("Close browser for Google")
    public void closeBrowserForGoogle() {
        driverObj.quit();

    }
}
