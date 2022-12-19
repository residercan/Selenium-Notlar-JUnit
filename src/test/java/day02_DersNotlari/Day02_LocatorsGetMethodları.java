package day02_DersNotlari;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_LocatorsGetMethodları {

    public static void main(String[] args) {

        System.setProperty("webdriver.chorme.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));

        //Amazon sayfasına gidelim
        driver.get("http://www.amazon.com/");

        //Search bölümünü locate edip iphone aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //Arama sonuç yazısında iphone yazısını locate edip konsola yazdıralım.
        WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());

        driver.close();


    }
}
