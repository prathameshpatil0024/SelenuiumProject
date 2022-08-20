package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        System.out.println(driver.findElement(By.id("disabled-button")).isEnabled());
        System.out.println(driver.findElement(By.id("enabled-button")).isEnabled());


        WebElement showelement=driver.findElement(By.id("show-textbox"));
        WebElement hideelement=driver .findElement(By.id("hide-textbox"));
        WebElement  display=driver .findElement(By.id("displayed-text"));


        System.out.println(display.isDisplayed());
        hideelement.click();
        Thread.sleep(3000);
        System.out.println(display.isDisplayed());
        showelement.click();
        Thread.sleep(3000);
        System.out.println(display.isDisplayed());
    }
}
