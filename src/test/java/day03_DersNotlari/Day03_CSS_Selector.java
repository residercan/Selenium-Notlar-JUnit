package day03_DersNotlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

    public class Day03_CSS_Selector {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            //2- https://www.amazon.com/ adresine gidin
            driver.get("https://www.amazon.com/");
            //3- Browseri tam sayfa yapin
            driver.manage().window().maximize();
            //4- Sayfayi “refresh” yapin
            driver.navigate().refresh();
            //5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
            String actualTitle = driver.getTitle();
            String arananKelime = "Spend less";
            if (actualTitle.contains(arananKelime)) {
                System.out.println("PASSED");
            } else System.out.println("FAILED actualTitle-> " + actualTitle);
            //6 Gift Cards sekmesine basin
            driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
            //7 Birthday butonuna basin
            driver.findElement(By.cssSelector("img[alt='Birthday']")).click();
            //8 Best Seller bolumunden ilk urunu tiklayin
            List<WebElement> bestSeller8 = driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
            bestSeller8.get(0).click();
            //9- Gift card details’den 25 $’i secin
            driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();
            //10-Urun ucretinin 25$ oldugunu test edin
            WebElement urunUcreti = driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
            if (urunUcreti.getText().equals("$25.00")) {
                System.out.println("Test PASSED");
            } else System.out.println("Test FAILED");
            //11-Sayfayi kapatin
            driver.close();
        }
    }


