package com.company.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DeleteCookies {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        Cookie cookie=new Cookie("kolhapur","city");
        driver.manage().addCookie(cookie);

        driver.manage().deleteCookieNamed("city") ;
        driver.manage().deleteCookie(cookie);

        Set<Cookie> cookies=driver.manage().getCookies();
        for(Cookie c:cookies){
            System.out.println(c);
        }
        driver.quit();
    }
}



