package com.company.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement element = driver.findElement(By.name("login"));
        element.sendKeys("prathamesh");
        Thread.sleep(3000);

        List<WebElement> elements = driver.findElements(By.tagName("div"));
        for (WebElement e : elements) {
            System.out.println(e);

        }
        driver .close() ;
    }
}
