package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSingleton {

    private static WebDriver driver;

    public WebDriverSingleton() {}

    public static WebDriver getInstance() {
        if (null == driver) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("disable-infobars"); // disabling infobars
            options.addArguments("--disable-extensions"); // disabling extensions
            options.addArguments("--disable-gpu"); // applicable to windows os only
            options.addArguments("--no-sandbox"); // Bypass OS security model
            driver = new ChromeDriver(options);

        }
        return driver;

    }

    public static void quit() {
        if(null != driver) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("disable-infobars"); // disabling infobars
            options.addArguments("--disable-extensions"); // disabling extensions
            options.addArguments("--disable-gpu"); // applicable to windows os only
            options.addArguments("--no-sandbox"); // Bypass OS security model
            driver.quit();
        }
        driver = null;
    }
}
