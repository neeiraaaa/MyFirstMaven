package homevork;

// Задание на написание GUI тестов:
//1. Перейти на сайт booking.com
//2. Ввести в поиск «Москва», выбрать для проживания 2 гостей и 1 номер.
//3. Проверить, что в Москве есть отели на введенные даты

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingGuiTest1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://booking.com");
        driver.findElement(By.name("ss")).sendKeys("Москва");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@data-label='Москва, Россия']")).click();
        driver.findElement(By.xpath("//td[@data-date='2021-12-06']")).click();
        driver.findElement(By.xpath("//td[@data-date='2021-12-12']")).click();
        System.out.println("2 гостя: " + driver.findElement(By.xpath("//span[contains(.,'2 взрослых')]/span[@data-adults-count]")).isDisplayed());
        //System.out.println("1 номер:  " + driver.findElement (By.xpath("//span[contains(.,'2 взрослых')]/span[4]")).isDisplayed()); //span[contains(.,'1 номер')]/span[3]/span
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='sb-searchbox-submit-col -submit-button ']")).click();
        System.out.println("Есть ли отели на выбранные даты: " + driver.findElement(By.xpath("//div[@class='ea52000380']")).isDisplayed());
        driver.close();
        driver.quit();

    }
}
