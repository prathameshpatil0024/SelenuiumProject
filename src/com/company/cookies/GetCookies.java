package com.company.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.CookieHandler;
import java.time.Duration;
import java.util.Set;

public class GetCookies {
    public static void main(String[] args) {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver .manage() .window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Set<Cookie> cookies=driver.manage().getCookies();
        for(Cookie c:cookies ){
            System.out.println(c);
        }
        driver.quit();
    }
}
