package com.company.scrollupdown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpOrDown {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //navigate to url
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver .manage() .window().maximize();



        /**The syntax of ScrollBy() methods is :
         executeScript("window.scrollBy(x-pixels,y-pixels)");

         x-pixels is the number at x-axis, it moves to the left if number is positive and it move to the right if number is negative .
         y-pixels is the number at y-axis, it moves to the down if number is positive and it move to the up if number is in negative .
*/
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("windows.scrollBy(0,-500)");
        Thread.sleep(3000);
        driver.close();
    }
}
