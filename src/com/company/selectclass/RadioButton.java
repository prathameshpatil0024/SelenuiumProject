package com.company.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        WebElement redioBtn=driver.findElement(By.id("benzradio") );
        redioBtn .click() ;
        Thread .sleep(3000);
        driver.close() ;
    }
}
