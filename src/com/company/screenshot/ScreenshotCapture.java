package com.company.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenshotCapture {


    public static void main(String[] args) throws InterruptedException, IOException {
         ChromeOptions options =new ChromeOptions();
         options.setAcceptInsecureCerts(true);
         System.setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("https://instagram.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
        FileHandler.copy(screenshot,new File("C:\\Users\\priyanka\\Pictures\\Screenshots\\Screenshot (1).png  "));
        Thread.sleep(5000);
        driver.close();

    }

}
