package com.company.actionsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMouseAction {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver .manage() .window().maximize();

//        WebElement click=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        WebElement click=driver .findElement(By.xpath("//span[text()='right click me']"));

        Actions actions =new Actions(driver);
        actions .contextClick(click ).perform();
        Thread.sleep(5000);
        driver .close();



    }
}

