package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SeleniumTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
    }
}
