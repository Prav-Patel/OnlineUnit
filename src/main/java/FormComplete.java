import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// As a user I want to successfully sign into the w2.hronline.co.uk/trial website

public class FormComplete {

    public static void main(String[] args) throws InterruptedException {

//        //Create Google Chrome Browser
//        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
//        WebDriver driver = new ChromeDriver();

        //Create FireFox Browser
        WebDriver driver = new FirefoxDriver();

        //Navigate to URL
        driver.get("https://w2.hronline.co.uk/trial");
        System.out.println(driver.getCurrentUrl());

        //Click in Email Field & Enter value
        driver.findElement(By.id("email")).sendKeys("Test30@mailinator.com");
        //Click in Confirm Email Field & Enter value
        driver.findElement(By.id("emailConfirmation")).sendKeys("Test30@mailinator.com");
        //Click in Password Field & Enter value
        driver.findElement(By.id("password")).sendKeys("Qwertyuiop1");
        //Click in Confirm Password Field & Enter value
        driver.findElement(By.id("confirmPassword")).sendKeys("Qwertyuiop1");
        //Click in First Name Field & Enter TEST
        driver.findElement(By.id("firstName")).sendKeys("Test");
        //Click in Last Name Field & Enter value
        driver.findElement(By.id("lastName")).sendKeys("Patel");
        //Click in Company Name & Enter value
        driver.findElement(By.id("companyName")).sendKeys("Asda");
        //Click in Phone Number
        driver.findElement(By.id("phoneNumber")).sendKeys("07456088616");
        //Click in Promo Code Field & Enter value
        driver.findElement(By.id("promoCode")).sendKeys("A1B2C3D4");
        //Click Check box for T&C's
        driver.findElement(By.id("AcceptedTermsAndConditions")).click();
        //Select Submit Button
        driver.findElement(By.id("sign-up")).click();
        //Thread.sleep - Pauses execution for period of milliseconds <Thread.sleep(1000)>;

        //Validate that the user has signed in successfully
        driver.findElement(By.id("useTestAccount"));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("Test Passed: Stage 1 complete!!!");

        //Test that user can select the add employee button
        driver.findElement(By.id("addEmployeeNext")).click();
        Thread.sleep(2000);

        //Click in First Name field & Enter value
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div/div[3]/div[2]/form/div[1]/input")).sendKeys("Tester");

        //Click in Last Name field & Enter value
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/input")).sendKeys("SurnamePatel");

        //Click in Email field & Enter value
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/input")).sendKeys("testerB01@mailinator.com");

        //Select Add Employee Button
        driver.findElement(By.id("saveEmployee")).click();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        System.out.println("Test Passed: Stage 2 complete!!!");

        //Select View Employees link
        driver.findElement(By.id("showhideButton")).click();

        //Select All Done Button
        driver.findElement(By.id("addEmployeeAllDone")).click();
        System.out.println(driver.getCurrentUrl());
        System.out.println("Test Passed: Stage 3 complete!!!");
        Thread.sleep(2000);

        //Select Summary All Done Button
        driver.findElement(By.id("summaryAllDone")).click();
        System.out.println("Test Passed: Stage 4 complete!!!");
        Thread.sleep(2000);

        //Select Let's get Started Button
        driver.findElement(By.id("completeSetup")).click();
        System.out.println(driver.getCurrentUrl());
        System.out.println("Test Passed: Stage 5 complete!!!");
        Thread.sleep(2000);
    }
}
