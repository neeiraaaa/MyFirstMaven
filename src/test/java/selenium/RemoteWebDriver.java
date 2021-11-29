package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteWebDriver {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new org.openqa.selenium.remote.RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());

        driver.get("https://onliner.by");
        WebElement el = driver.findElement(By.className("onliner_logo"));
        el.click();
        driver.close();
    }
}
