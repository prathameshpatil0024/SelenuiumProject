package com.company.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class AllDeleteCookies {
    public static void main(String[] args) {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipcart.com");
        driver .manage() .window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Cookie cookie=new Cookie("mechanical","engineer");
        driver.manage().addCookie(cookie);

        System.out.println("Fetch all cookie"+"@@@@@@@@@@@@@@@@@");
        Set<Cookie>cookies1=driver.manage().getCookies();
        for(Cookie c:cookies1){
            System.out.println(c);
        }
        System.out.println("Delete cookies"+"#############");
        driver.manage().deleteCookie(cookie);
        Set<Cookie>cookies2=driver.manage().getCookies();
        for(Cookie c:cookies2){
            System.out.println(c);
        }
        System.out.println("Delete All Cookies"+"$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        driver.manage().deleteAllCookies();
        Set<Cookie>cookies3=driver.manage().getCookies();
        for(Cookie c:cookies3){
            System.out.println(c);
        }
        driver.quit();


    }
}
