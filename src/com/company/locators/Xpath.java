package com.company.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cg");

        //    Xpath=//tagname[@attribute=‘value’]

        driver.findElement(By.xpath("//u[text()='create a new account']")).click() ;
        Thread.sleep(3000);
        driver.close();
    }

}
