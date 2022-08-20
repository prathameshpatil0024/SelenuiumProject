package com.company.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

        WebElement drpDown=driver.findElement(By.name("Month")) ;

        Select select=new Select(drpDown);
        select .selectByValue("Ma");
        Thread .sleep(2000);
        select.selectByIndex(1);
        Thread .sleep(2000);
        select.selectByVisibleText("August");
        Thread .sleep(2000);
        select .selectByValue("Dec");
        Thread .sleep(2000);

        select .deselectByValue("Ma");
        Thread .sleep(2000);
        select .deselectByVisibleText("August");
        Thread .sleep(2000);
        select .deselectByIndex(1);
        Thread .sleep(2000);
        select .deselectByValue("Dec");
        Thread .sleep(2000);
        driver .close();

    }
}
