package form.feature;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class MyStepdefs_form {
    WebDriver driver;
    @Given("I launch Firefox browser")
    public void iLaunchFirefoxBrowser() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin" + "\\Downloads\\geckodriver-v0.32.2\\geckodriver-v0.32.2");
        driver.manage().window().maximize();
    }

    @When("I open form webpage")
    public void iOpenFormWebpage() {
        driver.get("https://automationexplore.com/selenium-automation-practice-page/");
    }

    @Then("I enter my name")
    public void iEnterMyName() {
        driver.findElement(By.id("firstname")).sendKeys("Piret");
        driver.findElement(By.id("lastname")).sendKeys("Mihkelson");
    }

    @And("I enter my email")
    public void iEnterMyEmail() {
        driver.findElement(By.id("email")).sendKeys("piret534@gmail.com");
    }

    @And("I choose Gender and Profession")
    public void iChooseGenderAndProfession() {
        driver.findElement(By.xpath("//input[@value = 'female']")).click();
        driver.findElement(By.xpath("//input[@value = 'Student']")).click();
    }

    @And("I enter country and skill")
    public void iEnterCountryAndSkill() {
        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText("USA");
        Select skill = new Select(driver.findElement(By.id("skillsmultiple")));
        skill.selectByVisibleText("Automation Testing");

    }

    @And("I click the button")
    public void iClickTheButton() {
        driver.findElement(By.id("alertbutton")).click();
        Alert alertObj = driver.switchTo().alert();
        alertObj.accept();
    }
}
