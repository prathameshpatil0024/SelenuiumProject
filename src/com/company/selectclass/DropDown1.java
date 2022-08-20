package com.company.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html") ;

        WebElement dropdown=driver .findElement(By.name("country"));
        Select select=new Select(dropdown);

         select .selectByIndex(37);
        Thread .sleep(5000);
        driver .close() ;


    }
}
