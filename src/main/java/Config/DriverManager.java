package Config;

import Constants.CommonConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class DriverManager
{
    public static WebDriver driver = null;
    private static final Logger Logg = LogManager.getLogger(DriverManager.class.getName());

    /*
    | It will Return the Driver Where ever you want Just Call as getDriver
    * */

    public static WebDriver getDriver() {
        return driver;
    }

    public static void launchbrowser() throws IOException {

        try {
            switch (CommonConstants.Browser) {
                case "chrome":
                    Logg.info("Lunching "+ CommonConstants.Browser);
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;

                case "Chrome Headless":
                    Logg.info("Lunching "+CommonConstants.Browser);
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--headless");
                    chromeOptions.addArguments("--disable-gpu");
                    driver = new ChromeDriver(chromeOptions);
                    break;

                case "Firebox":
                    Logg.info("Lunching "+CommonConstants.Browser);
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void teardown() {
        Logg.info("Browser Closed");
      //  driver.quit();
    }
}
