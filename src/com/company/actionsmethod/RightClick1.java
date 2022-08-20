package com.company.actionsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
        driver.manage().window().maximize();

        WebElement click = driver.findElement(By.xpath("//div[@id='div-context']"));
        Actions actions = new Actions(driver);
        actions.contextClick(click).perform();
        Thread.sleep(5000);
        driver.close();
    }
}
