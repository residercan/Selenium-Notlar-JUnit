package day02_Example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example_Day02_Day01Tekrar {

    public static void main(String[] args) {

        /*
        İlk önce browser'i maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 saniye belirtelim
        Sırasıyla amazon,facebook ve youtube sayfalarına gidelim.
        Amazon sayfasına tekrar dönelim.
        Amazon sayfasının Url'inin https://www.amazon.com/ adresine eşit olduğunu test edelim
        Sayfanın konumunu ve size'ını yazdıralım
        Sayfanın konumunu ve size'inı istediğimiz şekilde ayarlıyalım
        ve istediğimiz şekilde olduğunu test edelim
        ve sayfayı kapatalım
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //İlk önce browser'i maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 saniye belirtelim
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));
        driver.manage().window().maximize();


        //Sırasıyla amazon,facebook ve youtube sayfalarına gidelim.
        driver.get("https://www.amazon.com/");
        driver.get("http://www.facebook.com/");
        driver.get("http://www.youtube.com/");

        //Amazon sayfasına tekrar dönelim.
        driver.navigate().back();
        driver.navigate().back();

        //Amazon sayfasının Url'inin https://www.amazon.com/ adresine eşit olduğunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Url testi Passed");
        } else System.out.println("Url testi Failed");

        //Sayfanın konumunu ve size'ını yazdıralım
        System.out.println("Sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın size: "+driver.manage().window().getSize());


        //Sayfanın konumunu ve size'inı istediğimiz şekilde ayarlıyalım ve istediğimiz şekilde olduğunu test edelim
        driver.manage().window().setSize(new Dimension(600, 600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfanın yeni konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın yeni size: "+driver.manage().window().getSize());

        Dimension actualYeniSize = driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
            System.out.println("Size testi Passed");
        } else System.out.println("Size testi Failed");

        Point actualYeniPosition = driver.manage().window().getPosition();
        if(actualYeniPosition.getX()==50 && actualYeniPosition.getY()==50){
            System.out.println("Position testi Passed");
        } else System.out.println("Position testi Failed");

        //Sayfayı kapatalım
        driver.close();

    }

}

