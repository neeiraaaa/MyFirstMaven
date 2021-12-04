package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DemoFindWeather {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(.,'сегодня')]")).click();
        driver.findElement(By.xpath("//div[@id = 'wob_dp']/div[@data-wob-di='1']")).click();

            String dayOfWeek =
                    DateTimeFormatter.ofPattern("EEEE")
                            .withLocale(new Locale("ru", "RU"))
                            .format(LocalDate.now().plus(1, ChronoUnit.DAYS));

        WebElement temperatureToday =  driver.findElement(By.xpath(String.format("//*[contains(@aria-label ,'Celsius %s 12:00')][1]", dayOfWeek)));

        String temperatureValue = temperatureToday.getAttribute("aria-label");
        System.out.println(temperatureValue.split("°")[0]);
        driver.close();
    }
}
