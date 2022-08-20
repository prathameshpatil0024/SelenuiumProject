package com.company.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class AddCookies {
    public static void main(String[] args) {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver .manage() .window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Cookie cookie=new Cookie("java","selenium");
        driver.manage().addCookie(cookie);

        Set<Cookie> cookies=driver.manage().getCookies();
        for(Cookie s:cookies){
            System.out.println(s);
        }
    }
}
