package com.company.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver .get("https://mail.rediff.com/cgi-bin/login.cgi");

         //By the Id(input[name'login']

        driver .findElement(By.cssSelector("input[name='login']")).sendKeys("prathamesh patil");
        //cssSelector also define by using #.different syntax using #. The ‘# ’ sign symbolizes the ‘ID ’ in CSS Selector.

        driver .findElement(By.cssSelector("input#login1") ).sendKeys("prathamesh123");
        Thread .sleep(3000);
        driver .close();
}
}