package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement element3 =driver.findElement(By.id("hondacheck"));
        WebElement element2 =driver.findElement(By.id("benzcheck"));
        System.out.println(element3.isSelected());
        element3.click();
        System.out.println(element2.isSelected());
        element2.click();
        System.out.println(element2.isSelected());
        Thread.sleep(2000);
        driver.close();
    }
}
