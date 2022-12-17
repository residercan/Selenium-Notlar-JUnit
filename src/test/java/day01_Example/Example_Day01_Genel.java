package day01_Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example_Day01_Genel {

    public static void main(String[] args) {

        /*
        -ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        -Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.
                https://www.walmart.com/ sayfasina gidin.
        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Tekrar “facebook” sayfasina donun
        Sayfayi yenileyin
        Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
        */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //--------AŞAĞIDAKİ İKİ METHODU HER ZAMAN YAZ-------------//
        driver.manage().window().maximize();//Test'te oluşabilecek hataları önlemek için her zaman sayfayı max. yaparız
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));//Bu method sayfadaki her bir web element için max. bekleme süresini belirler.

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com/");

        String actualTitle = driver.getTitle();
        if(actualTitle.contains("facebook")){
            System.out.println("Title testi Passed");
        } else System.out.println("Title testi Failed -->" + actualTitle);



        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains("facebook")){
            System.out.println("Url testi Passed");
        } else System.out.println("Url testi Failed" + actualUrl);


        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitleWalmart = driver.getTitle();

        if(actualTitleWalmart.contains("Walmart.com")){
            System.out.println("Title testi Passed");
        } else System.out.println("Title testi Failed");


        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Browser’i kapatin
        driver.close();



    }


}
