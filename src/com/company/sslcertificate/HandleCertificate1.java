package com.company.sslcertificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HandleCertificate1 {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(options );
        driver.get("https://expired.badssl.com");
        driver.quit();
    }
}
