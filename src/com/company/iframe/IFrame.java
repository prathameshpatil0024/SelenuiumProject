package com.company.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IFrame {
    public static void main(String[] args) {

        //run later

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        driver .findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

        WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerframe); //here we are passing frame as web element

        WebElement innerframe=driver .findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerframe);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("automation engineer");
         driver.quit();


    }
}
