package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Decide if headless mode is ON (default = false)
        boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"));

        // ChromeOptions for flexibility
        ChromeOptions options = new ChromeOptions();

        if (isHeadless) {
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            System.out.println("Running in Headless Mode (for AWS/Linux)");
        } else {
            System.out.println("Running in Normal Mode (for Local Execution)");
        }

        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();

        // Launch browser
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Launch AUT (Application Under Test)
        driver.get("https://www.testingbaba.com/old/newdemo.html");

        // Explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully!");
        }
    }
}
