package com.company.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class CookiesByName {
    public static void main(String[] args) throws InterruptedException {

        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver .manage() .window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Cookie cookie=new Cookie("digital partner","institute");
        driver.manage().addCookie(cookie);

        System.out.println(driver.manage().getCookieNamed("digital partner"));

        Thread.sleep(3000);
        driver.quit();
}
}
