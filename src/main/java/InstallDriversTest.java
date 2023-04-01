import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

    public class InstallDriversTest {

        @Test
        @Disabled("Do not run in CI")
        public void firefoxSession() {
            WebDriverManager.firefoxdriver().setup();

            WebDriver driver = new FirefoxDriver();

            driver.quit();
        }


    }

