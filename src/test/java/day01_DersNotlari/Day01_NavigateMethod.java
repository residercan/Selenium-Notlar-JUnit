package day01_DersNotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
        driver.navigate().to(new) aynı get methodu gibi çalışıyor ve istediğimiz sayfaya erişiyoruz.
        driver.navigate().back açık olan sayfayı bir önceki sayfaya döndürür.
        driver.navigate().forward açık olan sayfayı bir sonraki sayfaya döndürür.
        driver.navigate().refresh açık olan sayfayı yeniler.
        Thread.sleep(2000) methodu geçişler çok hızlı olduğu için araya 2 saniye süre atıyoruz.
        Aradaki geçişleri görebilmek için.
         */

        //Amazon sayfasına gidelim
        //driver.navigate().to("https://amazon.com/");
        driver.get("https://amazon.com");//driver.navigate().to("")işlemini get methodu ile de yapabiliriz

        //Techproeducation sayfasına gidelim
        Thread.sleep(2000);
        //driver.navigate().to("https://techproeducation.com/");
        driver.get("https://techproeducation.com");//driver.navigate().to("")işlemini get methodu ile de yapabiliriz

        //Tekrar amazon sayfasına geri dönelim
        Thread.sleep(2000);
        driver.navigate().back();//Amazon sayfasına geri döner

        //Tekrar techproeducation sayfasına gidelim
        Thread.sleep(2000);
        driver.navigate().forward();//techproeducation sayfasına ilerler

        //Son sayfada sayfayı yenileyelim(refresh)
        Thread.sleep(2000);
        driver.navigate().refresh();//sayfayı yeniler.

        //Sayfayı kapatalım.
        driver.close();
    }
}
