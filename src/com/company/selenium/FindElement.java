package com.company.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        /*WebElement element =driver.findElement(By.id("login1"));
        element .sendKeys("prathamesh1960@gmail.com");*/
        WebElement element=driver.findElement(By.id("password") ) ;
        element .sendKeys("prathamesh123");
        Thread .sleep(5000);
        driver.quit();
    }
}
