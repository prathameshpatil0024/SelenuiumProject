package com.company.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImplicitWait1 {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver .manage() .window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(5000);
        js.executeScript("arguments[0].scrollIntoView;",driver.findElement(By.id("mousehover")));

        Thread.sleep(5000);

        driver.close();

    }
}
