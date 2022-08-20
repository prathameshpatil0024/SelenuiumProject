package com.company.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class upload {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver .manage() .window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement upload=driver.findElement(By.id("file-upload"));
        upload.sendKeys("C:\\Users\\priyanka\\Documents\\notepad\\20identifier example.txt");
        Thread.sleep(3000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
