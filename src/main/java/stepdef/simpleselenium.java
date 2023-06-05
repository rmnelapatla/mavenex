package stepdef;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class simpleselenium {

    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    public static void main(String arg[]){
        System.setProperty("webdriver.chrome.driver" ,"E:\\AllBrowser\\chromedriver_win32_113\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        webDriverWait = new WebDriverWait(driver, Duration.ofMinutes(30)); // selenium 4
        WebElement registerlnk= driver.findElement(By.xpath("//a[@href='/register']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(registerlnk));
        registerlnk.click();
        WebElement btnregister= driver.findElement(By.id("register-button"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(btnregister));

        // select a gener
        WebElement rndgenderfemale= driver.findElement(By.id("gender-female"));
        WebElement rndgendermale= driver.findElement(By.id("gender-male"));
        rndgenderfemale.click();
        //rndgendermale.click();
        driver.findElement(By.id("FirstName")).sendKeys("Ramana");
        driver.findElement(By.id("LastName")).sendKeys("murthy");
        driver.findElement(By.id("Email")).sendKeys("tester99@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("#Lt12345");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("#Lt12345");
        btnregister.click();

    }
}
