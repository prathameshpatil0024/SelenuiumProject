package com.company.keyboardbasedcommand;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.logging.FileHandler;

public class KeyDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/index.htm");

        WebElement searchString = driver.findElement(By.id("search-strings"));

        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.moveToElement(searchString).click().build().perform();
        actions.keyDown(Keys.SHIFT);
        actions.sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();

        Thread.sleep(5000);
        driver.close();
    }
}

