package day02_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example_Day02_WebElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));

        /*
        a.web sayfasına gidin. https://www.amazon.com/
        Search(ara) “city bike”
        Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */

        driver.get("https://www.amazon.com/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());
        //Sorunun devamı karışıklık olmaması adına xpath ile yapılacak
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın. bu bölümün çözümü yapılmadı.

    }
}
