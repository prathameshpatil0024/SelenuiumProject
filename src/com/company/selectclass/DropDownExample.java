package com.company.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver() ;
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

        WebElement drpDown=driver .findElement(By.name("Month"));
        Select select=new Select(drpDown ) ;
        select.selectByVisibleText("August") ;
        Thread .sleep(5000);
        select .selectByIndex(12);
        Thread .sleep(5000);
        select .selectByValue("Ma");
        Thread .sleep(5000);
        driver .close() ;


    }
}
