package com.company.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        driver .findElement(By.id("confirmbtn")).click();
        Alert confirmation=driver.switchTo().alert();
        Thread.sleep(3000);
        confirmation.dismiss();
        Thread.sleep(3000);
        driver.close();

    }
}
