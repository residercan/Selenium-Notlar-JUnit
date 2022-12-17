package day01_DersNotları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {

    public static void main(String[] args) {


        /*
       En temel haliyle otomasyon yapmak icin Class'ımıza otomasyon icin gerekli olan
       webdriver'in yerini goostermemiz gerekir. Bunun icin java kutuphanesinden System.setProperty()
       methodunun icine ilk olarak driver'i yazariz. İkinci olarak driver'in fiziki yolunu kopyalariz
        */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");//İlk olarak gitmek istediğimiz sayfayı belirtiriz
        System.out.println("Sayfa Başlığı: " + driver.getTitle());//Sayfanın başlığını alabilmek için getTitle methodunu
        System.out.println("Sayfa URL'i: " + driver.getCurrentUrl());//Sayfanın URL'sini alabilmek için getCurrentUrl methodunu
        //System.out.println("Sayfanın kaynak kodları: "+driver.getPageSource());//İçinde olunan sayfanın kaynak kodlarını getirir.
        System.out.println(driver.getWindowHandle());//Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
                                                    //bir string'e atayıp pencereler arası geçiş yapabiliriz.


    }


}
