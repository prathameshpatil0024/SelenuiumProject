package com.company.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe") ;
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        System.out.println(driver.getTitle() );
        System.out.println(driver.getCurrentUrl() );
        driver.close() ;
    }
}
