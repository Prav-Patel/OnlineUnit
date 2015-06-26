import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// As a Product Owner I want to ensure Pages on the site meet expected standards

public class PageStandards {

    public static void main(String[] args) throws InterruptedException {

        //Create Local Variables for HrOnline & Validator site.
        String hrOnlineSite = "https://w2.hronline.co.uk/trial";
        System.out.println(hrOnlineSite);

        String validatorSite = "https://jigsaw.w3.org/css-validator/";
        System.out.println(validatorSite);

        //Create Google Chrome Browser
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Navigate to URL
        driver.get(hrOnlineSite);
        Thread.sleep(2000);

        //Navigate to Standards URL
        driver.switchTo();
        driver.get(validatorSite);

        //Click in Validate URL field & Enter previous URL
        driver.findElement(By.id("uri")).sendKeys(validatorSite);
        Thread.sleep(1000);

        //Select Check Button
        driver.findElement(By.className("submit")).click();

        //Verify Results of Page Validated
        driver.findElement(By.id("congrats"));
        System.out.println((driver.getCurrentUrl()));


    }
}
