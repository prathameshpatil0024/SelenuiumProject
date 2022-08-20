package com.company.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");

        driver .findElement(By.id("prompt")).click();
        Alert alert =driver.switchTo().alert();
        Thread.sleep(3000);
        alert.sendKeys("prathamesh");
        alert.accept() ;
        Thread.sleep(3000);
        driver.close();

    }
}
