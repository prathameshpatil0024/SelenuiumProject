package com.company.fileupload;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Download1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\priyanka\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe") ;
        WebDriver driver=new ChromeDriver();
        driver.get("https://pune.11thadmission.org.in/Public/Home.aspx");
        driver .manage() .window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //program not run***********

        driver.findElement(By.xpath("//h5[@class='modal-title']//following::button"));
        Thread.sleep(3000);
        driver .switchTo().alert().dismiss();
        Thread.sleep(3000);

        WebElement c=driver.findElement(By.xpath("//span[text()='Cut-Off']"));
       c.click();
      driver.findElement(By.xpath("//span[text()='Cut-Off List Regular Round-3 (2021-22)']"));
      c .click();
      Thread.sleep(3000);
        driver.quit();

    }
}
