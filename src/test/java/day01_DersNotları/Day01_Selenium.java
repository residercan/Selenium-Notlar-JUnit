package day01_DersNotları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Selenium {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
        En temel haliyle otomasyon yapmak için Class'ımıza otomasyon için gerekli olan
        web driver'ın yerini göstermemiz gerekir. Bunun için java kütüphanesinden
        System.setProperty() methodunun içine ilk olarak driver'ı yazarız. İkinci olarak driver'ın fiziki yolunu
        kopyalarız.
         */

        driver.get("https://www.techproeducation.com");

    }
}
